import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AgendaAddController implements ActionListener{
    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaAddController(Agenda agenda, JFrame janela){
        this.agenda = agenda;
        this.janelaPrincipal= janela;
    }

    public void actionPerformed(ActionEvent e){
        String nome = JOptionPane.showInputDialog(janelaPrincipal, "Nome do aniversariante: ");
        int dia = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o dia do mês em que nasceu? " ));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o mês em que nasceu? " ));
        boolean cadastrou = this.agenda.cadastraContato(nome, dia, mes);
        if(cadastrou){
            JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariante cadastrado");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariante não cadastrado");
        }
    }
}
