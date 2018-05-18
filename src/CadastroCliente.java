
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Moreira
 */
public class CadastroCliente {

    String[] nomes = new String[100];
    int[] idades = new int[100];
    char[] sexos = new char[100];
    String[] cpfs = new String[100];
    String[] estados = new String[100];
    String[] cidades = new String[100];
    String[] bairros = new String[100];
    String[] logradouros = new String[100];
    String[] ceps = new String[100];
    String[] numeros = new String[100];
    String[] complementos = new String[100];
    int atual = 0;

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {
        String busca = JOptionPane.showInputDialog("Digite o nome para edição:");
        for (int i = 0; i < atual; i++) {
            if (nomes[i].equals(busca)){
                solicitarInformacao(i);
            }
            
        }
    }

    public void apresentarInformacao(int i) {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nomes[i]
                + "\nIdade: " + idades[i]
                + "\nCPF: " + cpfs[i]
                + "\nEstado: " + estados[i]
                + "\nCidade: " + cidades[i]
                + "\nBairro: " + bairros[i]
                + "\nLogradouro: " + logradouros[i]
                + "\nCEP: " + ceps[i]
                + "\nNumero: " + numeros[i]
                + "\nComplemento:" + complementos[i]
        );

    }

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para busca:");
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }

    public void contablizarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome para busca");
        int quantidadeDeRegistros = 0;
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                quantidadeDeRegistros++;
            }
        }

    }

    public void buscarPeloCpf() {
        String cpfBuscado = JOptionPane.showInputDialog("Digite o CPF que deseja buscar").replace(".", "").replace("-", "");
        for (int i = 0; i < atual; i++) {
            if (cpfs[i].equals(cpfBuscado)) {
                apresentarInformacao(i);
            }
        }
    }

    public void listar() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomes[i] + "  " + cpfs[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog("Digite o nome:");
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomes[posicao] + " Digite a sua idade"));
        sexos[posicao] = JOptionPane.showInputDialog((nomes[posicao] + " Digite o seu sexo:")).charAt(0);
        cpfs[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu CPF").replace(".", "").replace("-", "");
        estados[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu estado").trim().toUpperCase();
        cidades[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite a sua cidade:");
        logradouros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu logradouro:");
        ceps[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o seu cep:");
        numeros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o numero");
        complementos[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " Digite o complemento");
    }

}
 