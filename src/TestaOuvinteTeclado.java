import javax.swing.JFrame;

public class TestaOuvinteTeclado {
    public static void main(String[] args) {
   
        OuvinteTeclado ouvinte = new OuvinteTeclado();
        
        JFrame janela = new JFrame();
        janela.add(ouvinte);
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
