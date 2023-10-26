package assignment_03.q1;

public class SubClass extends SuperClass
{
    public SubClass(int x) {
        super(x); 
    }
    public void display()
    {
        add(2);
        super.display();
    }
}
