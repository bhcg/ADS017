import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaBotao {
    public static void main(String[] args) {
   
        JButton ok = new JButton();
        ok.setText("OK");
        JButton cancelar = new JButton("Cancelar");
        cancelar.setMnemonic('C');
        
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painel.add(ok);
        painel.add(cancelar);
        
        JFrame janela = new JFrame();
        janela.add(painel, BorderLayout.SOUTH);
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
}
}
