public class Dog {

    public String name;
    public int age;
    public String lastName;
    public static void bark(int dogAge) {
        if (dogAge < 5){
            System.out.println("bark bark.. It's my birthday, I'm " + dogAge);
        }
    }
}
