package com.example.demo.components;


import com.example.demo.interfaces.Knight;

public class KingOfKnights implements Knight {
    @Override
    public void fight() {
        System.out.println("King Of Knights figth");
    }
}
