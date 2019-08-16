import javax.swing.JDialog;
import javax.swing.JFrame;

public class Testajanela {
    public static void main(String[] args) {
        
    JFrame janela = new JFrame(); //criação da janela
    janela.setTitle("Hello World!!! This is my first window!"); //titulo da janela
    janela.setSize(600, 400); //tamanho da janela
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar execução da janela
    janela.setLocationRelativeTo(null);
    //janela.setExtendedState(JFrame.MAXIMIZED_BOTH); //janela tela cheia
    janela.setVisible(true); //janela visivel
    
    JFrame janela2 = new JFrame();
    janela2.setTitle("Second Window");
    janela2.setSize(300,300);
    janela2.setVisible(true);
    
    JDialog dialogo = new JDialog(janela);
    dialogo.setTitle("First Dialogo");
    //dialogo.setModal(true);
    dialogo.setSize(200, 100);
    dialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    dialogo.setLocationRelativeTo(null);
    dialogo.setVisible(true);
   
   
    
}
}
