package com.example.task10_4.components;


import com.example.task10_4.interfaces.Knight;
import org.springframework.stereotype.Component;

@Component
public class KingOfKnights implements Knight {
    @Override
    public void fight() {
        System.out.println("King Of Knights figth");
    }
}
