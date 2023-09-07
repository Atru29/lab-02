package pe.edu.tecsup.duenoapi.controllers;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.tecsup.duenoapi.entity.Dueño;
import pe.edu.tecsup.duenoapi.service.DueñoService;
@RestController
public class DueñoController {

	
	@Autowired
	private DueñoService dueñoService;

	private static final Logger logger = LoggerFactory.getLogger(DueñoController.class);
	@Value("${app.storage.path}")
	private String STORAGEPATH;
	
	@GetMapping("/listarDueño")
	public List<Dueño> listarRegistrosDueño() {
		return dueñoService.findAllDueño();
	}
	@PostMapping("/guardarDueño")
    public Dueño saveDueñoo(@RequestBody Dueño alumno) {
        return dueñoService.save(alumno);
    }

    @PutMapping("/editDueño")
    public Dueño editDueño(@RequestBody Dueño alumno) {
        return dueñoService.editDueño(alumno);
    }

    @DeleteMapping("/elminarDueño/{id}")
    public void deleteDueño(@PathVariable("id") Integer id) {
    	dueñoService.eliminarDueño(id);
    }

    @GetMapping("/buscarDueñoId/{id}")
    public Dueño alumnoPorId(@PathVariable("id") Integer id) {
        return dueñoService.findByDueñoId(id);
    }
	
    @GetMapping("/dueños/images/{filename:.+}")
	public ResponseEntity<Resource> files(@PathVariable String filename) throws Exception {

		logger.info("call images: " + filename);
		Path path = Paths.get(STORAGEPATH).resolve(filename);
		logger.info("Path: " + path);
		if (!Files.exists(path)) {
			return ResponseEntity.notFound().build();
		}
		Resource resource = new UrlResource(path.toUri());
		logger.info("Resource: " + resource);
		return ResponseEntity.ok()

				.header(HttpHeaders.CONTENT_DISPOSITION, "inline;filename=\"" + resource.getFilename() + "\"")

				.header(HttpHeaders.CONTENT_TYPE, Files.probeContentType(Paths.get(STORAGEPATH).resolve(filename)))
				.header(HttpHeaders.CONTENT_LENGTH,

						String.valueOf(resource.contentLength()))
				.body(resource);

	}
}
