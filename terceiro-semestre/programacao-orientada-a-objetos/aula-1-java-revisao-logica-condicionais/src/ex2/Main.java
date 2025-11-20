package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Guilherme Scher

        /*2 - Um motorista de taxi deseja calcular o rendimento de seu carro na praça.
        Sabendo-se que o preço do combustível é de R$4,90, escreva um algoritmo para ler a marcação
        do odômetro (marcador de quilometragem) no início do dia, a marcação no final do dia, o
        número de litros de combustível gasto e o valor total (R$) recebido dos passageiros.
        Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marcação do odômetro no início do dia: ");
        double odoInicio = sc.nextDouble();
        System.out.println("Digite a marcação do odômetro no início do dia: ");
        double odoFim = sc.nextDouble();
        System.out.println("Digite o número de litros de combustível gasto: ");
        double litrosGastos = sc.nextDouble();
        System.out.println("Digite o valor total (R$) recebido dos passageiros: ");
        double valorRecebido = sc.nextDouble();
        sc.close();

        double mediaConsumo = (odoFim - odoInicio) / litrosGastos;
        double lucroDiario = valorRecebido - (litrosGastos * 4.90);

        System.out.println("Média do consumo em Km/l: " + mediaConsumo);
        System.out.println("Lucro líquido do dia: " + lucroDiario);
    }
}
