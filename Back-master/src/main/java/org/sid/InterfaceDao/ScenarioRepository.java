package org.sid.InterfaceDao;

import org.sid.entities.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface ScenarioRepository extends JpaRepository<Scenario, Long> {

}
