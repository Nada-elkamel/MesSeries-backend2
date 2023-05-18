package com.nada.series.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

//import com.nada.series.entities.Type;

@Entity
public class Serie {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idSerie;
private String nomSerie;
private String langue;
private Date dateDiffusion;

@ManyToOne
private Type type;

@OneToOne
private Image image;

public Serie() {
	super();
}


public Serie(String nomSerie, String langue, Date dateDiffusion,Type typs) {
	super();
	this.nomSerie = nomSerie;
	this.langue = langue;
	this.dateDiffusion = dateDiffusion;
	this.type=type;
	
}


public Long getIdSerie() {
	return idSerie;
}
public void setIdSerie(Long idSerie) {
	this.idSerie = idSerie;
}
public String getNomSerie() {
	return nomSerie;
}
public void setNomSerie(String nomSerie) {
	this.nomSerie = nomSerie;
}
public String getLangue() {
	return langue;
}
public void setLangue(String langue) {
	this.langue = langue;
}
public Date getDateDiffusion() {
	return dateDiffusion;
}
public void setDateDiffusion(Date dateDiffusion) {
	this.dateDiffusion = dateDiffusion;
}


@Override
public String toString() {
	return "Serie [idSerie=" + idSerie + ", nomSerie=" + nomSerie + ", langue=" + langue + ", dateDiffusion="
			+ dateDiffusion + "]";
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type=type;
}


public Image getImage() {
	return image;
}


public void setImage(Image image) {
	this.image = image;
}


	
}
