//access modifiers, instances
// all four types of access modifiers and it's uses

public class Lecture15 {
    int x = 10;
    private int y = 15;
    public int z = 20;
    protected int w = 25;

    public static void main(String[] args) {
        Lecture15 ob = new Lecture15();
        // Within the class default ,public ,private and protected are accessible
        System.err.println(ob.x);
        System.err.println(ob.y);
        System.err.println(ob.z);
        System.err.println(ob.w);
    }
}

/*
 * public class B {
 * public static void main(String[] args) {
 * A ob1=new A();
 * }
 * }
 */

/*
 * public class C extends A {
 * public static void main(String[] args) {
 * A ob2=new A();
 * //default and private are not accessible outside packge
 * //System.out.println(ob2.x);
 * // System.out.println(ob2.y);
 * // System.out.println(ob2.z);
 * // System.out.println(ob2.w);
 * }
 * }
 * 
 */