package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity //anotacao obrigatoria
@Table(name="TB_PASTE")
/*
 * 
 * name : nome no java(generator)
 * sequenceName : nome no banco
 * allocationSize : passo(um-a-um) 
 * 
 * */
@SequenceGenerator(name="pastel", sequenceName="SQ_TB_PASTEL", allocationSize=1)
public class Pastel {

	@Id
	@GeneratedValue(generator="pastel", strategy=GenerationType.SEQUENCE)
	private int codigo;
	private String sabor;
	private float preco;
	private boolean especial;
	private Massa massa;
	
	
	

}
