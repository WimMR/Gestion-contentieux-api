package com.inti.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "USERS", schema = "gestion_contentieux_db")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	
	
	private String email;
	private String nomUtilisateur;
	private String prenomUtilisateur ;
	
	@OneToMany
	@JsonIgnore
	private List<tache> taches;
	
	public User() {
		
	}

	public User(Long idUtilisateur, String email, String nomUtilisateur, String prenomUtilisateur, List<tache> taches) {
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.taches = taches;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public List<tache> getTaches() {
		return taches;
	}

	public void setTaches(List<tache> taches) {
		this.taches = taches;
	}

	@Override
	public String toString() {
		return "User [idUtilisateur=" + idUtilisateur + ", email=" + email + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + "]";
	}
	
	
	
	

}
