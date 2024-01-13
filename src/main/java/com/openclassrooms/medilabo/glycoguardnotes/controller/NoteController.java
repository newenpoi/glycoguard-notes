package com.openclassrooms.medilabo.glycoguardnotes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.openclassrooms.medilabo.glycoguardnotes.business.Note;
import com.openclassrooms.medilabo.glycoguardnotes.service.NoteService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class NoteController {
	
	private final NoteService noteService;
	
	@GetMapping("/notes/{id}")
	public List<Note> getNotesPatient(@PathVariable Long id) {
		return noteService.recupererNotesPatient(id);
	}
}
