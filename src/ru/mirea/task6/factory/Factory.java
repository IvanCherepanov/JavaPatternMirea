package ru.mirea.task6.factory;

public abstract class Factory {
    public Transport doTransport(){
        Transport transport = createTransport();
        transport.deliver();
        return  transport;
        }

    public abstract Transport createTransport();
}

