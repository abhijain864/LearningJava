package TestPkg;

import Entity.Parent;

public class Student extends Parent {
    public String name;
    protected int nicName;

    public static void main(String[] args) {
        Parent p = new Parent();

//        p.getB();
        // getB() is packagePrivate in class Parent, and since we
        //are trying to access from a class outside it's package
        // we are not able to access it


//        p.getA();
        // getA() is a protected method in class Parent, and since
        // we are neither residing in the same package as Parent class.
        // nor are we a child class of it, hence getA() method cannot be accesses




    }
}
