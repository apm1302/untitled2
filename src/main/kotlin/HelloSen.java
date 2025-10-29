import iken.HelloWorld;

public class HelloSen {
    public static void sayHello() {
        System.out.println("Hello, Sen!");
        HelloWorld.hello();
    }
    public static void main(String[] args) {
        sayHello();
        System.out.println(HelloWorld.add(1145,411));
    }
}
