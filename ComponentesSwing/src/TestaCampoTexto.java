
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestaCampoTexto {
    public static void main(String[] args) {
   
        JTextField campoTexto = new JTextField();
        JTextField campoDataNascimento = new JTextField();
        
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout(FlowLayout.LEFT));
        painel.add(campoTexto);
        painel.add(campoDataNascimento);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
}
}
