import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaJanelaGridLayout {
    public static void main(String[] args) {
   
        JPanel painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel painel4 = new JPanel();
        painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel painel5 = new JPanel();
        painel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JFrame janela = new JFrame();
        GridLayout leiaute = new GridLayout(3, 2);
        
        janela.add(painel2, BorderLayout.NORTH);
        janela.add(painel3, BorderLayout.EAST);
        janela.add(painel4, BorderLayout.SOUTH);
        janela.add(painel5, BorderLayout.WEST);
        
        janela.setTitle("Janela GridLayout");
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
}
    
}
