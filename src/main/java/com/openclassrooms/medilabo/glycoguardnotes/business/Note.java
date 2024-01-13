package com.openclassrooms.medilabo.glycoguardnotes.business;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "notes")
@Getter
@Setter
public class Note {
	@Id
	private String id;
	
	private Long patId;
	private String patient;
	private String note;
}
