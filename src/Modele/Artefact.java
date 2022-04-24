package Modele;

public class Artefact {
    private String e;

    public Artefact(String e){
        this.e = e;

    }
    @Override
    public String toString() {
        return e;
    }
    public void setE(String e) {
        this.e = e;
    }

    public String getE() {
        return e;
    }
}
