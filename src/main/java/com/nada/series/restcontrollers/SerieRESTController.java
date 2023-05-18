package com.nada.series.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.nada.series.entities.Serie;
//import com.nada.series.repos.SerieRepository;
import com.nada.series.service.SerieService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class SerieRESTController {
	@Autowired
	SerieService serieService;
	
	
	@RequestMapping(path="all", method = RequestMethod.GET)
	public List<Serie> getAllSeries() {
	return serieService.getAllSeries();
		
	}
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Serie getSerietById(@PathVariable("id") Long id) {
	return serieService.getSerie(id);}
	
	@RequestMapping(value="/addser",method = RequestMethod.POST)
	//@PostMapping("/addser")
	public Serie createProduit(@RequestBody Serie serie) {
	return serieService.saveSerie(serie);
	}
		    		  
		    		  
	@RequestMapping(value="/updateser",method = RequestMethod.PUT)
	public Serie updateSerie(@RequestBody Serie serie) {
	return serieService.updateSerie(serie);
	}
	@RequestMapping(value="/delser/{id}",method = RequestMethod.DELETE)
	public void deleteSerie(@PathVariable("id") Long id)
	{
	serieService.deleteSerieById(id);
	}
	@RequestMapping(value="/serstyp/{idType}",method = RequestMethod.GET)
	public List<Serie> getSeriesByTypeId(@PathVariable("idType") Long idType) {
	return serieService.findByTypeIdType(idType);
	}
	@RequestMapping(value="/sersByName/{nom}",method = RequestMethod.GET)
	public List<Serie> findByNomSerieContains(@PathVariable("nom") String nom) {
	return serieService.findByNomSerieContains(nom);
	}

	
}
