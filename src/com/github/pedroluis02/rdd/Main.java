package com.github.pedroluis02.rdd;

import com.github.pedroluis02.rdd.shared.Game;
import com.github.pedroluis02.rdd.visitorpattern.VpGame;

public class Main {
    public static void main(String[] args) {
        Game game = new VpGame();
        game.start();
    }
}