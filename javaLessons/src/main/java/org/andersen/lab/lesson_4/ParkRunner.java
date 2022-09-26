package org.andersen.lab.lesson_4;

public class ParkRunner {


    public static void main(String[] args) {
        Park park = new Park("Grodno Park");

        park.addAttraction("Stall", "09:00-18:00", 5);
        park.addAttraction("Swingboat", "11:00-21:00", 6);
        park.addAttraction("Ghost train", "13:00-23:00", 7);

        park.showPark();
    }
}
