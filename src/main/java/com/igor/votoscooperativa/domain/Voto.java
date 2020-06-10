package com.igor.votoscooperativa.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Voto implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@EmbeddedId
	private VotoPK id = new VotoPK();

	private Boolean opcao;

	public Voto() {

	}

	public Voto(Pauta pauta, Associado associado, Boolean opcao) {
		super();
		id.setPauta(pauta);
		id.setAssociado(associado);
		this.opcao = opcao;
	}

	@JsonIgnore
	public Pauta getPauta() {
		return id.getPauta();
	}

	public void setPauta(Pauta pauta) {
		id.setPauta(pauta);
	}

	@JsonIgnore
	public Associado getAssociado() {
		return id.getAssociado();
	}

	public void setAssociado(Associado associado) {
		id.setAssociado(associado);
	}

	public VotoPK getId() {
		return id;
	}

	public void setId(VotoPK id) {
		this.id = id;
	}

	public Boolean getOpcao() {
		return opcao;
	}

	public void setOpcao(Boolean opcao) {
		this.opcao = opcao;
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
		Voto other = (Voto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
