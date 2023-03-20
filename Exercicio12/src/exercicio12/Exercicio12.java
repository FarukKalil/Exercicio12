package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int PrimeiroNumero;
        int SegundoNumero;
        boolean Igual = false;
        boolean NaoIgual = false;
        boolean Maior = false;
        boolean Menor = false;
        boolean MaiorOuIgual = false;
        boolean MenorOuIgual = false;
        
        System.out.println("Mostrador de relacionamentos");
        System.out.println("Digite o primeiro numero: ");
        PrimeiroNumero = entrada.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        SegundoNumero = entrada.nextInt();
        
        if (PrimeiroNumero == SegundoNumero) Igual = true;
        if (PrimeiroNumero != SegundoNumero) NaoIgual = true;
        if (PrimeiroNumero > SegundoNumero) Maior = true;
        if (PrimeiroNumero < SegundoNumero) Menor = true;
        if (PrimeiroNumero >= SegundoNumero) MaiorOuIgual = true;
        if (PrimeiroNumero <= SegundoNumero) MenorOuIgual = true;
        
        System.out.println("Igual =  " + Igual);
        System.out.println("NaoIgual = " + NaoIgual);
        System.out.println("Maior = " + Maior);
        System.out.println("Menor = " + Menor);
        System.out.println("MaiorOuIgual = " + MaiorOuIgual);
        System.out.println("MenorOuIgual = " + MenorOuIgual);
    }
    
}
