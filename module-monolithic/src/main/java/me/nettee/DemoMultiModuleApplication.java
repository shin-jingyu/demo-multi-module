package me.nettee;

import me.nettee.Port.BoardPort;
import me.nettee.Port.CorePort;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ServiceLoader;

@SpringBootApplication()
public class DemoMultiModuleApplication {

    public static void main(String[] args) {
        Contracts contract = new Contracts();
        BoardPort board = ServiceLoader.load(BoardPort.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No BoardPort implementation found"));
        CorePort core = ServiceLoader.load(CorePort.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No CorePort implementation found"));

        contract.activate();
        board.activate();
        core.activate();
    }
}
