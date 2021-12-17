public class ContaPoupanca extends Conta {

  private double rendimento;

  public ContaPoupanca(int agencia, int numero, Cliente cliente) {
    super(agencia, numero, cliente);
    this.rendimento = 0.02;
  }

  public void setRendimento(double rendimento) {
    this.rendimento = rendimento;
  }

  public double getRendimento() {
    return rendimento;
  }

  @Override
  public boolean saca(double valor) {
    if (valor > 0 && valor <= super.saldo) {
      super.saldo = super.saldo - valor;
      System.out.println("Valor sacado da conta " + super.getNumero());
      super.enviaNotificacao("Saque", valor);
      return true;
    } else {
      System.out.println("Saque não realizado, valor acima do saldo atual!");
      return false;
    }
  }

}
