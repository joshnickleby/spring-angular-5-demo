package com.astontech.angularspringtutorial.rest;

import com.astontech.angularspringtutorial.domain.CharacterSheet;
import com.astontech.angularspringtutorial.services.CharacterSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/character-sheets")
public class CharacterSheetRest {

    private CharacterSheetService characterSheetService;

    @Autowired
    public CharacterSheetRest(CharacterSheetService characterSheetService) {
        this.characterSheetService = characterSheetService;
    }


    @GetMapping("/")
    public List<CharacterSheet> getCharacterSheets() {
        System.out.println("CharacterSheetRest.getCharacterSheets");

        return characterSheetService.list();
    }
}
