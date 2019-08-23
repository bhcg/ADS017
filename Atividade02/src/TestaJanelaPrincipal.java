import javax.swing.JFrame;

public class TestaJanelaPrincipal {
    
    public static void main(String[] args) {
        
        JFrame janelaPrincipal = new JFrame(); //criação da janela
        janelaPrincipal.setTitle("Janela Principal!"); //titulo da janela
        janelaPrincipal.setSize(640, 480); //tamanho da janela
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar execução da janela
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH); //janela tela cheia
        janelaPrincipal.setVisible(true); //janela visivel
        
               
}

    public TestaJanelaPrincipal() {
    }
    
}
