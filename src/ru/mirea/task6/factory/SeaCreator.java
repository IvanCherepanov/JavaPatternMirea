package ru.mirea.task6.factory;

public class SeaCreator extends Factory{
    @Override
    public Transport createTransport() {
        return new SeaTransport();
    }

    @Override
    public Transport doTransport() {
        return super.doTransport();
    }
}
