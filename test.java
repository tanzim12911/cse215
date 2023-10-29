class SuperClass
{
    protected int x = 0;
    
    public SuperClass(int x) {
        this.x = x;
    }
    private void increment() {
        x++; 
    }
    protected final void add(int y) {
        x += y;
    }
    public void display() {
        System.out.println(x);
    }
}


public class SubClass extends SuperClass {
    
    public SubClass(int x) {
        super(x); 
    }
    
    public void display() {
        add(2);
        super.display();
    }


    public static void main(String [] args) {
        SuperClass sc = new SuperClass(3);
        sc.display();
        sc = new SubClass(3);
        sc.display();
    }
}