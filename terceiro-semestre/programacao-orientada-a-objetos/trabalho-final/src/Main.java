//Guilherme da Silva Scher
//Programação Orientada a Objetos
//ATIVIDADE FINAL - CADASTRO DE VEÍCULOS
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        boolean loop = true;
        while(loop){
            Scanner sc = new Scanner(System.in);
            System.out.print("Escolha uma das opções: \n1 - Cadastrar veículo\n2 - Alterar quilometragem do veículo\n3 - Excluir veículo pelo número da placa\n4 - Sair do sistema\n");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    //Cadastrar veículo
                    System.out.print("Digite a placa do veículo: ");
                    String placa = sc.nextLine();
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Digite a marca do veículo: ");
                    String marca = sc.nextLine();
                    System.out.print("Digite o ano de fabricação do veículo: ");
                    int anoFabricacao = sc.nextInt();
                    System.out.print("Digite a quilometragem do veículo: ");
                    double quilometragem = sc.nextDouble();
                    sc.nextLine();
                    Veiculo temp = new Veiculo(placa, modelo, marca, anoFabricacao, quilometragem);
                    veiculos.add(temp);
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("veiculos.txt"))) {
                        for (Veiculo v : veiculos) {
                            String linha = v.toString();
                            bw.write(linha);
                            bw.newLine();
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao salvar o arquivo.");
                    }
                    break;
                case 2:
                    //Alterar quilometragem do veículo
                    System.out.print("Digite a placa do veículo que você deseja alterar a quilometragem: ");
                    String placaQuilometragem = sc.nextLine();
                    for(Veiculo veiculo : veiculos){
                        if(veiculo.getPlaca().equals(placaQuilometragem)){
                            System.out.print("Digite a quilometragem que você deseja botar: ");
                            double novaQuilometragem = sc.nextDouble();
                            veiculo.setQuilometragem(novaQuilometragem);
                            System.out.println("Quilometragem atualizada.");
                            try (BufferedWriter bw = new BufferedWriter(new FileWriter("veiculos.txt"))) {
                                for (Veiculo v : veiculos) {
                                    String linha = v.toString();
                                    bw.write(linha);
                                    bw.newLine();
                                }
                            } catch (Exception e) {
                                System.out.println("Erro ao salvar o arquivo.");
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    //Excluir veículo pelo número da placa
                    System.out.print("Digite a placa do veículo que você deseja excluir: ");
                    String placaExcluir = sc.nextLine();
                    for(Veiculo veiculo : veiculos){
                        if(veiculo.getPlaca().equals(placaExcluir)){
                            veiculos.remove(veiculo);
                            System.out.println("Veiculo excluído.");
                            try (BufferedWriter bw = new BufferedWriter(new FileWriter("veiculos.txt"))) {
                                for (Veiculo v : veiculos) {
                                    String linha = v.toString();
                                    bw.write(linha);
                                    bw.newLine();
                                }
                            } catch (Exception e) {
                                System.out.println("Erro ao salvar o arquivo.");
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    //Sair do sistema
                    loop = false;
                    break;
            }
        }
    }
}