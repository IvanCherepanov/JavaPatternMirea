package com.example.task10_4;

import com.example.task10_4.components.KingOfKnights;
import com.example.task10_4.components.StrongKnight;
import com.example.task10_4.components.WeakKnight;
import com.example.task10_4.configuration.KnightConfiguration;
import com.example.task10_4.interfaces.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestKnight {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfiguration.class);
        Knight knight = context.getBean(WeakKnight.class);
        Knight knight1 = context.getBean(StrongKnight.class);
        Knight knight2 = context.getBean(KingOfKnights.class);
        knight.fight();
        knight1.fight();
        knight2.fight();
    }
}
