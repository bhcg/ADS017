
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TestaOuvinteInterno  {
    static class OuvinteInterno implements ActionListener { 
        
        
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
        public void actionPerformed() {
        System.out.println("Disparou ouvinte interno...");
        
    }
    }
    
    public static void main(String[] args) {
        
        OuvinteInterno ouvinte = new OuvinteInterno();
        
        JButton botao = new JButton("OK");
        botao.addActionListener((ActionListener) ouvinte);
        
        JOptionPane janela0 = new JOptionPane();
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

