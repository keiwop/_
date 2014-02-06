public class EvenementPrison extends Evenement{
    private int duree;

    EvenementPrison(int d) {
        this.duree = d;
    }

    void agir(Joueur j){
        j.prison = duree;
    }

    public String toString(){
        return "Prison " + duree;
    }
}
