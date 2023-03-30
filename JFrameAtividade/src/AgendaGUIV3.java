import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AgendaGUIV3 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon pandinhaImg = new ImageIcon("./imgs/");
    ImageIcon addImg = new ImageIcon("./imgs/icons/personadd.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/icons/person.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/personrmv.png");
    JButton botaoAdd, botaoPesq, botaoRemover;
    Agenda agenda = new AgendaSarah();

    public AgendaGUIV3() {
        setTitle("Agenda de Aniversários");
        setSize(800, 600); // tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(pandinhaImg, JLabel.CENTER);
        botaoAdd = new JButton("Adicionar", addImg);
        botaoAdd.addActionListener(new AgendaAddController(agenda, this));
        botaoPesq = new JButton("Pesquisar", pesqImg);
        botaoPesq.addActionListener(new AgendaSearchController(agenda, this));
        botaoRemover = new JButton("Remover", removeImg);
        botaoRemover.addActionListener(new AgendaRemoveController(agenda, this));

        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdd);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesq);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);

    }
}
