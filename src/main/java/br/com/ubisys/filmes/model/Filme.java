package br.com.ubisys.filmes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Filme  implements Serializable {

	private static final long serialVersionUID = 1L;

	
	
	@Id
	@SequenceGenerator(name = "post_seq", sequenceName = "post_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
	private Long id;
	
	@Column(nullable = false, length = 500)
	private String foto;
	
	@Column(nullable = false, length = 50)
	private String titulo;
	
	@Column(nullable = false, length = 500)
	private String descricao;
	
	@Column(nullable = false, length = 50)
	private String imdb;
	
	public Filme() {}
	
	public Filme(String titulo, String descricao, String imdb, String foto) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.imdb = imdb;
		this.foto = foto;
	}
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}
	
	

}
