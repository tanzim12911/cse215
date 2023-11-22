package lab13.Task2;

public class Quiz {
    private int id;
    private int mark;

    Quiz() {

    }
    Quiz(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    @Override
    public String toString() {
        return "Quiz [id=" + id + ", mark=" + mark + "]";
    }
    
}
