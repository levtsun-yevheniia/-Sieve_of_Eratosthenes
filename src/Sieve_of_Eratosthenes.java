import java.util.ArrayList;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,s,zakres;
        ArrayList<Integer> tablica = new ArrayList<Integer>();
        System.out.println("Podaj liczbę, do ktorej chcesz znalezc liczby pierwsze: ");
        zakres = scanner.nextInt();
        int pierwiastek = (int) Math.floor(Math.sqrt(zakres));

        for (a=1; a<=zakres; a++){
            tablica.add(a-1,a);
        }


        for (a=2; a<=pierwiastek; a++) {
            if (tablica.get(a) != 0) {
                s = a+a;
                while (s<=zakres) {
                    tablica.add(s,0);
                    s += a;
                }
            }
        }

        for (a=2; a<=zakres; a++){
            if (tablica.get(a)!=0){
                System.out.print(a + ", ");
            }
        }

    }
}
