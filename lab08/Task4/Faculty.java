package lab08.Task4;

public class Faculty extends Employee {
    private String initial;
    private String rank;
    
    public Faculty() {

    }
    public Faculty(String initial, String rank) {
        this.initial = initial;
        this.rank = rank;
    }

    public Faculty(String name, String gender, int age, String initial, String rank) {
        super(name, gender, age);
        this.initial = initial;
        this.rank = rank;
    }
    
    public String getInitial() {
        return initial;
    }
    public void setInitial(String initial) {
        this.initial = initial;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
}
