
import javax.swing.JOptionPane;

public class TestaMensagemBoasVindas {

    public static void main(String[] args) {

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
            if (nome != null) {
                JOptionPane.showMessageDialog(null, "Seja Bem Vindo! " + nome, "aviso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Nome não inserido!!!", "erro", JOptionPane.ERROR_MESSAGE);
            }
            }else {
            JOptionPane.showMessageDialog(null, "O programa foi encerrado.", "Alerta", JOptionPane.WARNING_MESSAGE);
                    
        }
        }

    }

