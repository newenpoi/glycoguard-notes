package com.openclassrooms.medilabo.glycoguardnotes.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.openclassrooms.medilabo.glycoguardnotes.business.Note;
import com.openclassrooms.medilabo.glycoguardnotes.dao.NoteDao;
import com.openclassrooms.medilabo.glycoguardnotes.service.NoteService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {

	private final NoteDao noteDao;
	
	/**
	 * Récupère les notes correspondant au nom du patient.
	 */
	@Override
	public List<Note> recupererNotesPatient(String name) {
		return noteDao.findByPatient(name);
	}

	/**
	 * Récupère les notes correspondant à l'identifiant du patient.
	 */
	@Override
	public List<Note> recupererNotesPatient(Long patId) {
		return noteDao.findByPatId(patId);
	}

}
