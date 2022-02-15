package ru.mirea.task6.factory;

public class TestFactoryMethod {

    public static void main(String[] args) {
        RoadTranstopt roadTranstopt = new RoadTranstopt();
        roadTranstopt.deliver();

        SeaTransport seaTransport = new SeaTransport();
        seaTransport.deliver();

    }
}
