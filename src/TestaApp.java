public class TestaApp {

  public static void main(String[] args) {

    Cliente cliente1 = new Cliente();
    cliente1.nome = "Jesiel";
    cliente1.CPF = "0123555555";

    Cliente cliente2 = new Cliente();
    cliente1.nome = "Viana";
    cliente1.CPF = "012355588";

    Conta conta1 = new Conta(1, 12, cliente1);
    conta1.deposita(150);

    Conta conta2 = new Conta(1, 13, cliente2);

    System.out.println("Saldo conta 1: " + conta1.getSaldo());
    System.out.println("Saldo conta 2: " + conta2.getSaldo());

    conta1.transfere(50, conta2);

    System.out.println("Saldo conta 1: " + conta1.getSaldo());
    System.out.println("Saldo conta 2: " + conta2.getSaldo());

  }

}
