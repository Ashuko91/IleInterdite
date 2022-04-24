package Modele;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private String pseudo;
    private Zone caseJoueur;
    public boolean tour ;
    private int actionsRestantes = 3;
    private Color couleur;
    private List<Artefact> artefacts = new ArrayList<>();
    private List<Cle> cles = new ArrayList<>();
    private Ile ile;

    public Joueur(String pseudo, Zone caseJoueur, boolean tour, Color couleur) {
        this.pseudo = pseudo;
        this.caseJoueur = caseJoueur;
        this.tour = tour;
        this.couleur = couleur;
    }

    public void decreaseAction() {
        this.actionsRestantes--;
    }

    public void setCase(int x, int y){
        this.caseJoueur.setX(x);
        this.caseJoueur.setY(y) ;
    }

    public void deplacement(Joueur j, String s){
        switch (s){
            case "haut" :
                j.setCase(caseJoueur.getX(), caseJoueur.getY()-1);
                System.out.println(j.getCaseJoueur().getEtat());
                break;

            case "bas" :
                j.setCase(caseJoueur.getX(), caseJoueur.getY()+1);
                System.out.println(j.getCaseJoueur().getEtat());
                break;
            case "gauche" :
                j.setCase(caseJoueur.getX()-1, caseJoueur.getY());
                System.out.println(j.getCaseJoueur().getEtat());
                break;
            case "droite" :
                j.setCase(caseJoueur.getX()+1, caseJoueur.getY());
                System.out.println(j.getCaseJoueur().getEtat());
                break;
        }
    }

    public void rammasseArtefact() {
       if (!cles.isEmpty()) {
            this.artefacts.add(this.caseJoueur.getArtefact());
            ile.getL().remove(this.caseJoueur.getArtefact());
            this.caseJoueur.setArtefact(null);
        }
    }
    @Override
    public String toString() {
        String txt = "";
        for (Cle c : cles) {
            txt += c.toString() + ", ";

        }
        return "Cle : " + txt;
    }

    public String toStringa() {
        String txt = "";
        for (Artefact a : artefacts) {
            txt += a.toString() + ", ";

        }
        return "Artefact : " + txt;
    }

    public Zone getCaseJoueur() {
        return caseJoueur;
    }

    public int getActionsRestantes() {
        return actionsRestantes;
    }


    public void setActionsRestantes(int actionsRestantes) {
        this.actionsRestantes = actionsRestantes;
    }

    public void setTour(boolean tour) {
        this.tour = tour;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCles(Cle c) {
        this.cles.add(c);
    }

    public List<Artefact> getArtefact() {
        return this.artefacts;
    }
}
