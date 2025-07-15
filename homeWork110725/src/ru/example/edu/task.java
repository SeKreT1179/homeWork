package ru.example.edu;

public class task {
        private String name;
        private String description;
        private String date;



        //TODO: alt+insert
        public task(String name, String description, String date) {
            this.name = name;
            this.description = description;
            this.date = date;
        }

        public void printInfo() {
            System.out.println("Task name: " + name);
            System.out.println("Description: " + description);
            System.out.println("Date: " + date);
        }

        public boolean equalsName(String name) {
            return this.name.contains(name);
        }
    }

