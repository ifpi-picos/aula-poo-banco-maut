public class TestaApp {

  public static void main(String[] args) {

    Cliente c = new Cliente(null, null, null, null);

    ContaCorrente cc = new ContaCorrente(0, 0, c, null);
    cc.setChequeEspecial(200.50);

  }

}
