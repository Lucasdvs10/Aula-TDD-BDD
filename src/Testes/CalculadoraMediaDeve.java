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

    /*
        Teste a ser executado:
        Funcionalidade: Somar dois numeros

        Eu como usuário
        quero efetuar a Soma de dois numeros inteiros
        para facilitar meus calculos

        Caso de teste:

        Cenario: Somar dois numeros inteiros
        Dado: ao selecionar a opcao de somar
        Quando: ao digitar dois inteiros no terminal
        Entao: deve exibir a soma dos dois numeros digitados
     */
    @Test
    public void Retornar4QuandoSomar2E2(){
        Assertions.assertEquals(4, calculadoraMedia.Soma(2,2));
    }



    @Test
    public void Retornar2QuandoCalcularAMediaDe2E2(){
        Assertions.assertEquals(2, calculadoraMedia.Media(2,2));
    }
}
