package conta;
public class ContaTerminal{

    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

}