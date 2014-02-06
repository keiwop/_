public class EvenementMouvement extends Evenement{
    int mouvement;

    EvenementMouvement(int m) {
        mouvement = m;
    }

    void agir(Joueur j){
        j.position += mouvement;
    }

    public String toString(){
        if(mouvement > 0){
            return "Avancer de " + mouvement + " cases";
        }
        else {
            return "Reculer de " + Math.abs(mouvement) + " cases";
        }
    }
}
