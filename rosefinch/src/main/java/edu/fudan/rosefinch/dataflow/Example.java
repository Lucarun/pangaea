package edu.fudan.rosefinch.dataflow;

/**
 * User: luca
 * Date: 2024/11/21
 * Description:
 */
public class Example {

    public static void main(String[] args) {
        B b = new B();
        b.f1 = Benchmark.source();
        b.f2 = "safe";

        D d = new D();
        d.f1 = "safe";
        C c = new C();
        c.f1 = d;

        String s = "safe";

        A a = operation(b, c, s);

    }



    private static A operation(B b, C c, String s){
        A a = new A();
        a.f1 = b.f1;
        a.f2 = c.f1.f2;
        a.f3 = s;
        return a;
    }

}
