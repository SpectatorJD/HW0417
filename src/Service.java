

public class Service {
private Gryffindor [] gryffindors;
    public void calculate() {
        System.out.println("Гриффиндор");
        int perks= 0;
        for (Gryffindor gryffindor: gryffindors ) {
            if(gryffindor !=null){
                perks = gryffindor.getPerksPower1()+gryffindor.getPerksPower2();
            }
        }
        System.out.println(perks);
    }

}
