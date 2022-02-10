package ru.mirea.task2;

import java.util.List;
import java.util.stream.Stream;

public class TestHuman {
    public static void main(String[] args) {

        //можно через static
        HumanApp humanApp = new HumanApp();
        Stream<Human> listHuman =  humanApp.getHumans();
        humanApp.printHuman(listHuman);

        HumanApp humanApp1 = new HumanApp();
        Stream<Human> listHuman1 =  humanApp.getHumans();
        System.out.println(humanApp1.getSumAge(listHuman1));

    }
}
