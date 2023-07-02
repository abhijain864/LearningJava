package Entity;

public class Teacher {
    public static void main(String[] args) {
        Parent p = new Parent();
        // Same package as Parent class
        // Hence we can access default(access modifier) methods, in this case getB()
        p.getB();

        // getA() is a protected method, but since we are currently in the same package as Parent, we can access it
        p.getA();
    }
}
