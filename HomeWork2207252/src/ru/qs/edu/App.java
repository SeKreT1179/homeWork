package ru.qs.edu;

import ru.qs.edu.service.GameService;
import ru.qs.edu.units.Amal;
import ru.qs.edu.units.Mage;
import ru.qs.edu.units.Warrior;
import ru.qs.edu.units.Alchemist;


public class App {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}