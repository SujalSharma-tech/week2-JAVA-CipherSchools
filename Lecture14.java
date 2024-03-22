
interface M {
    int x = 10;

    void fun();
}

interface N {
    int x = 20;

    void fun();
}

interface O extends M, N {
    void fun();
}

class C implements M, N {
    public void fun() {
        System.out.println("Hello, I'm function in C");
    }
}

public class Lecture14 {
    public static void main(String args[]) {

    }
}
