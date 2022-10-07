package org.andersen.lab.lesson_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private HashMap<String, List<String>> book;

    public Phonebook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number) {
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println("Phonenumber: " + number + " is added for the surname: " + surname + ".");
            } else {
                System.out.println("Phonenumber: " + number + " already exists for the surname: " + surname + ".");
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println("Phonenumber: " + number + " is added for the surname: " + surname + ".");
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println("There are no records for the surname: " + surname + ".");
            return new ArrayList<>();
        }
    }


}
