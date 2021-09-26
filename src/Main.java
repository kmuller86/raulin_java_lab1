import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        System.out.println("Ćwiczenie 3");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj Imię: ");
        String imie = scan.next();
        System.out.print("Podaj Nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj numer indeksu: ");
        int indeks = scan.nextInt();

        System.out.printf("Twówoje imie i nazwisko to: %s, a numer indeksu to: %d \n", imie +" "+nazwisko, indeks);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        System.out.println("Ćwiczenie 3 zadanie 2");
        System.out.print("Podaj pierwszą cyfre: ");
        int cyfra1 = scan.nextInt();
        System.out.print("Podaj drugą cyfrę: ");
        int cyfra2 = scan.nextInt();
        System.out.println("Suma cyfr = "+(cyfra1 + cyfra2));
        System.out.println("Różnica cyfr = "+(cyfra1 - cyfra2));
        System.out.println("Iloczyn = "+(cyfra1 * cyfra2));
        System.out.println("Iloraz= "+(cyfra1 / cyfra2));
        System.out.println("Modulo = "+(cyfra1 % cyfra2));

    }
}
