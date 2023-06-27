public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.print(adder.add(10, 32) + " ");
        System.out.print(adder.add(7, 6) + " ");
        System.out.print(adder.add(10, 10));
    }
}

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {

}