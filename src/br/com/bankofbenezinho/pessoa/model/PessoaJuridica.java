package br.com.bankofbenezinho.pessoa.model;

import java.util.Collection;
import java.util.Vector;
import java.util.Collections;

public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    private String razaoSocial;

    private Collection<Pessoa> socios = new Vector<>();

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String CNPJ, String razaoSocial, Collection<Pessoa> socios) {
        super(nome);
        this.setCNPJ(CNPJ);
        this.setRazaoSocial(razaoSocial);
        this.setSocios(socios);
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Collection<Pessoa> getSocios() {
        return Collections.unmodifiableCollection(this.socios);
    }

    public PessoaJuridica addSocio(Pessoa socio){
        this.getSocios().add(socio);
        return this;
    }

    public PessoaJuridica removeSocio(Pessoa socio){
        this.getSocios().remove(socio);
        return this;
    }
    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + getCNPJ() + '\'' +
                ", razaoSocial='" + getRazaoSocial() + '\'' +
                ", socios=" + getSocios() +
                "} " + super.toString();
    }

    public void setSocios(Collection<Pessoa> socios) {
        this.socios = socios;
    }
}
