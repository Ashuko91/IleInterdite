package Modele;

public class Cle {
    private String e;

    public Cle(String e){
        this.e = e;
    }

    @Override
    public String toString() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }
}
