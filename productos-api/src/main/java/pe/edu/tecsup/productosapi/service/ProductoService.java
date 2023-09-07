package pe.edu.tecsup.productosapi.service;

import java.util.List;

import pe.edu.tecsup.productosapi.entity.Producto;

public interface ProductoService {
	
	public List<Producto> findAll();

	public Producto findById(Long id);

	public void save(Producto producto);

	public void deleteById(Long id);
}