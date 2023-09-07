package pe.edu.tecsup.duenoapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.duenoapi.entity.Dueño;
import pe.edu.tecsup.duenoapi.repository.DueñoRepository;
import pe.edu.tecsup.duenoapi.service.DueñoService;

@Service
public class DueñoServiceImpl implements DueñoService{

	@Autowired
	private DueñoRepository dueñoRepository;
	
	@Override
	public List<Dueño> findAllDueño() {
	
		return dueñoRepository.findAll();
	}

	@Override
	public Dueño save(Dueño dueño) {

		return dueñoRepository.save(dueño);
	}

	@Override
	public Dueño editDueño(Dueño dueño) {
		return dueñoRepository.save(dueño);
	}

	@Override
	public void eliminarDueño(Integer id) {
		dueñoRepository.deleteById(id);
	}

	@Override
	public Dueño findByDueñoId(Integer id) {
		Optional<Dueño> dueñoOptional = dueñoRepository.findById(id);
		Dueño alumno = new Dueño();
		if (dueñoOptional.isPresent()) {
			return dueñoOptional.get();
		}else {
			throw new RuntimeException("No existe un usuario con el Id " + id);
		}
	}

}
