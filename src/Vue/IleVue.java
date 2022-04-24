package Vue;
import Modele.*;
import Observer.Observer;


import javax.swing.*;
import java.awt.*;


public class IleVue extends JPanel  implements Observer {
    private Ile ile;

    public IleVue(Ile ile) {
        this.ile = ile;
        this.setPreferredSize(new Dimension(800,600));
        ile.addObserver(this);
    }

    public void update() { repaint(); }

    private void paint(Graphics g, Zone zone,int x, int y) {
        if (zone.getEtat().equals("NORMALE") ) {
            g.setColor(Color.WHITE);
        }
        else if (zone.getEtat().equals("INONDEE")) {
            g.setColor(Color.BLUE);
        }
        else {
            g.setColor(Color.BLACK);
        }

        g.fillRect(x, y, 90, 90);
        dessineJoueur(g,ile.getJ1());
        dessineJoueur(g,ile.getJ2());
        dessineJoueur(g,ile.getJ3());
        dessineJoueur(g,ile.getJ4());
        dessineArtefact(g);

    }

    public void paintComponent(Graphics g) {

        if (ile.getJ1().tour){
            g.setColor(Color.WHITE);
            g.fillRect(600,150, 50 ,50);
            g.setColor(Color.BLACK);
            g.drawString("J1", 600, 200);
            g.drawString("" + ile.getJ1().getActionsRestantes(), 625, 200);
        }else if(ile.getJ2().tour){
            g.setColor(Color.WHITE);
            g.fillRect(600,150, 50 ,50);
            g.setColor(Color.BLACK);
            g.drawString("J2", 600, 200);
            g.drawString("" + ile.getJ2().getActionsRestantes(), 625, 200);
        }else if(ile.getJ3().tour){
            g.setColor(Color.WHITE);
            g.fillRect(600,150, 50 ,50);
            g.setColor(Color.BLACK);
            g.drawString("J3", 600, 200);
            g.drawString("" + ile.getJ3().getActionsRestantes(), 625, 200);
        }else if(ile.getJ4().tour){
            g.setColor(Color.WHITE);
            g.fillRect(600,150, 50 ,50);
            g.setColor(Color.BLACK);
            g.drawString("J4", 600, 200);
            g.drawString("" + ile.getJ4().getActionsRestantes(), 625, 200);
        }
        g.setColor(Color.WHITE);
        g.fillRect(600,250, 150 ,300);
        g.setColor(Color.BLACK);
        g.drawString("J1 "+ile.getJ1().toString(),600,300);
        g.drawString("J2 "+ile.getJ2().toString(),600,320);
        g.drawString("J3 "+ile.getJ3().toString(),600,340);
        g.drawString("J4 "+ile.getJ4().toString(),600,360);
        g.drawString("J1 "+ile.getJ1().toStringa(),600,380);
        g.drawString("J2 "+ile.getJ2().toStringa(),600,400);
        g.drawString("J3 "+ile.getJ3().toStringa(),600,420);
        g.drawString("J4 "+ile.getJ4().toStringa(),600,440);

        if (getIle().testwin()){
            g.drawString("Vous avez gagné",600,500);
        }
        super.repaint();
        for (int i = 0; i < Ile.largeur; i++) {
            for (int j = 0; j < Ile.hauteur; j++) {
                paint(g, ile.getZone(i, j),i*100 ,j*100);

            }
        }

    }

    public void dessineJoueur(Graphics g, Joueur j) {
        g.setColor(j.getCouleur());
        if (j == ile.getJ1()) {
            g.fillRect(j.getCaseJoueur().getX() * 100, j.getCaseJoueur().getY() * 100, 45, 45);
        } else if (j == ile.getJ2()) {
            g.fillRect(j.getCaseJoueur().getX() * 100 + 45, j.getCaseJoueur().getY() * 100, 45, 45);
        } else if (j == ile.getJ3()) {
            g.fillRect(j.getCaseJoueur().getX() * 100, j.getCaseJoueur().getY() * 100 + 45, 45, 45);
        } else if (j == ile.getJ4()) {
            g.fillRect(j.getCaseJoueur().getX() * 100 + 45, j.getCaseJoueur().getY() * 100 + 45, 45, 45);

        }
    }



    public void dessineArtefact(Graphics g){


        for (Zone z: ile.getL()) {
            if (z.getArtefact().getE().equals("FEU")){
                g.setColor(Color.ORANGE);
                g.fillRect(z.getX()*100+22,z.getY()*100+22,30,30);
            }else if (z.getArtefact().getE().equals("EAU")){
                g.setColor(Color.MAGENTA);
                g.fillRect(z.getX()*100+22,z.getY()*100+22,30,30);
            }else if (z.getArtefact().getE().equals("TERRE")){
                g.setColor(Color.GRAY);
                g.fillRect(z.getX()*100+22,z.getY()*100+22,30,30);
            }else if (z.getArtefact().getE().equals("AIR")){
                g.setColor(Color.PINK);
                g.fillRect(z.getX()*100+22,z.getY()*100+22,30,30);
            }
        }



    }
    public Ile getIle() {
        return ile;
    }
}
