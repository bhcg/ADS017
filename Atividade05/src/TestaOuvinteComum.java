
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestaOuvinteComum {
   
    private class OuvinteComum implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Disparou ouvinte interno...");
        
    }
    }
  
    public static void main(String[] args) {
   
        OuvinteComum ouvinte = new OuvinteComum();
        
        JButton botao = new JButton("OK");
        botao.addActionListener((ActionListener) ouvinte);
        
        JTextField campo = new JTextField("Pressione ENTER");
        botao.addActionListener((ActionListener) ouvinte);
        
        JFrame janela = new JFrame();
        janela.setLayout(new FlowLayout());
        janela.add(botao);
        janela.add(campo);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
}
}