package pe.edu.tecsup.mascotasapi.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.tecsup.mascotasapi.entity.Mascota;
import pe.edu.tecsup.mascotasapi.service.MascotaService;

@RestController
public class MascotasController {
	private static final Logger logger = LoggerFactory.getLogger(MascotasController.class);
	@Value("${app.storage.path}")
	private String STORAGEPATH;
	@Autowired
	private MascotaService productoService;

	@GetMapping("/productos")
	public List<Mascota> mascotas() {
		logger.info("call mascotas");
		List<Mascota> mascotas = productoService.findAll();
		logger.info("mascota: " + mascotas);
		return mascotas;
	}
}
