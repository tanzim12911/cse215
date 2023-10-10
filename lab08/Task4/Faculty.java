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
    public Faculty(String name, String gender, int age, String id, String departement, double salary, String initial,
            String rank) {
        super(name, gender, age, id, departement, salary);
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

    @Override
    public String toString() {
        return super.toString() + "\ninitial: " + initial + "\nrank: " + rank;
    }
}
