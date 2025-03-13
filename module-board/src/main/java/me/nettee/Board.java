package me.nettee;

import me.nettee.Port.BoardPort;

public class Board implements BoardPort {
    @Override
    public void activate() {
       System.out.println("me.nettee.Board activated");
    }
}
