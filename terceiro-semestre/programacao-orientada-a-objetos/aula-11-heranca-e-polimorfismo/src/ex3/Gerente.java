package ex3;

import java.util.Scanner;

public class Gerente extends Funcionario{
    public double calcularSalario(double salario){
        return salario * 1.1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerente gerente = new Gerente();
        System.out.println("Digite o salário do gerente: ");
        double salario = sc.nextDouble();
        System.out.println(gerente.calcularSalario(salario));
    }
}
