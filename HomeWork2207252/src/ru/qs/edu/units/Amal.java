package ru.qs.edu.units;

public class Amal extends Unit {
    private int punishments;

    public Amal(String name, int hp, int punishments) {
        super(name, hp);
        this.punishments = punishments;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Punishments : " + punishments);
    }

    @Override
    public void getDmg(int getDmg) {
        if (punishments > 0) {
            hp -= getDmg * 2;
            punishments--;
        } else {
            hp -= getDmg;
        }
    }

    @Override
    public void attack(Unit unit) {
        unit.getDmg(15);
    }
}