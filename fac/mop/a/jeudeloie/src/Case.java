public class Case {
    Evenement evenement;

    Case(Evenement e) {
        evenement = e;
    }

    public String toString(){
        if(evenement == null){
            return "Case neutre";
        }
        else {
            return "Case " + evenement;
        }
    }
}
