package org.sid.service;

import java.util.List;

import javax.validation.Valid;

import org.sid.InterfaceDao.TypeIdeeRepository;
import org.sid.entities.TypeIdee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class TypeIdeeService {

	@Autowired
	private TypeIdeeRepository typeIdeeRepository;
	
	@RequestMapping(value="/typeIdees", method= RequestMethod.POST)
	public TypeIdee SaveTypeIdee(@Valid @RequestBody TypeIdee i ){
		return typeIdeeRepository.save(i);
	}
	
	@RequestMapping(value="/typeIdees", method=RequestMethod.GET)
	public List<TypeIdee> getTypeIdees(){
		return typeIdeeRepository.findAll();
	}
	
	@RequestMapping(value="/typeIdees/{id}", method=RequestMethod.GET)
	public TypeIdee getTypeIdee(@PathVariable Long id){
		return typeIdeeRepository.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/typeIdees/{id}", method=RequestMethod.PUT)
	public TypeIdee updateTypeIdee(@RequestBody TypeIdee i){
		return typeIdeeRepository.save(i);
	}
	
}
