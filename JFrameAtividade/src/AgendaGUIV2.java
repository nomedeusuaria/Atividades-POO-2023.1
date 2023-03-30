import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AgendaGUIV2 extends JFrame {

    JLabel linha1, linha2;
    ImageIcon pandinhaImg = new ImageIcon("./imgs/proxy.jpg");

    public AgendaGUIV2() {
        System.out.println(pandinhaImg);
        setTitle("Agenda de Aniversários");
        setSize(400, 400); // tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(pandinhaImg, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3, 1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }
}
