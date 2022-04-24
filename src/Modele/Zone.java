package Modele;

import java.util.ArrayList;


public class Zone {
    private int x, y;
    private String etat;
    private boolean heliport;
    private ArrayList<Joueur> joueurs = new ArrayList<>();
    private Artefact artefact = new Artefact("FEU");




    public Zone(int x, int y){
        this.x = x;
        this.y = y;
        this.etat = "NORMALE";

    }

    public void assecheZone() {
        switch (this.etat){
            case "SUBMERGEE" :
                System.out.println("La zone ne peut être assechée"); break;
            case "INONDEE" :
                this.etat = "NORMALE"; break;
            case "NORMALE" :
                System.out.println("La zone est sèche"); break;
        }
    }



    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public String getEtat() {
        return etat;
    }



    public void setHeliport() {
        this.heliport = true;
    }



    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Artefact getArtefact() {
        return artefact;
    }

    public void setArtefact(Artefact artefact) {
        this.artefact = artefact;
    }


}
