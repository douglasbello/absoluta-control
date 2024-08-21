package com.absolutavelas.absolutabackend;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class AbsolutaBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AbsolutaBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Candle candle = new Candle.Builder()
                .name("Vela")
                .stockAmount(200L)
                .price(new BigDecimal("29.90"))
                .description("Essa é uma ta na nan")
                .build();

        System.out.println(candle);
    }
}
