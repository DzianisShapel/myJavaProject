package org.andersen.lab.lesson_8;

public class PhonebookRunner {


    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Barlowe", "810-787-1758");
        phonebook.add("Barlowe", "856-577-0374");
        phonebook.add("Caddel", "980-239-0988");
        phonebook.add("Hart", "417-860-0441");
        phonebook.add("Katz", "972-414-3134");
        phonebook.add("Katz", "972-414-3134");
        phonebook.add("Madden", "717-477-7896");
        phonebook.add("Elrod", "805-487-9746");

        System.out.println(phonebook.get("Barlowe"));
        System.out.println(phonebook.get("Elrod"));
    }

}
