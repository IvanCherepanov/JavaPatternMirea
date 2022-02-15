package ru.mirea.task6.factory;

public class TestFactoryMethod {
    private static Factory factory;
    public static void main(String[] args) {
        Transport roadTranstopt = new RoadTranstopt();
        roadTranstopt.deliver();

        SeaTransport seaTransport = new SeaTransport();
        seaTransport.deliver();


    }


}
