public class MyFirstApp {


    public static void main(String[] args) {
        System.out.println("it's main");
        Dog.bark(6);
        Cat.meow();
        System.out.println("-------");
        whileLoopsDemo();
        System.out.println("-------");
        forLoopsDemo();
        System.out.println("-------");
        doWhileLoopsDemo();
    }

    public static void whileLoopsDemo() {
        int x = 20;
        while (x > 12) {
            System.out.println(x);
            x = x - 1;
        }
    }

    public static void forLoopsDemo() {
        for (int i = 20; i > 12; i=i-2) {
            System.out.println(i);
        }
    }

    public static void doWhileLoopsDemo() {
        int x = 30;
        do {
            System.out.println(x);
            x = x - 1;
        } while (x > 25);
    }
}
