import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTable;

public class TestaTabela1 {
    public static void main(String[] args) {
   
        JTable tabela = new JTable(20, 5);
        
        JFrame janela = new JFrame();
        janela.add(tabela, BorderLayout.CENTER);
        janela.setSize(640, 480);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        
}
}
