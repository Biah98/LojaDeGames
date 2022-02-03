package org.com.generation.LojaDeGames.LojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Categoria {

	@Id // Criando a primary key de tb_categoria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Fazendo auto-increment
	private long id;
	
	@NotNull // O tipo do produto não pode ser nulo
	@Size(min = 5) //Min 5 carac.
	private String tipo;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}
