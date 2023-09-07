package pe.edu.tecsup.productosapi.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import pe.edu.tecsup.productosapi.entity.Producto;
public interface ProductoRepository extends CrudRepository<Producto, Long> {
	@Override
	List<Producto> findAll();
}
