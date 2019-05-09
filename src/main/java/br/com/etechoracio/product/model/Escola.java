package br.com.etechoracio.product.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="ETEC")
public class Escola {

	@Id
	@GeneratedValue
	@Column(name="ID_ETEC")
	private Long Id;
	
	@Column(name="NM_ETEC")
	private String Nome;
	
	@Column(name="CDG_ETEC")
	private Long Código;
	
	@Column(name="DT_CRIACAO")
	@Temporal(TemporalType.DATE)
	private Date dataCriacao;
	
}
