package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

    @Test
    void testAnimalListItemToString() {
        //GIVEN
        Animal animal = new Animal();
        animal.setName("Tiger");
        AnimalListItem animalListItem = new AnimalListItem(animal);
        //WHEN
        String actual = animalListItem.toString();
        //THEN
        assertEquals("AnimalListItem{value=Animal{name='Tiger'}, next=null}", actual);
    }
}