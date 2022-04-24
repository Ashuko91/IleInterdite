package Vue;

import Modele.Controleur;
import Modele.Ile;

import javax.swing.*;
import java.awt.*;

public class Vue extends JFrame {
    private JFrame fenetre;
    private JFrame fin;
    private IleVue vueile;
    private Controleur boutons;


    public Vue(Ile ile){
        super();
        fenetre = new JFrame();
        fenetre.setTitle("L'Ile Interdite");
        fenetre.setLayout(new BorderLayout());
        vueile = new IleVue(ile);
        fenetre.add(vueile, BorderLayout.WEST);
        boutons = new Controleur(ile);
        fenetre.add(boutons, BorderLayout.EAST);
        fenetre.pack();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
    }
}
