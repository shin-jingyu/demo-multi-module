package me.nettee;

import me.nettee.Port.CorePort;

public class core implements CorePort {

    @Override
    public void activate() {
        System.out.println("core");
    }
}
