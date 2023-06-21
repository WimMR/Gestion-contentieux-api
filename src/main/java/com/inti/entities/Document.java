package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DOCUMENTS")
public class Document implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDocument;
	private Date creationDateDoc;
	private String nameDoc;
	private String descriptionDoc;
	
	@ManyToOne
	@JoinColumn(name="idCase")
	private Case caseDocument;
	
	public Document() {
		
	}
	

	public Document(Date creationDateDoc, String nameDoc, String descriptionDoc, Case caseDocument) {
		super();
		this.creationDateDoc = creationDateDoc;
		this.nameDoc = nameDoc;
		this.descriptionDoc = descriptionDoc;
		this.caseDocument = caseDocument;
	}


	public Long getIdDocument() {
		return idDocument;
	}


	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
	}


	public Date getCreationDateDoc() {
		return creationDateDoc;
	}

	public void setCreationDateDoc(Date creationDateDoc) {
		this.creationDateDoc = creationDateDoc;
	}

	public String getNameDoc() {
		return nameDoc;
	}

	public void setNameDoc(String nameDoc) {
		this.nameDoc = nameDoc;
	}

	public String getDescriptionDoc() {
		return descriptionDoc;
	}

	public void setDescriptionDoc(String descriptionDoc) {
		this.descriptionDoc = descriptionDoc;
	}

	public Case getCaseDocument() {
		return caseDocument;
	}

	public void setCaseDocument(Case caseDocument) {
		this.caseDocument = caseDocument;
	}


	@Override
	public String toString() {
		return "Document [idDocument=" + idDocument + ", creationDateDoc=" + creationDateDoc + ", nameDoc=" + nameDoc
				+ ", descriptionDoc=" + descriptionDoc + "]";
	}
	

}
