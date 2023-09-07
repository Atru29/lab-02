package pe.edu.tecsup.mascotasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.tecsup.mascotasapi.entity.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota,Integer>{

}
