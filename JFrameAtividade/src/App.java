import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class App{
    public static void main(String[] args) {
        JFrame janela = new AgendaGUIV3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // WindowListener fechadorDeJanelaPrincipal = new WindowAdapter(){
        //     public void windowClosing(WindowEvent e){
        //         System.out.println("Inhaeee amapô");
        //         System.exit(0);
        //     }
        // };
        // janela.addWindowListener(fechadorDeJanelaPrincipal);
        //System.out.println("Hello, World!");
    }
}
