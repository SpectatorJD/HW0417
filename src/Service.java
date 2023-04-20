public class Service {


    public void calculate (Gryffindor [] gryffindors ,String firstName){
        int power = 0;
        for (int i = 0; i <1; i++) {


            Gryffindor gryffindor = gryffindors[i];
            power = gryffindors[i].getCourage()+gryffindors[i].getTransgress()+gryffindors[i].getConjure()+gryffindors[i].getNobility()+gryffindors[i].getHonor();
        }
        System.out.println(power);


    }


}
