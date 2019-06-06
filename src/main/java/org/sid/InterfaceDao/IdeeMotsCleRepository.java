package org.sid.InterfaceDao;

import org.sid.entities.Idee;
import org.sid.entities.IdeeMotsCle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface IdeeMotsCleRepository extends JpaRepository<IdeeMotsCle, Long> {

}
