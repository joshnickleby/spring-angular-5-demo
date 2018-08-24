package com.astontech.angularspringtutorial.services;

import com.astontech.angularspringtutorial.domain.CharacterSheet;
import org.springframework.data.repository.CrudRepository;

public interface CharacterSheetRepository extends CrudRepository<CharacterSheet, Long> {
}