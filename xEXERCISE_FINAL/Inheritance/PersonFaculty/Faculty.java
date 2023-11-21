package xEXERCISE_FINAL.Inheritance.PersonFaculty;

public class Faculty extends Employee {
    private String initial;
    private String rank;
    
    Faculty() {
    }
    Faculty(String initial, String rank) {
        this.initial = initial;
        this.rank = rank;
    }
    public Faculty(String id, String department, double salary, String initial, String rank) {
        super(id, department, salary);
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
        return "Faculty [name=" + getName() + ", salary=" + getSalary() + ", initial=" + initial + ", rank=" + rank + "]";
    }

}
