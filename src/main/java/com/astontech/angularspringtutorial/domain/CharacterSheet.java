package com.astontech.angularspringtutorial.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
public class CharacterSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String race;

    public CharacterSheet() {}

    public CharacterSheet(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public CharacterSheet(Long id, String name, String race) {
        this(name, race);

        this.id = id;
    }


    //region LAME GETTERS
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }
    //endregion LAME GETTERS

    //region COOL GETTERS

    public Long id() { return this.id; }
    public String name() { return this.name; }
    public String race() { return this.race; }

    //endregion COOL GETTERS

    //region SETTER

    public CharacterSheet id(Long id) { this.id = id; return this; }
    public CharacterSheet name(String name) { this.name = name; return this; }
    public CharacterSheet race(String race) { this.race = race; return this; }

    //endregion SETTER


    public void printString() {
        String output = Stream.of("[id: ", id.toString(), ", name: ", name, ", race: ", race, "]")
                              .collect(Collectors.joining());

        System.out.println(output);
    }
}
