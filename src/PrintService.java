public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Гриффиндор");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindor.getFirstName()+" "+gryffindor.getLastName()+ " колдовство " +gryffindor.getConjure()+ "||"+
                    " трансгрессия " +gryffindor.getTransgress() +"||"+ " благородство "+ gryffindor.getNobility()+ "||"
                    +" честь "+gryffindor.getHonor() +"||"+ " храбрость " + gryffindor.getCourage());
        }
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Когтевран");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaw.getFirstName()+" "+ravenclaw.getLastName()+ " колдовство " +ravenclaw.getConjure()+ "||"+
                    " трансгрессия " +ravenclaw.getTransgress() +"||"+ " ум "+ ravenclaw.getSmart()+ "||"
                    +" мудрость "+ravenclaw.getWise() +"||"+ " творчество " + ravenclaw.getCreativity());
        }
    }
    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Пуффендуй");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuff.getFirstName()+" "+hufflepuff.getLastName()+ " колдовство " +hufflepuff.getConjure()+ "||"+
                    " трансгрессия " +hufflepuff.getTransgress() +"||"+ " трудолюбие "+ hufflepuff.getHardWork()+ "||"
                    +" верность "+hufflepuff.getLoyalty() +"||"+ " честность " + hufflepuff.getHonesty());
        }
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("Пуффендуй");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherin.getFirstName()+" "+slytherin.getLastName()+ " колдовство " +slytherin.getConjure()+ "||"+
                    " трансгрессия " +slytherin.getTransgress() +"||"+ " хитрость "+ slytherin.getCunning()+ "||"
                    +" решительность "+slytherin.getDetermination() +"||"+ " амбициозность " + slytherin.getAmbition()+"||"
                    + " находчивость " + slytherin.getResourcefulness()+ "||"+ " жажда власти " + slytherin.getLustPower());
        }
    }
}