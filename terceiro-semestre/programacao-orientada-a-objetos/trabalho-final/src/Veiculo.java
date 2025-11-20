//Guilherme da Silva Scher
//Programação Orientada a Objetos
//ATIVIDADE FINAL - CADASTRO DE VEÍCULOS
public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, String marca, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa = " + placa +
                ", modelo = " + modelo +
                ", marca = " + marca  +
                ", ano de fabricação = " + anoFabricacao +
                ", quilometragem = " + quilometragem +
                '}';
    }
}
