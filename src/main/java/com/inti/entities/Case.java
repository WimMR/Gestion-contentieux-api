package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CASES")
public class Case implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCase;
	private String referenceCase;
	private String titleCase;
	private String descriptionCase;
	private int status;
	
	@OneToMany(mappedBy="caseDocument" /*,cascade = CascadeType.ALL, fetch=FetchType.LAZY*/)
	private List<Document> documents =new ArrayList<>();
	
	
	public Case() {
		
	}


	public Case(String referenceCase, String titleCase, String descriptionCase, int status, List<Document> documents) {
		super();
		this.referenceCase = referenceCase;
		this.titleCase = titleCase;
		this.descriptionCase = descriptionCase;
		this.status = status;
		this.documents = documents;
	}


	public Long getIdCase() {
		return idCase;
	}


	public void setIdCase(Long idCase) {
		this.idCase = idCase;
	}


	public String getReferenceCase() {
		return referenceCase;
	}


	public void setReferenceCase(String referenceCase) {
		this.referenceCase = referenceCase;
	}


	public String getTitleCase() {
		return titleCase;
	}


	public void setTitleCase(String titleCase) {
		this.titleCase = titleCase;
	}


	public String getDescriptionCase() {
		return descriptionCase;
	}


	public void setDescriptionCase(String descriptionCase) {
		this.descriptionCase = descriptionCase;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public List<Document> getDocuments() {
		return documents;
	}


	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}


	@Override
	public String toString() {
		return "Case [idCase=" + idCase + ", referenceCase=" + referenceCase + ", titleCase=" + titleCase
				+ ", descriptionCase=" + descriptionCase + ", status=" + status + ", documents=" + documents + "]";
	}
	

}
