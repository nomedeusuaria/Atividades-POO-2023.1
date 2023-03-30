import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AgendaSearchController implements ActionListener {
    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaSearchController(Agenda agenda, JFrame janela){
        this.agenda = agenda;
        this.janelaPrincipal = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int dia = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o dia do mês a pesquisar? "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o mês a pesquisar? "));
        Collection<Contato> aniversariantes = agenda.pesquisaAniversariantes(dia, mes);
        if(aniversariantes.size()>0){
            JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariantes encontrados: " + aniversariantes);
            for (Contato c: aniversariantes){
                JOptionPane.showMessageDialog(janelaPrincipal, c.toString());
            }
    } else {
        JOptionPane.showMessageDialog(janelaPrincipal, "Não foi encontrado nenhum aniversariante nesta data.");
    }
}
}
