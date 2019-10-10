
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestaCaixaVerificacao {
   
    static int qtdAssunto = 0;
    
    public static void main(String[] args) {
   
        JLabel rotulo = new JLabel("Escolha os assuntos:");
        
        
        ActionListener ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              JCheckBox caixaVerificacao = (JCheckBox) e.getSource();
              if(caixaVerificacao.isSelected()){
                  qtdAssunto++;
              } else{
                  qtdAssunto--;
              }
            }
        };
        
        JCheckBox assuntoEconomia = new JCheckBox("Economia");
        JCheckBox assuntoEsporte = new JCheckBox("Esporte");
        JCheckBox assuntoPolitica = new JCheckBox("Política");
        JCheckBox assuntoLazer = new JCheckBox("Lazer");
        JCheckBox assuntoReligiao = new JCheckBox("Religião");
        JCheckBox assuntoTecnologia = new JCheckBox("Tecnologia");
        
        GridLayout leiaute = new GridLayout(10, 5);
        JPanel painel = new JPanel(leiaute);
        painel.add(rotulo);
        painel.add(assuntoEconomia);
        painel.add(assuntoEsporte);
        painel.add(assuntoPolitica);
        painel.add(assuntoLazer);
        painel.add(assuntoReligiao);
        painel.add(assuntoTecnologia);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        
        
        
}
}
