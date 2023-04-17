public class PrintService {

    public void print(Gryffindor[] gryffindors) {
        System.out.println("Гриффиндор");
        for (int i = 0; i < gryffindors.length ; i++) {
            Gryffindor gryffindor = gryffindors [i];
            System.out.println(gryffindor.getFirstName()+ " " + gryffindor.getLastName()+ " " + " Свойства характера: " + gryffindor.getPerks1()+ " " + "мощь "
                    + gryffindor.getPerksPower1()+ " ||" + " " + gryffindor.getPerks2()+ " " + "мощь " + gryffindor.getPerksPower2()+ " ||" + " " +
                    gryffindor.getPerks3() + " " + "мощь " + gryffindor.getPerksPower3());
        }
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("Слизерин");
        for (int i = 0; i < slytherins.length ; i++) {
            Slytherin slytherin = slytherins [i];
            System.out.println(slytherin.getFirstName()+ " " + slytherin.getLastName()+ " " + " Свойства характера: " + slytherin.getPerks1()+ " " + "мощь "
                    + slytherin.getPerksPower1()+ " ||" + " " + slytherin.getPerks2()+ " " + "мощь " + slytherin.getPerksPower2()+ " ||" + " " +
                    slytherin.getPerks3() + " " + "мощь " + slytherin.getPerksPower3());
        }
    }
    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Пуффендуй");
        for (int i = 0; i < hufflepuffs.length ; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuff.getFirstName()+ " " + hufflepuff.getLastName()+ " " + " Свойства характера: " + hufflepuff.getPerks1()+ " " + "мощь "
                    + hufflepuff.getPerksPower1()+ " ||" + " " + hufflepuff.getPerks2()+ " " + "мощь " + hufflepuff.getPerksPower2()+ " ||" + " " +
                    hufflepuff.getPerks3() + " " + "мощь " + hufflepuff.getPerksPower3());
        }
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Когтевран");
        for (int i = 0; i < ravenclaws.length ; i++) {
            Ravenclaw ravenclaw = ravenclaws [i];
            System.out.println(ravenclaw.getFirstName()+ " " + ravenclaw.getLastName()+ " " + " Свойства характера: " + ravenclaw.getPerks1()+ " " + "мощь "
                    + ravenclaw.getPerksPower1()+ " ||" + " " + ravenclaw.getPerks2()+ " " + "мощь " + ravenclaw.getPerksPower2()+ " ||" + " " +
                    ravenclaw.getPerks3() + " " + "мощь " + ravenclaw.getPerksPower3());
        }
    }
}

