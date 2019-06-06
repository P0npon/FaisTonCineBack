package org.sid.InterfaceDao;

import java.util.List;
import java.util.Set;

import org.sid.entities.Genre;
import org.sid.entities.Idee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@RepositoryRestResource
public interface IdeeRepository extends JpaRepository<Idee, Long> {
	
	@Query("select i.idee from Idee i")
	public Set<String> getIdeeByidee();
	
	@Query("select i.idee from Idee i where i.genre.idGenre = :g and i.typeIdee.idTypeIdee = :ti")
	public Set<String> getIdeeByGenre(@Param("g") Long g, @Param("ti") Long ti);
	
	public Idee findByIdee(String i);

}
