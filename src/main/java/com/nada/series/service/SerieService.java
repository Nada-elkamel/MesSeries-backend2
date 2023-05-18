package com.nada.series.service;

import java.util.List;

import com.nada.series.entities.Serie;
import com.nada.series.entities.Type;

public interface SerieService {

	Serie saveSerie(Serie s);
	Serie updateSerie(Serie s);
	void deleteSerie(Serie s);
	void deleteSerieById(Long id);
	Serie getSerie(Long id);
	List<Serie> getAllSeries();
	
	List<Serie> findByNomSerie(String nom);
	List<Serie> findByNomSerieContains(String nom);
	List<Serie> findByNomLangue (String nom, String langue);
	List<Serie> findByType (Type type);
	List<Serie> findByTypeIdType(Long id);
	List<Serie> findByOrderByNomSerieAsc();
	List<Serie> trierSeriesNomsLangue();
	
}
