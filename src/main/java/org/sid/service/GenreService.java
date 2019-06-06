package org.sid.service;

import java.util.List;

import javax.validation.Valid;

import org.sid.InterfaceDao.GenreRepository;
import org.sid.entities.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class GenreService {
	
	@Autowired
	private GenreRepository genreRepository;
	
	@RequestMapping(value="/genres", method= RequestMethod.POST)
	public Genre SaveGenre(@Valid @RequestBody Genre i ){
		return genreRepository.save(i);
	}
	
	@RequestMapping(value="/genres", method=RequestMethod.GET)
	public List<Genre> getGenres(){
		return genreRepository.findAll();
	}
	
	@RequestMapping(value="/genres/{id}", method=RequestMethod.GET)
	public Genre getGenre(@PathVariable Long id){
		return genreRepository.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/genres/{id}", method=RequestMethod.PUT)
	public Genre updateGenre(@RequestBody Genre i){
		return genreRepository.save(i);
	}

}
