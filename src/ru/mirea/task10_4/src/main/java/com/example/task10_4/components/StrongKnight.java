package com.example.task10_4.components;


import com.example.task10_4.interfaces.Knight;
import org.springframework.stereotype.Component;

@Component
public class StrongKnight implements Knight {
    @Override
    public void fight() {
        System.out.println("Strong Knight fight");
    }
}
