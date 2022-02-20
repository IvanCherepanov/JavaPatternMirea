package com.example.task10_4.configuration;

import com.example.task10_4.components.KingOfKnights;
import com.example.task10_4.components.StrongKnight;
import com.example.task10_4.components.WeakKnight;
import com.example.task10_4.interfaces.Knight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfiguration {
    @Bean
    public KingOfKnights kingOfKnights() {
        return new KingOfKnights();
    }

    @Bean
    public StrongKnight strongKnight() {
        return new StrongKnight();
    }

    @Bean
    public WeakKnight weakKnight() {
        return new WeakKnight();
    }
}
