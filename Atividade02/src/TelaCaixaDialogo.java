
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TelaCaixaDialogo {
    
    public static void main(String[] args) {
        
        JDialog caixaDialogo = new JDialog();
        caixaDialogo.setTitle("Caixa de Dialogo!");
        //caixaDialogo.setModal(true);
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        caixaDialogo.setLocationRelativeTo(null);
        caixaDialogo.setVisible(true);
}
    
}
