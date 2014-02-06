import java.util.ArrayList;

public class Plateau {
    private ArrayList<Case> liste;
	
	public int nbCases(){
		return liste.size();
	}
	
	public Case Case()
	
    Plateau(int nbCases) {
        liste = new ArrayList<Case>();
        liste.add(new Case(null));
        for(int i = 0; i < nbCases; i++){
            Evenement e = null;
            if(Math.random() < 0.1){
                e = new EvenementPrison((int)(Math.random()*5+1));
            }
            else if(Math.random() < 0.3){
                int m = 0;
                do {
                    m = (int)(Math.random()*5 - Math.random()*5);
                }while(m == 0);
                if(i + m > nbCases){
                    m = nbCases - i;
                }
                if(m > 0 || (m < 0 && !testCycle(i, i+m))){
                    e = new EvenementMouvement(m);
                }
            }
            liste.add(new Case(e));
        }
    }

    boolean testCycle (int positionDepart, int positionCourante){
        if(positionDepart == positionCourante){
            return true;
        }
        else if(positionCourante > liste.size() || !(liste.get(positionCourante).evenement instanceof EvenementMouvement)){
            return false;
        }
        else {
            int mouve = ((EvenementMouvement)(liste.get(positionCourante).evenement)).mouvement;
            return testCycle(positionDepart, positionCourante + mouve);
        }
    }

    public String toString(){
        return liste.toString();
    }

    public static void main (String args[]){
        Plateau p = new Plateau(100);
        System.out.println(p);
    }
}
