package br.com.etechoracio.product.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="ENDER_ETEC")
public class Endereço {

	@Id
	@GeneratedValue
	@Column(name="CEP")
	private Long CEP;
	
	@Column(name="ENDERECO")
	private String Endereço;
	
	@Column(name="BAIRRO")
	private String Bairro;
	
	@Column(name="CIDADE")
	private String Cidade;
	
}
