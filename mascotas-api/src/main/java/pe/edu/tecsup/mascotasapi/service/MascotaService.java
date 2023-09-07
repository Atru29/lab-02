package pe.edu.tecsup.mascotasapi.service;

import java.util.List;

import pe.edu.tecsup.mascotasapi.entity.Mascota;


public interface MascotaService {
	public List<Mascota> findAll();

	public Mascota findById(Integer id);

	public void save(Mascota mascota);

	public void deleteById(Integer id);
}
