package ru.mirea.task6.factory;

public class SeaTransport implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by sea");
    }
}
