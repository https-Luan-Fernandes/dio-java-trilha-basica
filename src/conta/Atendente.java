package conta;

public class Atendente {

    private String nome;

    public Atendente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void perguntarAgencia() {
        System.out.println("Por favor, digite o número da Agência!");
    }

    public void perguntarNumeroConta() {
        System.out.println("Por favor, digite o número da Conta!");
    }

    public void perguntarNome() {
        System.out.println("Por favor, digite o seu nome!");
    }

    public void perguntarSaldoDeposito() {
        System.out.println("Por favor, digite o valor do depósito!");
    }

    public void finalizarAtendimento(ContaTerminal conta) {
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo()
        );
        System.out.println(mensagem);
    }
}
