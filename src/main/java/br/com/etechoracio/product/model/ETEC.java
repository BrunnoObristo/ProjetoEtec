package br.com.etechoracio.product.model;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity

@Table(name="ETEC")
public class ETEC {

	
	@Id
	@GeneratedValue
	@Column(name="ID_ETEC")
	private Long Id;
	
	@Column(name="NM_ETEC")
	private String Nome;
	
	@Column(name="CDG_ETEC")
	private Long Codigo;
	
	@Column(name="DT_CRIACAO")
	@Temporal(TemporalType.DATE)
	private Date dataCriacao;
	
	@Column(name="CEP")
	private Long CEP;
	
	@Column(name="Endereco")
	private String Endereco; 
	
	@Column(name="BAIRRO")
	private String Bairro;
	
	@Column(name="CIDADE")
	private String Cidade;
}
