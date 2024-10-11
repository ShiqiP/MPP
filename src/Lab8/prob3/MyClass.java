package Lab8.prob3;

import java.util.function.Predicate;

public class MyClass {

    int x=1;
    String y="A";
    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }

    Predicate<MyClass> cl1=(MyClass mc)->this.equals(mc);
    Predicate<MyClass> cl2=this::equals;

    public void myMethod(MyClass mc1) {
        System.out.println(cl2.test(mc1));
    }

    @Override
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(ob.getClass() != getClass()) return false;
        MyClass mc = (MyClass)ob;
        return mc.x == x && mc.y.equals(y);
    }
    public static void main(String[] args) {
        MyClass myclass = new MyClass(1, "A");
        MyClass myclass1 = new MyClass(1,"B");
        myclass.myMethod(myclass); //
        myclass.myMethod(myclass1);
    }

}
