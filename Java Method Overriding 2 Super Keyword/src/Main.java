public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        Ancestor ancestor = new Ancestor();

        System.out.println(hello.getHello());
        System.out.println(ancestor.getHello());
    }
}

class Hello {
    String getHello() {
        return "Hello I am a motorcycle, I am a cycle with an engine.";
    }
}

class Ancestor extends Hello {
    @Override
    String getHello() {
        return "My ancestor is a cycle who is a vehicle with pedals.";
    }
}