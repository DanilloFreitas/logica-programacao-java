

public class Calculadora {
    private double numeroA;
    private double numeroB;

    public void setNumeros(double nA, double nB) {
        this.numeroA = nA;
        this.numeroB = nB;
    }
    public double getNumeroA() {
        return numeroA;
    }
    public double getNumeroB() {
        return numeroB;
    }

    public double somar() {
        return getNumeroA() + getNumeroB();
    }

    public double subtracao(){
        return getNumeroA() - getNumeroB();
    }

    public double multiplicacao(){
        return getNumeroA() * getNumeroB();
    }
    public double divisao(){
        return getNumeroA()  / getNumeroB();
    }
}
