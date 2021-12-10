import java.time.LocalDate;

public class TestaApp {

  public static void main(String[] args) {
    LocalDate dataNascimento = LocalDate.of(2000, 5, 20);

    // Endereco endereco = new Endereco("lagradouro", 12, "bairro", "Picos", "PI");

    Cliente cliente1 = new Cliente("Jesiel", "0123456789", new Endereco("lagradouro 1", 12, "bairro", "Picos", "PI"),
        dataNascimento);

    System.out.println(cliente1.getEnderecos().get(0).getLagradouro());
    System.out.println("qtd enderecos: " + cliente1.getEnderecos().size());

    cliente1.addEndereco(new Endereco("lagradouro 2", 12, "bairro", "Picos", "PI"));

    System.out.println("qtd enderecos: " + cliente1.getEnderecos().size());

    Cliente cliente2 = new Cliente("Viana", "0123456789", new Endereco("lagradouro", 12, "bairro", "Picos", "PI"),
        dataNascimento);

    Conta conta1 = new Conta(1, 1, cliente1);
    Conta conta2 = new Conta(1, 2, cliente1);

    conta1.deposita(500);
    conta1.transfere(250, conta2);
    conta2.saca(100);

    System.out.println(conta1.getSaldo());
    System.out.println(conta2.getSaldo());

  }

}
