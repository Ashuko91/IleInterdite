package Modele;

import Observer.Observable;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Ile extends Observable {
    public static final int hauteur = 6, largeur = 6;
    private Zone[][] grille;
    private Random random = new Random();
    private Joueur j1;
    private Joueur j2;
    private Joueur j3;
    private Joueur j4;
    private ArrayList<Artefact> nbArte = new ArrayList<>();
    private List<Zone> l = new ArrayList<>();

    public Ile(){
        grille = new Zone[largeur][hauteur];

        for (int i=0;i<largeur;i++){
            for (int j=0;j<hauteur;j++){
                grille[i][j] = new Zone(i, j);

            }
        }
        grille[3][5].setHeliport();
        this.j1 = new Joueur("j1", grille[2][0], true, Color.RED);
        this.j2 = new Joueur("j2", grille[5][2], false, Color.GREEN);
        this.j3 = new Joueur("j3", grille[3][5], false, Color.YELLOW);
        this.j4 = new Joueur("j4", grille[0][3], false, Color.CYAN);
        randomArtefact();

    }


    public void randomFinDeTour(){
        int i = 0;
        while (i<3) {
            int x = random.nextInt(0,6);
            int y = random.nextInt(0,6);
            if (grille[x][y].getEtat().equals("NORMALE")) {
                grille[x][y].setEtat("INONDEE");
                i++;
            } else if (grille[x][y].getEtat().equals("INONDEE")) {
                grille[x][y].setEtat("SUBMERGEE");
                i++;

            }
        }
    }

    public void randomArtefact() {
        int i = 0;

        Artefact a = new Artefact("FEU");
        Artefact b = new Artefact("AIR");
        Artefact c = new Artefact("TERRE");
        Artefact d = new Artefact("EAU");
        while (i < 4) {

            int x = random.nextInt(0, 6);
            int y = random.nextInt(0, 6);
            if (grille[x][y].getArtefact().getE().equals("FEU")||grille[x][y].getArtefact().getE().equals("EAU")||grille[x][y].getArtefact().getE().equals("TERRE")||grille[x][y].getArtefact().getE().equals("AIR")) {
                if (i==0){
                    grille[x][y].setArtefact(a);
                }else if (i==1){
                    grille[x][y].setArtefact(b);
                }else if (i==2){
                    grille[x][y].setArtefact(c);
                }else if (i==3) {
                    grille[x][y].setArtefact(d);
                }
                    l.add(grille[x][y]);
                i++;

            }
        }
    }
    public ArrayList<Artefact> nb () {
        for (Artefact a : j1.getArtefact()) {
            nbArte.add(a);
        }
        for (Artefact a : j2.getArtefact()) {
            nbArte.add(a);
        }
        for (Artefact a : j3.getArtefact()) {
            nbArte.add(a);
        }
        for (Artefact a : j4.getArtefact()) {
            nbArte.add(a);
        }
        return nbArte;
    }

    public boolean testwin() {
        nb();
        if (nbArte.size()==4 && j1.getCaseJoueur() == grille[3][5] && j2.getCaseJoueur() == grille[3][5] && j3.getCaseJoueur() == grille[3][5] && j4.getCaseJoueur() == grille[3][5]) {
            return true;
        } else return false;
    }


    public Zone getZone(int i, int j) {
        return grille[i][j];
    }

    public Joueur getJ1() {
        return j1;
    }

    public Joueur getJ2() {
        return j2;
    }

    public Joueur getJ3() {
        return j3;
    }

    public Joueur getJ4() {
        return j4;
    }

    public List<Zone> getL() {
        return l;
    }
}
