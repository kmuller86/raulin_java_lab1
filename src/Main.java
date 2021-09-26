import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        System.out.println("Zadanie 1");
        int zmiennacyfra = 7;
        double zmiennadouble = 2.33;
        String zmiennastring = "Baza wirusów programu avast została zaktualizowana";
        char zmiennaPowitanie = 'e';
        System.out.println("cyfra = " + zmiennacyfra);
        System.out.println("cyfra po przecinku = " + zmiennadouble);
        System.out.println("tekst = " + zmiennastring);
        System.out.println("zmienna char = " + zmiennaPowitanie);
        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        System.out.println("Zadanie 2 a");
        int a=1, b=8, c=3;
            int wyniksumowania = a+b;
            int wynikodejmowania = b-a-c;
            int wynikmnozenia = a*c;
            int wynikdzielenia = b/c;
            int wynikmodulo = b%c;
        System.out.println("Wynik sumowania = " + wyniksumowania);
        System.out.println("Wynik odejmowania = " + wynikodejmowania);
        System.out.println("Wynik mnożenia = " + wynikmnozenia);
        System.out.println("Wynik dzielenia = " + wynikdzielenia);
        System.out.println("Wynik dzielenia = " + wynikmodulo);

        System.out.println("Zadanie 2 b");
        double x=1.23, y=5.79;
        double wyniksumowania1 = x+y;
        double wynikodejmowania1 = y-x;
        double wynikmnozenia1 = y*x;
        double wynikdzielenia1 = x/y;
        double wynikmodulo1 = y%x;
        System.out.println("Wynik sumowania = " + wyniksumowania1);
        System.out.println("Wynik odejmowania = " + wynikodejmowania1);
        System.out.println("Wynik mnożenia = " + wynikmnozenia1);
        System.out.println("Wynik dzielenia = " + wynikdzielenia1);
        System.out.println("Wynik dzielenia = " + wynikmodulo1);




    }
}
