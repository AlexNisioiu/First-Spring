package org.fasttrack.first_spring.OldStyle;

public class Main {
    public static void main(String[] args) {
        new PersonControler(new PersonService(new PersonRepository("mysql","admin","pass")));

    }
}
