package com.example.demo.components;


import com.example.demo.interfaces.Knight;

public class WeakKnight implements Knight {

    @Override
    public void fight() {
        System.out.println("Weak Knight fight");
    }
}
