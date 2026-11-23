import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstufaTest {

    @Test
    void deveRetornarTemperaturaEmCelsius() {
        Estufa estufa = new Estufa();
        estufa.setTemperatura(25.0);

        assertEquals(25.0, estufa.getTemperatura());
    }

    @Test
    void deveRetornarTemperaturaEmFahrenheit() {
        Estufa estufa = new Estufa();
        estufa.setTemperatura(25.0);

        assertEquals(77.0, estufa.getFahrenheit());
    }

    @Test
    void deveConverterPontoDeCongelamento() {
        Estufa estufa = new Estufa();
        estufa.setTemperatura(0.0);

        assertEquals(32.0, estufa.getFahrenheit());
        assertEquals(0.0, estufa.getTemperatura());
    }

    @Test
    void deveConverterPontoDeEbulicao() {
        Estufa estufa = new Estufa();
        estufa.setTemperatura(100.0);

        assertEquals(212.0, estufa.getFahrenheit());
        assertEquals(100.0, estufa.getTemperatura());
    }
}
