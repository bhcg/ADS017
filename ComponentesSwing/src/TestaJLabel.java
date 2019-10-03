
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestaJLabel {
    public static void main(String[] args) {
        
        JLabel rotulo = new JLabel();
        rotulo.setText("Um texto não editável");
        
        JPanel painel = new JPanel();
        painel.add(rotulo);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300, 400);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
}
}
