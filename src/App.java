import java.util.Scanner;
import conta.Atendente;
import conta.ContaTerminal;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Atendente atendente = new Atendente(null);
            ContaTerminal conta = new ContaTerminal();

            atendente.perguntarNome();
            conta.setNomeCliente(input.nextLine());

            atendente.perguntarAgencia();
            conta.setAgencia(input.nextLine());

            atendente.perguntarNumeroConta();
            conta.setNumero(input.nextInt());

            atendente.perguntarSaldoDeposito();
            conta.setSaldo(input.nextFloat());

            atendente.finalizarAtendimento(conta);
        }
    }
}
