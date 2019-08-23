
import javax.swing.JOptionPane;

public class TestaJOptionPane {
    
    public static void main(String[] args) {
   
        JOptionPane.showMessageDialog(null, "Olá pessoal!");
        
        String matricula = JOptionPane.showInputDialog("Entre com a sua matricula:");
        
        int opcao = JOptionPane.showConfirmDialog(null, "Sua matricula é essa " + matricula + "?", "Pergunta", JOptionPane.YES_NO_OPTION );
        
        if(opcao == JOptionPane.NO_OPTION) {
        
        JOptionPane.showMessageDialog(null, "Você digitou errado", "Alerta", JOptionPane.WARNING_MESSAGE);

            }
        }
    
}
