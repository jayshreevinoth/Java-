import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class Lambda_Expressions {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.forEach((n) -> {
            System.out.println(n);
        });
        /*
         * Lambda expressions can be stored in variables if the variable's type is an
         * interface which has only one method. The lambda expression should have the
         * same number of parameters and the same return type as that method. Java has
         * many of these kinds of interfaces built in, such as the Consumer interface
         * (found in the java.util package) used by lists.
         */

        System.out.println("Execution 2");
        Consumer<Integer> lamda = ((n) -> {
            System.out.println(n);
        });
        num.forEach(lamda);

        StringFunction exclam = (s) -> (s) + '!';
        StringFunction ques = (s) -> (s) + '?';
        printFormat("Hello", exclam);
        printFormat("Hello", ques);

    }

    public static void printFormat(String str, StringFunction f) {
        System.out.println(f.run(str));
    }
}
