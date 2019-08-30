
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaFlowLayout {
    
    public static void main(String[] args) {
   
        JPanel paine11 = new JPanel();
        paine11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel paine12 = new JPanel();
        paine12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel paine13 = new JPanel();
        paine13.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel paine14 = new JPanel();
        paine14.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JPanel paine15 = new JPanel();
        paine15.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JFrame janela = new JFrame();
        janela.setTitle("FlowLayout");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        
}
    
}
