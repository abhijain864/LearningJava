package TestPkg;

import Entity.Parent;

public class ParentExtendingClass extends Parent {
    public static void main(){
        Parent p = new Parent();

//        p.getB();
        // getB() is packagePrivate in class Parent, and since we
        //are trying to access from a class outside it's package
        // we are not able to access it


        p.getC();
        //Since we are a child class of class Parent,
        // we can access protected methods
    }
}
