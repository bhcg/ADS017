import javax.swing.JFrame;

public class TestaKeyListener {
    public static void main(String[] args) {
        OuvinteKeyListener ouvinte = new OuvinteKeyListener();
        
        JFrame janela = new JFrame();
        janela.addKeyListener(ouvinte);
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
