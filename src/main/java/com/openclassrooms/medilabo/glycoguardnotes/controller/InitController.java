package com.openclassrooms.medilabo.glycoguardnotes.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@Order(1)
@AllArgsConstructor
public class InitController implements CommandLineRunner {
	
	public void run(String... args) throws Exception {
		// Ajoute les notes des patients dans la collection notes de la base glycoguard.
	}
}
