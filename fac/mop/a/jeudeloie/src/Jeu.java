public class Jeu {

	public static int lanceDe(){
		return (int)(Math.random()*6+1);
	}
    public static void main (String args[]){
        Plateau p = new Plateau(30);
        System.out.println(p);
        ArrayList listeJoueur = new ArrayList<Joueur>();
        for(int i = 0; i < 3; ++i){
			listeJoueur.add(new Joueur());
        }
        int joueurABouge = 0;
        boolean partieEnCours = true;
        do{

        	Joueur j = listeJoueur.get(joueurABouge);
        	System.out.print("Le joueur "+joueurABouge+" avance de la case "+j.position);
        	j.position = j.position + lanceDe();
        	System.out.println(" à la case "+j.position+".");
        	if(j.position < p.nbCases()){
        		p.Case(j.position).evenement.agir(j);
        		joueurABouge = (joueurABouge + 1) % 
        		if(joueurABouge >= listeJoueur.size()){
        			joueurABouge = 0;
        		}
        		else{
        			partieEnCours = false;
        		}
        	}
        	else{
        		partieEnCours = false;
        	}
        	
        }
        while(j1.position < p.nbCases() && j2.position < p.nbCases()){
    		if(j1.position >= p.nbCases()){
    			break;
    		}
    		j1.position = j1.position + lanceDe();
    		p.Case(j1.position).evenement.agir(j1);
    		j2.position = j2.position + lanceDe();
    		p.Case(j1.position).evenement.agir(j1);
    		
    	}
    }


}
