package mypackage;

import org.trueno.driver.lib.core.Trueno;

public class MyClass {
    private static Trueno trueno = new Trueno();

    public static void main(String[] args) {
        //Using Java 8 Lambdas
        trueno.connect(
            connSocket -> System.out.println("Connected: " + connSocket.id()),
            discSocket -> System.out.println("Disconnected" + discSocket.id()));
    }
}