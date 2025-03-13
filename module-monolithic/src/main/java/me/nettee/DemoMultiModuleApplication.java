package me.nettee;

import me.nettee.Port.BoardPort;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class DemoMultiModuleApplication {

    public static void main(String[] args) {
        Contracts contract = new Contracts();
        BoardPort board = new Board();
        contract.activate();
        board.activate();
    }
}
