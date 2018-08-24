package com.astontech.angularspringtutorial.bootstrap;

import com.astontech.angularspringtutorial.domain.CharacterSheet;
import com.astontech.angularspringtutorial.services.CharacterSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class Seeder implements ApplicationListener<ContextRefreshedEvent> {

    private CharacterSheetService characterSheetService;

    @Autowired
    public Seeder(CharacterSheetService characterSheetService) {
        this.characterSheetService = characterSheetService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        createSomeSheets();
    }

    private Function<Integer, CharacterSheet> buildSheet(String[] names, String ... races) {
        return i -> new CharacterSheet(names[i], races[i]);
    }

    public void createSomeSheets() {
        String[] names = {"Johans", "Tyler", "Tony", "Michael", "Michael", "Josh", "Bipin", "Eric", "David", "Charles"};
        String[] races = {"Elf", "Gnome", "Halfling", "Half-Orc", "Half-Elf", "Kenku", "Dwarf", "Ogre", "Human", "Tabaxi"};

        List<CharacterSheet> characterSheets = IntStream.range(0, names.length).boxed()
                                                                                .map(buildSheet(names, races))
                                                                                .collect(Collectors.toList());

        characterSheetService.saveList(characterSheets).forEach(CharacterSheet::printString);
    }
}
