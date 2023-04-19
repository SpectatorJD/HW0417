public class Hufflepuff extends  Student {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int conjure, int transgress, int hardWork, int loyalty, int honesty) {
        super(firstName, lastName, conjure, transgress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
        //System.out.println(hardWork + loyalty + honesty);
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
