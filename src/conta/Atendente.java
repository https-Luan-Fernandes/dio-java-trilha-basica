package conta;

public class Atendente {

    private String nome;

    public Atendente(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void perguntarAgencia(){
        System.out.println("Por favor, digite o número da Agência !");
    }

    public void perguntarNumeroConta(){
        System.out.println("Por favor, digite o número da Conta !");
    }

    public void perguntarNome(){
        System.out.println("Por favor, digite o seu nome !");
    }

    public void perguntarSaldoDeposito(){
        System.out.println("Por favor, digite o valor do deposito !");
    }
}
