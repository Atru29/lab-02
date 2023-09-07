package pe.edu.tecsup.duenoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.tecsup.duenoapi.entity.Dueño;

@Repository
public interface DueñoRepository extends JpaRepository<Dueño, Integer>{

}
