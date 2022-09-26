package org.andersen.lab.lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private String name;

    List<Attraction> attractionList = new ArrayList<>();

    public Park () {}

    public Park(String name) {
        this.name = name;
    }

    public String getPark() {
        return name;
    }

    public void addAttraction(String name, String workingHours, int cost) {
        attractionList.add(new Park.Attraction(name, workingHours, cost));
    }

    public void showPark() {
        System.out.println("Our " + getPark() + " consists of " + attractionList.size() + " attractions.");
        for (Attraction attraction: attractionList) {
            System.out.println(attraction.getAttractionName() + " has working hours " + attraction.getWorkingHours() +
                    " and cost " + attraction.getCost());
        }
    }



    private class Attraction {
        private String attractionName;
        private String workingHours;
        private int cost;

        public Attraction() {
        }

        public Attraction(String attractionName, String workingHours, int cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public void setAttractionName(String attractionName) {
            this.attractionName = attractionName;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int count) {
            this.cost = count;
        }
    }



}
