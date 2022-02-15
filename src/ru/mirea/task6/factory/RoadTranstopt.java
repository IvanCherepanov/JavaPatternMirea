package ru.mirea.task6.factory;

public class RoadTranstopt implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by road");
    }
}
