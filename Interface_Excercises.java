interface firstInterface {
    void printFirst();
}

interface secondInterface {
    void printSecond();
}

class Demo implements firstInterface, secondInterface {

    public void printFirst() {
        System.out.println("first");
    }

    public void printSecond() {
        System.out.println("second");
    }
}

public class Interface_Excercises {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.printFirst();
        obj.printSecond();
        print(obj);
    }

    static void print(firstInterface first) {
        first.printFirst();
    }
}