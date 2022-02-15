package ru.mirea.task6.factory;

public class RoadCreator extends Factory{
    @Override
    public Transport createTransport() {
        return new RoadTranstopt();
    }

    @Override
    public Transport doTransport() {
        return super.doTransport();
    }
}
