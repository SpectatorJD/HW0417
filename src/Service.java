public class Service {


    public void calculate(Gryffindor[] gryffindors) {
        if (gryffindors != null) {
            int power = 0;
            for (Gryffindor gryffindor : gryffindors) {
                power = gryffindor.getCourage() + gryffindor.getHonor() + gryffindor.getNobility() + gryffindor.getConjure()
                        + gryffindor.getTransgress();
                System.out.println(power);
            }

        }

    }


}
