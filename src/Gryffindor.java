public class Gryffindor extends  Student {
    private int nobility;

    private int honor;

    private int courage;

    public Gryffindor(String firstName, String lastName, int conjure, int transgress, int nobility, int honor, int courage) {
        super(firstName, lastName, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
        //System.out.println(nobility + honor + courage);
    }
    public void printIfo (){
        System.out.println(getFirstName() + getLastName() + getConjure() + getTransgress() + getNobility()
                + getHonor() + getCourage());
    }



    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}