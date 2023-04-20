public class Service {


    public void calculate(Gryffindor[] gryffindors) {
        if (gryffindors != null){
            for (Gryffindor gryffindor: gryffindors) {
                int power = gryffindor.getCourage()+ gryffindor.getHonor()+ gryffindor.getNobility()+ gryffindor.getConjure()+ gryffindor.getTransgress();
                System.out.println(power);
            }
        }

    }


}
