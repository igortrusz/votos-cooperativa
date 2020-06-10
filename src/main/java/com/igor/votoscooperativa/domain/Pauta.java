package com.igor.votoscooperativa.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pauta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Integer duracao_sessao;
	private Date inicio_sessao;
	private Date fim_sessao;
	
	@OneToMany(mappedBy = "id.pauta")
	private Set<Voto> votos = new HashSet<>();
	
	public Pauta() {
	}

	public Pauta(Integer id, String descricao, Integer duracao_sessao, Date inicio_sessao, Date fim_sessao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.duracao_sessao = duracao_sessao;
		this.inicio_sessao = inicio_sessao;
		this.fim_sessao = fim_sessao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getDuracao_sessao() {
		return duracao_sessao;
	}

	public void setDuracao_sessao(Integer duracao_sessao) {
		this.duracao_sessao = duracao_sessao;
	}

	public Date getInicio_sessao() {
		return inicio_sessao;
	}

	public void setInicio_sessao(Date inicio_sessao) {
		this.inicio_sessao = inicio_sessao;
	}

	public Date getFim_sessao() {
		return fim_sessao;
	}

	public void setFim_sessao(Date fim_sessao) {
		this.fim_sessao = fim_sessao;
	}

	public Set<Voto> getVotos() {
		return votos;
	}

	public void setVotos(Set<Voto> votos) {
		this.votos = votos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pauta other = (Pauta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
