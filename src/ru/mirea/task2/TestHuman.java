package ru.mirea.task2;

import java.util.List;
import java.util.stream.Stream;

public class TestHuman {
    public static void main(String[] args) {
        HumanApp humanApp = new HumanApp();
        Stream<Human> listHuman =  humanApp.getHumans();
        humanApp.printHuman(listHuman);
        System.out.println(humanApp.getSumAge(listHuman));

    }
}
