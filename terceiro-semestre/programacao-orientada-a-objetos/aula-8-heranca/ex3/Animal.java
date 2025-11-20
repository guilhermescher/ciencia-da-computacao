package ex3;

public class Animal {
    protected String tipo;

    public String andar(){
        return "Todos andam, mas o modo é variado.";
    }

    public Animal(String tipo) {
        this.tipo = tipo;
    }
}
