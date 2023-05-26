import br.com.bankofbenezinho.model.Agencia;
import br.com.bankofbenezinho.model.Banco;
import br.com.bankofbenezinho.model.ContaCorrente;
import br.com.bankofbenezinho.model.ContaPoupanca;
import br.com.bankofbenezinho.pessoa.model.Pessoa;
import br.com.bankofbenezinho.pessoa.model.PessoaFisica;
import br.com.bankofbenezinho.pessoa.model.PessoaJuridica;

import javax.swing.*;
import java.util.Collection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static Agencia novaAgencia(String numero, String nome, Banco banco){
        Agencia agencia = new Agencia();
        agencia.setNome(nome);
        agencia.setNumero(numero);
        banco.addAgencia(agencia);
        return agencia;
    }

    public static ContaCorrente novaContaCorrente(String numero, double saldo, Agencia agencia, double limite){
        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(numero);
        cc.setSaldo(saldo);
        cc.setLimite(limite);
        agencia.addConta(cc);
        return cc;
    }

    public static ContaPoupanca novaContaPoupanca(String numero, double saldo, Agencia agencia, int aniversario){
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(numero);
        cp.setSaldo(saldo);
        cp.setAniversario(aniversario);
        agencia.addConta(cp);
        return cp;
    }

    public static PessoaFisica novaPessoaFisica(String nome,String CPF, PessoaFisica mae) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome(nome);
        pf.setCPF(CPF);
        pf.setMae(mae);
        return pf;
    }

    public static PessoaJuridica novaPessoaJuridica(String nome, String CNPJ, String razaoSocial){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome(nome);
        pj.setCNPJ(CNPJ);
        pj.setRazaoSocial(razaoSocial);
        return pj;
    }




    public static void main(String[] args) {

        Banco benezinho = new Banco("Bank of Benezinho");

        Agencia saopaulo = novaAgencia( "91","São Paulo", benezinho);

        String texto =
                """
                [ 1 ] Pessoa Física
                [ 2 ] Pessoa Jurídica
                """;

        int continuar = Integer.parseInt(JOptionPane.showInputDialog(texto));

        if (continuar == 1){
            PessoaFisica pf = novaPessoaFisica(JOptionPane.showInputDialog("Digite o seu nome"), JOptionPane.showInputDialog("Digite o seu CPF: "), null);
            System.out.println(pf);
        } else if (continuar == 2) {
            PessoaJuridica pj = novaPessoaJuridica(JOptionPane.showInputDialog("Digite o seu Nome: "), JOptionPane.showInputDialog("Digite o seu CNPJ: "), JOptionPane.showInputDialog("Digite a sua Razão Social: "));
            System.out.println(pj);
        }

        ContaCorrente cc = novaContaCorrente("91", 300, saopaulo, 4000);
        ContaPoupanca cp = novaContaPoupanca("91", 600, saopaulo, 16/04/2022);

        System.out.println(benezinho);
        System.out.println(saopaulo);
        System.out.println(cc);
        System.out.println(cp);

    }


}