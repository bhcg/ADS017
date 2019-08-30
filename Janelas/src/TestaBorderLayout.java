
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaBorderLayout {
    public static void main(String[] args) {
   
        JPanel paine11 = new JPanel();
        paine11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel paine12 = new JPanel();
        paine12.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        JPanel paine13 = new JPanel();
        paine13.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        
        JPanel paine14 = new JPanel();
        paine14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        
        JPanel paine15 = new JPanel();
        paine15.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        
        JFrame janela = new JFrame();
        janela.add(paine11, BorderLayout.NORTH);
        janela.add(paine12, BorderLayout.EAST);
        janela.add(paine13, BorderLayout.SOUTH);
        janela.add(paine14, BorderLayout.WEST);
        janela.add(paine15, BorderLayout.CENTER);
        janela.setTitle("FlowLayout");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        
}
    
}