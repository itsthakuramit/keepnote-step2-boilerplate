package com.stackroute.keepnote.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/*
 * The class "Note" will be acting as the data model for the note Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 */

@Entity
public class Note {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int noteId;
	@Column(length=10)
	private String noteTitle;
	@Column(length=50)
	private String noteContent;	
	@Column(length=10)
	private String noteStatus;	
	private LocalDateTime createdAt;
	
	
	public Note() {

	}

	public Note(int i, String string, String string2, String string3, LocalDateTime localDate) {
		super();
		noteId = i;
		noteTitle = string;
		noteContent = string2;
		noteStatus = string3;
		createdAt = localDate;
	}

	public int getNoteId() {

		return noteId;
	}

	public String getNoteTitle() {

		return noteTitle;
	}

	public String getNoteContent() {

		return noteContent;
	}

	public String getNoteStatus() {

		return noteStatus;
	}

	public void setNoteId(int parseInt) {
		noteId=parseInt;
	}

	public void setNoteTitle(String parameter) {
		noteTitle=parameter;
	}

	public void setNoteContent(String parameter) {
		noteContent=parameter;
	}

	public void setNoteStatus(String parameter) {
		noteStatus=parameter;
	}

	public void setCreatedAt(LocalDateTime now) {
		createdAt=now;
	}

}
