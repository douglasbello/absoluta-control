package com.absolutavelas.absolutabackend.unit_tests.services.products.register;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.database.repositories.products.CandleRepository;
import com.absolutavelas.absolutabackend.dtos.candles.CandleRequest;
import com.absolutavelas.absolutabackend.services.products.candles.impl.CandleRegisterServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.UUID;

@SpringBootTest
public class CandleRegisterServiceTest {
    @InjectMocks
    private CandleRegisterServiceImpl candleRegisterService;

    @Mock
    private CandleRepository candleRepository;

    private Candle candle;

    private UUID candleIdentifier = UUID.randomUUID();

    private CandleRequest request;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(CandleRegisterServiceTest.class);

        request = new CandleRequest("Vela", new BigDecimal("29.90"), "Essa é uma ta na nan", null, 200L);

        candle = new Candle.Builder()
                .name("Vela")
                .stockAmount(200L)
                .price(new BigDecimal("29.90"))
                .description("Essa é uma ta na nan")
                .build();

        candle.setIdentifier(candleIdentifier);
    }

    @DisplayName("Given CandleRequest when save method should return candle identifier")
    @Test
    void givenCandleRequest_whenSave_thenReturnCandleIdentifier() {
        when(candleRepository.save(any(Candle.class))).thenReturn(candle);

        UUID savedCandle = candleRegisterService.register(request);

        assertNotNull(savedCandle);
        assertEquals(savedCandle, candle.getIdentifier());
    }
}