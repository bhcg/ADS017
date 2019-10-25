
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TestaListaFlamengo {
    public static void main(String[] args) {
   
        JLabel rotuloContatos = new JLabel("Contatos:");
        String[] contatos = {"Jairo", "Thiago", "Renan", "Bruno", "Beatriz"};
        JList listaContatos = new JList (contatos);
        listaContatos.setVisibleRowCount(3);
        
        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(listaContatos);
        
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotuloContatos);
        painel.add(rolagem);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
}
}