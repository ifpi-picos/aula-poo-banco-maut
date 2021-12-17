import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TestaApp {

  public static void main(String[] args) {

    List<Cliente> clientes = new ArrayList<>();
    while (true) {
      String opcao = JOptionPane
          .showInputDialog("Digite uma opção: \n 1 - Criar Cliente \n 2 - Listas clientes \n 0 - Para encerrar");
      if (opcao.equals("0")) {
        break;
      }

      if (opcao.equals("1")) {
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        Cliente cliente = new Cliente(nome, "123",
            new Endereco("lagradouro", 1, "bairro", "Picos", "PI"), LocalDate.of(1990, 11, 1));
        clientes.add(cliente);
      } else if (opcao.equals("2")) {
        String nomes = "";
        for (Cliente cliente : clientes) {
          nomes = nomes + cliente.getNome() + "\n";
        }
        System.out.println(nomes);
        JOptionPane.showMessageDialog(null, nomes);
      }
    }

  }

}
