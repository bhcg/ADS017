import javax.swing.JOptionPane;

public class TestaJOptionPane {
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog("Entre com um valor:");
        String opcao = JOptionPane.showInputDialog("Escolha uma opção:");
        
        JOptionPane.showMessageDialog(null, "O valor informado foi " + valor);
        JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
        JOptionPane.showMessageDialog(null, "O sistema estará em manutenção das 23hs a 04hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um campo obrigatório.", "Alerta", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Falha na operação! Contate o gestor.", "Erro", JOptionPane.ERROR_MESSAGE);
        
}
}
