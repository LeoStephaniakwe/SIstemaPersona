
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Moreira
 */
public class Sistema {

    CadastroCliente registroCliente = new CadastroCliente();

    public void apresentarMenu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar Cliente"
                + "\n2 - Editar Cliente"
                + "\n3 - Buscar Pelo Nome"
                + "\n4 - Buscar pelo CPF"
                + "\n5 - Listar Clientes"
                + "\n6 - Quantidade de Registro"
                + "\n7 - Sair"));
        while (menu != 8001) {
            switch (menu) {
                case 1:
                    registroCliente.cadastrar();
                    break;
                case 2:
                    registroCliente.editar();
                    break;
                case 3:
                    registroCliente.buscarPeloNome();
                    break;
                case 4:
                    break;
                case 5:
                    registroCliente.listar();
                    break;
                case 6:
                    registroCliente.contablizarPeloNome();
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");

            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar Cliente"
                + "\n2 - Editar Cliente"
                + "\n3 - Buscar Pelo Nome"
                + "\n4 - Buscar pelo CPF"
                + "\n5 - Listar Clientes"
                + "\n6 - Quantidade de Registro"
                + "\n7 - Sair"));
            {

            }

        }
    }
}
