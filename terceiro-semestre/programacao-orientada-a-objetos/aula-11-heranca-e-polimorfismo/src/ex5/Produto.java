package ex5;

class Cliente {
    private double desconto;

    public Cliente(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
}

class Produto {
    public double calcularPrecoFinal(double preco) {
        return preco;
    }

    public double calcularPrecoFinal(double preco, Cliente cliente) {
        return preco - (preco * cliente.getDesconto());
    }
}
