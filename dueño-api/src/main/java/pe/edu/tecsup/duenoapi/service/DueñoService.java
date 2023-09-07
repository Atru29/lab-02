package pe.edu.tecsup.duenoapi.service;

import java.util.List;

import pe.edu.tecsup.duenoapi.entity.Dueño;


public interface DueñoService {

	public List<Dueño> findAllDueño();
	
	public Dueño save(Dueño dueño);
	
	public Dueño editDueño(Dueño dueño);
	
	void eliminarDueño(Integer id);
	
	public Dueño findByDueñoId(Integer id);
}
