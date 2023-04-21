public class Service {


    private Gryffindor[] gryffindors;



    public void calculate(String firstName) {
        System.out.println("Гриффиндор");
        this.gryffindors = gryffindors;
        int perks = 0;
        if (gryffindors != null) {
            for (int i = 0; i < gryffindors.length; i++) {

                perks = gryffindors[i].getConjure() + gryffindors[i].getTransgress();

            }
            System.out.println(perks);
        }

    }
}



