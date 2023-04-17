public class Student {
    private String firstName;
    private String lastName;
    private String perks1;
    private String perks2;
    private String perks3;
    private int perksPower1;
    private int perksPower2;
    private int perksPower3;
    public Student(String firstName, String lastName, String perks1,int perksPower1, String perks2, int perksPower2, String perks3,
                    int perksPower3) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.perks1 = perks1;
        this.perks2 = perks2;
        this.perks3 = perks3;
        this.perksPower1 = perksPower1;
        this.perksPower2 = perksPower2;
        this.perksPower3 = perksPower3;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPerks1() {
        return perks1;
    }

    public void setPerks1(String perks1) {
        this.perks1 = perks1;
    }

    public int getPerksPower1() {
        return perksPower1;
    }

    public void setPerksPower1(int perksPower1) {
        this.perksPower1 = perksPower1;
    }

    public String getPerks2() {
        return perks2;
    }

    public void setPerks2(String perks2) {
        this.perks2 = perks2;
    }

    public String getPerks3() {
        return perks3;
    }

    public void setPerks3(String perks3) {
        this.perks3 = perks3;
    }

    public int getPerksPower2() {
        return perksPower2;
    }

    public void setPerksPower2(int perksPower2) {
        this.perksPower2 = perksPower2;
    }

    public int getPerksPower3() {
        return perksPower3;
    }

    public void setPerksPower3(int perksPower3) {
        this.perksPower3 = perksPower3;
    }
}
