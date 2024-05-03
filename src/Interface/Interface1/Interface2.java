package Interface.Interface1;


interface firstInterface {
    void mth1();
    void mth2();
}

// we can extend an interface within an interface but a class can't extend an interface ,it can only implement an interface.
interface secondInterface extends firstInterface{
    void mth3();
    void mth4();
}

class MyDemoClass3 implements secondInterface {
    public void mth1() {
        System.out.println("From interface 1...");
    }

    public void mth2() {
        System.out.println("From interface 1...");
    }

    public void mth3() {
        System.out.println("From interface 2...");
    }

    public void mth4() {
        System.out.println("From interface 2...");
    }
}


public class Interface2 {
    public static void main(String[] args) {
        MyDemoClass3 mdc = new MyDemoClass3();
        mdc.mth1();
        mdc.mth2();
        mdc.mth3();
        mdc.mth4();
    }
}
