package Calculadora;

public class CalculadoraMedia {
    public int Soma(int a, int b){
        return a+b;
    }

    public double Media(int a, int b){
        return (double) Soma(a, b) /2;
    }
}
