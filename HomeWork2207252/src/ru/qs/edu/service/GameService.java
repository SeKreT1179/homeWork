package ru.qs.edu.service;

import ru.qs.edu.units.Alchemist;
import ru.qs.edu.units.Mage;
import ru.qs.edu.units.Unit;
import ru.qs.edu.units.Warrior;
import ru.qs.edu.units.Alchemist;

public class GameService {
    private Unit[] team1, team2;
    private IOService ioService;
    private int numberUnit;

    public GameService() {
        this.ioService = new IOService();
        numberUnit = ioService.getNumberUnit();
        this.team1 = new Unit[numberUnit];
        this.team2 = new Unit[numberUnit];
        generateTeam();
    }

    private void generateTeam() {
        for (int i = 0; i < numberUnit; i++) {
            team1[i] = randomUnit(i);
            team2[i] = randomUnit(i);
        }
    }

    private Unit randomUnit(int number) {
        if (Math.random() < 0.33) {
            return new Warrior("Воин" + number, 100, 5);
        } else if (Math.random() < 0.66) {
            return new Mage("Маг" + number, 50, 20);
        }else {
            return new Alchemist("Алхимик" + number, 70);
        }
    }

    public void startGame() {
        int curUnitTeam1 = 0;
        int curUnitTeam2 = 0;

        while (curUnitTeam1 < numberUnit && curUnitTeam2 < numberUnit) {
            while (team1[curUnitTeam1].getHp() > 0 && team2[curUnitTeam2].getHp() > 0) {
                team1[curUnitTeam1].attack(team2[curUnitTeam2]);
                team2[curUnitTeam2].attack(team1[curUnitTeam1]);
            }
            ioService.printUnitState(1, team1[curUnitTeam1]);
            ioService.printUnitState(2, team2[curUnitTeam2]);

            if (team1[curUnitTeam1].getHp() > 0) {
                curUnitTeam2++;
            }else {
                curUnitTeam1++;
            }
        }
        if (curUnitTeam1 < numberUnit) {
            ioService.win(1);
        }else {
            ioService.win(2);
        }
    }
}
