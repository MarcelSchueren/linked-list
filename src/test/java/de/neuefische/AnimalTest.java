package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testAnimalToString() {
        //GIVEN
        Animal animal = new Animal();
        animal.setName("Katze");
        //WHEN
        String actual = animal.toString();
        //THEN
        assertEquals("Animal{name='Katze'}", actual);

    }
}