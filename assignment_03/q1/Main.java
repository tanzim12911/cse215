package assignment_03.q1;

public class Main {
    public static void main(String [] args)
    {
        SuperClass sc = new SuperClass(3);
        sc.display();
        sc = new SubClass(3);
        sc.display();
    }
}
