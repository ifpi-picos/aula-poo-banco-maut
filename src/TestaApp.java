public class TestaApp {

  public static void main(String[] args) {

    Conta conta1 = new Conta();
    conta1.agencia = 123;
    conta1.numero = 456;
    conta1.saldo = 100;

    Cliente cliente1 = new Cliente();
    cliente1.nome = "Jesiel";
    cliente1.CPF = "0123";

    conta1.cliente = cliente1;

    System.out.println("agencia da conta: " + conta1.agencia);
    System.out.println("número da conta: " + conta1.numero);
    System.out.println("nome do cliente da conta: " + conta1.cliente.nome);
    System.out.println("cpf do cliente da conta: " + conta1.cliente.CPF);
  }

}
