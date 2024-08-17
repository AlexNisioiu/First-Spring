package org.fasttrack.first_spring.OldStyle;

public class PersonControler {
    private final PersonService personService;

    public PersonControler(PersonService personService) {
        this.personService = personService;
    }
}
