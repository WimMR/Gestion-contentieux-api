package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.inti.enums.Priorite;

@Entity
@Table(name="TACHES")
public class Tache {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String description;
	
	private Date dateLimite;
	
	@ManyToOne
	private User owner;
	
	@ManyToMany
	private List<User> collaborators = new ArrayList<>();
	
	@OneToOne(mappedBy="tacheCase")
	private Case caseTache;
	
	@Enumerated(EnumType.STRING)
	private Priorite priorite;
	
	
	private boolean isShared;
	private boolean isFinished;
	
	
	public Tache ()
	{
		
	}
	public Tache(String title, String description, Date dateLimite, User owner, List<User> collaborators,
			Priorite priorite, boolean isShared, boolean isFinished) {
		super();
		this.title = title;
		this.description = description;
		this.dateLimite = dateLimite;
		this.owner = owner;
		this.collaborators = collaborators;
		this.priorite = priorite;
		this.isShared = isShared;
		this.isFinished = isFinished;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateLimite() {
		return dateLimite;
	}
	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public List<User> getCollaborators() {
		return collaborators;
	}
	public void setCollaborators(List<User> collaborators) {
		this.collaborators = collaborators;
	}
	public Priorite getPriorite() {
		return priorite;
	}
	public void setPriorite(Priorite priorite) {
		this.priorite = priorite;
	}
	public boolean isShared() {
		return isShared;
	}
	public void setShared(boolean isShared) {
		this.isShared = isShared;
	}
	public boolean isFinished() {
		return isFinished;
	}
	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	@Override
	public String toString() {
		return "Tache [id=" + id + ", title=" + title + ", description=" + description + ", dateLimite=" + dateLimite
				+ ", owner=" + owner + ", collaborators=" + collaborators + ", priorite=" + priorite + ", isShared="
				+ isShared + ", isFinished=" + isFinished + "]";
	}
	
	
	
	
	
}
