package pe.edu.tecsup.mascotasapi.service.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.mascotasapi.entity.Mascota;
import pe.edu.tecsup.mascotasapi.repository.MascotaRepository;
import pe.edu.tecsup.mascotasapi.service.MascotaService;

@Service
public class MascotaServiceImpl implements MascotaService {

	@Autowired
	private MascotaRepository mascotaRepository;

	@Override
	public List<Mascota> findAll() {

		return mascotaRepository.findAll();
	}

	@Override
	public Mascota findById(Integer id) {

		return mascotaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe registro"));
	}

	@Override
	public void save(Mascota mascota) {
		mascotaRepository.save(mascota);
	}

	@Override
	public void deleteById(Integer id) {
		mascotaRepository.deleteById(id);
	}

}
