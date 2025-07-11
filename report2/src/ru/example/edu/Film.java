package ru.example.edu;

public class Film {
    private String name;
    private String about;
    private int duration;
    private String genre;



    //TODO: alt+insert
    public Film(String name, String about, int duration, String genre) {
        this.name = name;
        this.about = about;
        this.duration = duration;
        this.genre = genre;
    }

    public void printInfo() {
        System.out.println("Film name: " + name);
        System.out.println("About: " + about);
        System.out.println("Duration: " + duration);
        System.out.println("Genre: " + genre);
    }

    public boolean equalsName(String name) {
        return this.name.contains(name);
    }
}

//    public Film(String name, String about, int duration, String genre) {
//        this.name = name;
//        this.about = about;
//        this.duration = duration;
//        this.genre = genre;
//    }

