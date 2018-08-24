package com.astontech.angularspringtutorial.services;

import com.astontech.angularspringtutorial.domain.CharacterSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterSheetServiceImpl implements CharacterSheetService {

    private CharacterSheetRepository characterSheetRepository;

    @Autowired
    public CharacterSheetServiceImpl(CharacterSheetRepository characterSheetRepository) {
        this.characterSheetRepository = characterSheetRepository;
    }

    @Override
    public CharacterSheet getById(Long id) {
        return getById(characterSheetRepository, id, CharacterSheet::new);
    }

    @Override
    public List<CharacterSheet> list() {
        return list(characterSheetRepository, true);
    }

    @Override
    public CharacterSheet save(CharacterSheet characterSheet) {
        return save(characterSheetRepository, characterSheet);
    }

    @Override
    public List<CharacterSheet> saveList(List<CharacterSheet> list) {
        return saveList(characterSheetRepository, list);
    }

    @Override
    public boolean delete(Long id) {
        return delete(characterSheetRepository, id);
    }

    @Override
    public boolean exists(Long id) {
        return exists(characterSheetRepository, id);
    }
}