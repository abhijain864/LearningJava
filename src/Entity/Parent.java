package Entity;

public class Parent {
    int a;
    public int b;
    private int c;

    Parent(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Parent(){

    }
    protected int getA(){
        return a;
    }

    int getB(){
        return b;
    }

    public int getC(){
        return c;
    }

    private void getD(){

    }
}
