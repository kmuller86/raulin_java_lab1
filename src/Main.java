import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        System.out.println("Ćwiczenie 5 zad1");
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj swój wiek: ");
        int wiek = scan.nextInt();
        if(wiek % 3 == 0)
            System.out.println("Jest podzielny przez 3");
        else
            System.out.println("Twój wiek nie jest podzielny przez 3");

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.println("Ćwiczenie 5 zad 2");
        System.out.print("Podaj numer indeksu: ");
        int index= scan.nextInt();
        int wynik = (index % 2 == 0) ? 0 : 1;
        System.out.println("Reszta z dzielenia 2: " + wynik);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.println("Ćwiczenie 5 zad3");
        System.out.print("Podaj cyfre zmiennoprzecinkową: ");
        double liczba = scan.nextDouble();
        if (liczba < 3.14) {
            System.out.println("Cyfra jest mniejsza od liczby pi");
        } else if (liczba > 10) {
            System.out.println("Cyfra jest większa od liczby 10");
        } else {
            System.out.println("Cyfra jest większa od pi i mniejsza od 10 ");
        }

    }
}
