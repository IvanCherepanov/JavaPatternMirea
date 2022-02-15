package ru.mirea.task6.factory;

public class TestFactoryMethod {

    public static void main(String[] args) {
        Factory roadTranstopt = new RoadCreator();
        roadTranstopt.doTransport();

        Factory seaTransport = new RoadCreator();
        seaTransport.doTransport();

    }
}
