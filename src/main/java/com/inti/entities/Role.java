package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRole;
	private String libelle;

	public Role() {
	}

	public Role(String libelle) {
	}

	public Role(Long idRole, String libelle) {
		this.idRole = idRole;
		this.libelle = libelle;
	}

	public Long getId() {
		return idRole;
	}

	public void setId(Long idRole) {
		this.idRole = idRole;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Role [id=" + idRole + ", libelle=" + libelle + "]";
	}

}
