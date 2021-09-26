import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        System.out.println("Ćwiczenie 4");
        System.out.println("Arytmetyczne:");
        boolean a = true, b = true, c = false;
        System.out.println("(a && b) : " + (a && b)); //t
        System.out.println("(a && c) : " + (a && c)); //f
        System.out.println("!(a && b) : " + !(a && b)); //f
        System.out.println("!a : " + !a); //f
        System.out.println("!b : " + !b); // f
        System.out.println("!c : " + !c); // t
        System.out.println("!((b && c) || (!c || a) : " + !((b && c) || (!c || a))); // f
        System.out.println("Logiczne:");
        int d=3, e=7, f=10;
        System.out.println("(d == f) : " + (d==f)); //f
        System.out.println("(f != e) : " + (f != e)); //t
        System.out.println("(e > f) : " + (e > f)); //f
        System.out.println("(e < f) : " + (e < f)); //t
        System.out.println("(d >= f) : " + (d >= f)); //f

    }
}
