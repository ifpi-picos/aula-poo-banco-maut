abstract public class Conta {
  private int agencia;
  private int numero;
  private Cliente cliente;
  protected double saldo;
  Notificacao notificacao;

  private static int quantidadeDeContas;

  public Conta(int agencia, int numero, Cliente cliente, Notificacao notificacao) {
    System.out.println("Construindo objeto da classe conta");
    quantidadeDeContas++;
    this.agencia = agencia;
    this.numero = numero;
    this.cliente = cliente;
    this.notificacao = notificacao;
  }

  public void alteraFormaDeNotificacao(Notificacao n) {
    this.notificacao = n;
  }

  public void deposita(double valor) {
    if (valor > 0) {
      this.saldo = this.saldo + valor;
      this.enviaNotificacao("Depósito", valor);
      System.out.println("Valor depositado na conta " + this.numero);
    }
  }

  abstract public boolean saca(double valor);

  public void transfere(double valor, Conta contaDestino) {
    System.out.println("Iniciando transferência entre contas!");
    boolean saqueComSucesso = this.saca(valor);
    if (saqueComSucesso) {
      contaDestino.deposita(valor);
      this.enviaNotificacao("Transferência", valor);
    }
  }

  protected void enviaNotificacao(String operacao, double valor) {
    this.notificacao.envia(operacao +" valor: " + valor);
  }

  public double getSaldo() {
    return saldo;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public int getNumero() {
    return numero;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public static int getQuantidadeDeContas() {
    return quantidadeDeContas;
  }

}
