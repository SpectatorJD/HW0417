import java.util.Arrays;

public class Service {
    private Gryffindor [] gryffindors;
    public Service () {
        this.gryffindors=new Gryffindor[2];
    }


    private int i;

    public void calculatePowerWithFaculty(Gryffindor[] gryffindors) {

        int maxPower = gryffindors[0].getCourage() + gryffindors[0].getTransgress()
                + gryffindors[0].getConjure() + gryffindors[0].getNobility() + gryffindors[0].getHonor();
        for (int i = 0; i < gryffindors.length; i++) {

            if (gryffindors[i].getCourage() + gryffindors[i].getTransgress() + gryffindors[i].getConjure()
                    + gryffindors[i].getNobility() + gryffindors[i].getHonor() > maxPower) {
                maxPower = gryffindors[i].getCourage() + gryffindors[i].getTransgress()
                        + gryffindors[i].getConjure() + gryffindors[i].getNobility() + gryffindors[i].getHonor();
            }
        }
        Gryffindor gryffindor = gryffindors[i];
        System.out.println("Лучшим учеником Гриффиндора является " + gryffindor.getFirstName() + " у него " + maxPower + " баллов");
    }

    public void calculatePowerWithFaculty(Slytherin[] slytherins) {
        int maxPower = slytherins[0].getConjure() + slytherins[0].getTransgress()
                + slytherins[0].getConjure() + slytherins[0].getCunning() + slytherins[0].getDetermination() + slytherins[0].getAmbition()
                + slytherins[0].getResourcefulness() + slytherins[0].getLustPower();
        for (int i = 0; i < slytherins.length; i++) {
            if (slytherins[i].getConjure() + slytherins[i].getTransgress()
                    + slytherins[i].getConjure() + slytherins[i].getCunning() + slytherins[i].getDetermination() + slytherins[i].getAmbition()
                    + slytherins[i].getResourcefulness() + slytherins[i].getLustPower() > maxPower) {
                maxPower = slytherins[i].getConjure() + slytherins[i].getTransgress()
                        + slytherins[i].getConjure() + slytherins[i].getCunning() + slytherins[i].getDetermination() + slytherins[i].getAmbition()
                        + slytherins[i].getResourcefulness() + slytherins[i].getLustPower();
            }
        }
        Slytherin slytherin = slytherins[i];
        System.out.println("Лучшим учеником Слизерина является  " + slytherin.getFirstName() + " у него " + maxPower + " баллов");
    }

    public void calculatePowerWithFaculty(Hufflepuff[] hufflepuffs) {
        int maxPower = hufflepuffs[0].getConjure() + hufflepuffs[0].getTransgress()
                + hufflepuffs[0].getConjure() + hufflepuffs[0].getHardWork() + hufflepuffs[0].getLoyalty() + hufflepuffs[0].getHonesty();
        for (int i = 0; i < hufflepuffs.length; i++) {
            if (hufflepuffs[i].getConjure() + hufflepuffs[i].getTransgress()
                    + hufflepuffs[i].getConjure() + hufflepuffs[i].getHardWork() + hufflepuffs[i].getLoyalty() + hufflepuffs[i].getHonesty() > maxPower) {
                maxPower = hufflepuffs[i].getConjure() + hufflepuffs[i].getTransgress()
                        + hufflepuffs[i].getConjure() + hufflepuffs[i].getHardWork() + hufflepuffs[i].getLoyalty() + hufflepuffs[i].getHonesty();
            }

        }
        Hufflepuff hufflepuff = hufflepuffs[i];
        System.out.println("Лучшим учеником Пуфендуя является  " + hufflepuff.getFirstName() + " у него " + maxPower + " баллов");
    }
    public void calculatePowerWithFaculty(Ravenclaw[] ravenclaws) {
        int maxPower = ravenclaws[0].getConjure() + ravenclaws[0].getTransgress()
                + ravenclaws[0].getConjure() + ravenclaws[0].getSmart() + ravenclaws[0].getWise() + ravenclaws[0].getWitty()
                + ravenclaws[i].getCreativity();
        for (int i = 0; i < ravenclaws.length; i++) {
            if (ravenclaws[i].getConjure() + ravenclaws[i].getTransgress()
                    + ravenclaws[i].getConjure() + ravenclaws[i].getSmart() + ravenclaws[i].getWise() + ravenclaws[i].getWitty()
                    + ravenclaws[i].getCreativity() > maxPower) {
                maxPower = ravenclaws[i].getConjure() + ravenclaws[i].getTransgress()
                        + ravenclaws[i].getConjure() + ravenclaws[i].getSmart() + ravenclaws[i].getWise() + ravenclaws[i].getWitty()
                        + ravenclaws[i].getCreativity();
            }

        }
        Ravenclaw ravenclaw = ravenclaws[i];
        System.out.println("Лучшим учеником Когтеврана является  " + ravenclaw.getFirstName() + " у него " + maxPower + " баллов");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Arrays.equals(gryffindors, service.gryffindors);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(gryffindors);
    }
}
