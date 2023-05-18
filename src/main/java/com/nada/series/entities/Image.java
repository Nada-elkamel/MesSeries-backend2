package com.nada.series.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idImage ;
	 private String name ;
	 private String type ;
	 @Column( name = "IMAGE" , length = 4048576 )
	 @Lob
	 private byte[] image;
	 @OneToOne
	 private Serie serie;

}