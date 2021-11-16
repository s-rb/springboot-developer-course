package ru.list.surkovr.demo;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

public class MyBanner implements Banner {
    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println("\n" +
                "    __  ___                                                            _         \n" +
                "   /  |/  /_  __   _______  ______  ___  _____   ________  ______   __(_)_______ \n" +
                "  / /|_/ / / / /  / ___/ / / / __ \\/ _ \\/ ___/  / ___/ _ \\/ ___/ | / / / ___/ _ \\\n" +
                " / /  / / /_/ /  (__  ) /_/ / /_/ /  __/ /     (__  )  __/ /   | |/ / / /__/  __/\n" +
                "/_/  /_/\\__, /  /____/\\__,_/ .___/\\___/_/     /____/\\___/_/    |___/_/\\___/\\___/ \n" +
                "       /____/             /_/                                                    \n");
    }
}
