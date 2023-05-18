package com.nada.series.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nada.series.entities.Serie;
import com.nada.series.entities.Type;
import com.nada.series.repos.ImageRepository;
import com.nada.series.repos.SerieRepository;

@Service
public class SerieServiceImpl implements SerieService {

	@Autowired
	SerieRepository serieRepository;
	
	@Autowired
	ImageRepository imageRepository;
	
	@Override
	public Serie saveSerie(Serie s) {
		return serieRepository.save(s);
	}

//	@Override
//	public Serie updateSerie(Serie s) {
//		return serieRepository.save(s);
//	}

	@Override
	public Serie updateSerie(Serie s) {
		Long oldProdImageId = this.getSerie(s.getIdSerie()).getImage().getIdImage();
		Long newProdImageId = s.getImage().getIdImage();
		Serie prodUpdated = serieRepository.save(s);
		if (oldProdImageId != newProdImageId) // si l'image a été modifiée
			imageRepository.deleteById(oldProdImageId);
		return prodUpdated;
	}

	@Override
	public void deleteSerie(Serie s) {
		serieRepository.delete(s);
	}

	@Override
	public void deleteSerieById(Long id) {
		serieRepository.deleteById(id);
	}

	@Override
	public Serie getSerie(Long id) {
		return serieRepository.findById(id).get();
	}

	@Override
	public List<Serie> getAllSeries() {
		return serieRepository.findAll();
	}

	@Override
	public List<Serie> findByNomSerie(String nom) {
		return serieRepository.findByNomSerie(nom);
	}

	@Override
	public List<Serie> findByNomSerieContains(String nom) {
		return serieRepository.findByNomSerieContains(nom);
	}

	@Override
	public List<Serie> findByNomLangue(String nom, String langue) {
		return serieRepository.findByNomLangue(nom, langue);
	}

	@Override
	public List<Serie> findByType(Type type) {
		return serieRepository.findByType(type);

	}

	@Override
	public List<Serie> findByTypeIdType(Long id) {
		return serieRepository.findByTypeIdType(id);
	}

	@Override
	public List<Serie> findByOrderByNomSerieAsc() {
		return serieRepository.findByOrderByNomSerieAsc();

	}

	@Override
	public List<Serie> trierSeriesNomsLangue() {
		return serieRepository.trierSeriesNomsLangue();
	}

}
