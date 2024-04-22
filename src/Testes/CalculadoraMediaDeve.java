package Testes;

import Calculadora.CalculadoraMedia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraMediaDeve {
    CalculadoraMedia calculadoraMedia;
    @BeforeEach
     void SetupTests(){
        calculadoraMedia = new CalculadoraMedia();
    }

    @Test
    public void Retornar4QuandoSomar2E2(){
        Assertions.assertEquals(4, calculadoraMedia.Soma(2,2));
    }

    @Test
    public void Retornar2QuandoCalcularAMediaDe2E2(){
        Assertions.assertEquals(2, calculadoraMedia.Media(2,2));
    }
}
