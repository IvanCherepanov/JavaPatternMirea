package com.example.demo.components;


import com.example.demo.interfaces.Knight;

public class StrongKnight implements Knight {
    @Override
    public void fight() {
        System.out.println("Strong Knight fight");
    }
}
