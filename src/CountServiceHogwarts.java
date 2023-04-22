import java.util.Arrays;
import java.util.Objects;

public class CountServiceHogwarts {
    private Gryffindor [] gryffindors;
    private Slytherin [] slytherins;
    private Hufflepuff [] hufflepuffs;
    private Ravenclaw [] ravenclaws;

    public CountServiceHogwarts () {
        this.gryffindors = new Gryffindor[2];
        this.slytherins = new Slytherin[2];
        this.hufflepuffs = new Hufflepuff[2];
        this.ravenclaws = new Ravenclaw[2];
    }


    private int i;
    public void calculatePowerWithFaculty(Gryffindor first, Gryffindor second){
        System.out.println("Гриффиндор ");
        var firstPoints = first.getHonor()+ first.getNobility()+first.getCourage();
        var secondPoints = second.getHonor()+second.getNobility()+second.getCourage();
        if (firstPoints>secondPoints){
    System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной " + firstPoints +
            " Ученик " + second.getFirstName() + second.getLastName() + " обладает мощью равной " + secondPoints + ", следоватально "
            + first.getFirstName() + first.getLastName() + " мощнее " + second.getFirstName() + second.getLastName());}
    else if (firstPoints<secondPoints){
    System.out.println("Ученик " + first.getFirstName() + first.getLastName()+ " обладает мощью равной "+ firstPoints +
            " Ученик " + second.getFirstName()+second.getLastName() + " обладает мощью равной " + secondPoints + ", следоватально "
            + second.getFirstName() + second.getLastName() + " мощнее " + first.getFirstName() + first.getLastName());}
    else {
    System.out.println("Ученик " + first.getFirstName() + first.getLastName()+ " обладает мощью равной "+ firstPoints +
            " Ученик " + second.getFirstName() + second.getLastName() + " обладает мощью равной " + secondPoints + ", следоватально их мощь равна ");
}

    }
    public void calculatePowerWithFaculty(Slytherin first, Slytherin second){
        System.out.println("Слизерин ");
        var firstPoints = first.getCunning() + first.getDetermination() + first.getAmbition() + first.getResourcefulness()+ first.getLustPower();
        var secondPoints = second.getCunning()+ second.getDetermination()+second.getAmbition()+second.getResourcefulness()+ second.getLustPower();
        if (firstPoints>secondPoints){
            System.out.println("Ученик " + first.getFirstName() +  first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName() + " обладает мощью равной " + secondPoints + ", следоватально "
                    + first.getFirstName() + first.getLastName()  + " мощнее " + second.getFirstName() + second.getLastName());}
        else if (firstPoints<secondPoints){
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName()+ second.getLastName() + " обладает мощью равной " + secondPoints + ", следоватально "
                    + second.getFirstName() + second.getLastName() + " мощнее " + first.getFirstName() + first.getLastName() );}
        else {
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName() + " обладает мощью равной " + secondPoints + ", следоватально их мощь равна ");
        }

    }
    public void calculatePowerWithFaculty(Hufflepuff first, Hufflepuff second){
        System.out.println("Пуффендуй ");
        var firstPoints = first.getHardWork()+ first.getLoyalty()+first.getHonesty();
        var secondPoints = second.getHardWork()+ second.getLoyalty()+second.getHonesty();
        if (firstPoints>secondPoints){
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName()  + " обладает мощью равной " + secondPoints + ", следоватально "
                    + first.getFirstName() + first.getLastName()  + " мощнее " + second.getFirstName() + second.getLastName() );}
        else if (firstPoints<secondPoints){
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName()  + " обладает мощью равной " + secondPoints + ", следоватально "
                    + second.getFirstName() + second.getLastName()  + " мощнее " + first.getFirstName() + first.getLastName() );}
        else {
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName()  + " обладает мощью равной " + secondPoints + ", следоватально их мощь равна ");
        }

    }
    public void calculatePowerWithFaculty(Ravenclaw first, Ravenclaw second){
        System.out.println("Когтевран ");
        var firstPoints = first.getSmart()+ first.getWitty()+first.getWise()+first.getCreativity();
        var secondPoints = second.getSmart()+ second.getWitty()+second.getWise()+second.getCreativity();
        if (firstPoints>secondPoints){
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName()  + " обладает мощью равной " + secondPoints + ", следоватально "
                    + first.getFirstName() + first.getLastName()  + " мощнее " + second.getFirstName() + second.getLastName() );}
        else if (firstPoints<secondPoints){
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName()  + " обладает мощью равной " + secondPoints + ", следоватально "
                    + second.getFirstName() + second.getLastName()  + " мощнее " + first.getFirstName() + first.getLastName() );}
        else {
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName()  + " обладает мощью равной " + secondPoints + ", следоватально их мощь равна ");
        }

    }
    public void countAnyStudent (Student first, Student second) {
        System.out.println(" Серди всех учеников Хогвардс ");
        var firstPoints = first.getConjure()+ first.getTransgress();
        var secondPoints = second.getConjure()+second.getTransgress();
        if (firstPoints>secondPoints){
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName()  + " обладает мощью равной " + secondPoints + ", следоватально "
                    + first.getFirstName() + first.getLastName()  + " мощнее " + second.getFirstName() + second.getLastName() );}
        else if (firstPoints<secondPoints){
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName()  + " обладает мощью равной " + secondPoints + ", следоватально "
                    + second.getFirstName() + second.getLastName()  + " мощнее " + first.getFirstName() + first.getLastName() );}
        else {
            System.out.println("Ученик " + first.getFirstName() + first.getLastName() + " обладает мощью равной "+ firstPoints +
                    " Ученик " + second.getFirstName() + second.getLastName()  + " обладает мощью равной " + secondPoints + ", следоватально их мощь равна ");
        }
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountServiceHogwarts service = (CountServiceHogwarts) o;
        return i == service.i && Arrays.equals(gryffindors, service.gryffindors) && Arrays.equals(slytherins, service.slytherins) && Arrays.equals(hufflepuffs, service.hufflepuffs) && Arrays.equals(ravenclaws, service.ravenclaws);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(i);
        result = 31 * result + Arrays.hashCode(gryffindors);
        result = 31 * result + Arrays.hashCode(slytherins);
        result = 31 * result + Arrays.hashCode(hufflepuffs);
        result = 31 * result + Arrays.hashCode(ravenclaws);
        return result;
    }
}
