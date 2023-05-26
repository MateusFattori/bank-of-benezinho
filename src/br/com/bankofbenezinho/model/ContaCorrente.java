package br.com.bankofbenezinho.model;

public class ContaCorrente extends Conta{

    private double limite;


    public ContaCorrente() {
    }


    public ContaCorrente(String numero, double saldo, Agencia agencia, double limite) {
        super(numero, saldo, agencia);
        this.setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + getLimite() +
                "} " + super.toString();
    }
}
