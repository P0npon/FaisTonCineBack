package org.sid;

import java.util.Date;
import java.util.Set;

import org.hibernate.Session;
import org.sid.InterfaceDao.CategorieRepository;
import org.sid.InterfaceDao.GenreRepository;
import org.sid.InterfaceDao.IdeeRepository;
import org.sid.InterfaceDao.MotsCleeRepository;
import org.sid.InterfaceDao.TypeIdeeRepository;
import org.sid.entities.Categorie;
import org.sid.entities.Genre;
import org.sid.entities.Idee;
import org.sid.entities.IdeeCategorie;
import org.sid.entities.MotsCle;
import org.sid.entities.TypeIdee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author User Soufiane
 *2018
 */
@SpringBootApplication
public class FaitsToncineApplication implements CommandLineRunner {
	
	@Autowired
	IdeeRepository idee ;
	@Autowired
	GenreRepository genre;
	@Autowired
	TypeIdeeRepository typeIdee;
	@Autowired
	CategorieRepository categorie;
	
	@Autowired
	MotsCleeRepository motsClee;
	public static void main(String[] args) {
		SpringApplication.run(FaitsToncineApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
//typeIdee.save(new TypeIdee("Situation"));
//typeIdee.save(new TypeIdee("Autre"));
//genre.save(new Genre("Drame"));
//		
//		
//		Categorie cg=categorie.save(new Categorie("une idée jamais vue"));
		
//		idee.save(new Idee(new Date(),"Paul, est marié à Sali. Tout irait pour le mieux dans leur vie s’ils arrivaient à avoir un "
//				+ "enfant.  Un jour, Sali reçoit l’appel qu’ils attendaient depuis si longtemps : leur dossier d’adoption est approuvé. "
//				+ "Il est adorable, il a 6 mois, il s’appelle Benjamin, "
//				+ "il est blond aux yeux bleus… Il est blanc, ils sont noirs. "
//				+ " Pour la famille de Sali, c’est le choc !","Il a déjà tes yeux",g1,t2));
//		
//		
		// TODO Auto-generated method stub
/*		motsClee.save(new MotsCle("voleur"));
		motsClee.save(new MotsCle("urgence"));
		motsClee.save(new MotsCle("police"));
		motsClee.save(new MotsCle("crime"));
		motsClee.save(new MotsCle("test22"));
*/		
//		typeIdee.save(new TypeIdee("Perssonage"));
//	
		//genre.save(new Genre("Comedie"));
		//genre.save(new Genre("Action"));
//		genre.save(new Genre("Horreur"));
//		
//		categorie.save(new Categorie("basée sur des faits réels"));
//		categorie.save(new Categorie("une référence à une histoire classique"));
//		categorie.save(new Categorie("sans catégorie"));


	}
}
