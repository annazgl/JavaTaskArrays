
public class Zad7 {

    /*Napisz program, który: wczyta ze standardowego wejścia liczbę naturalną oraz liczby , wypisze na standardowe
    wyjście TAK jeśli ciąg zawiera element powtarzający się co najmniej 3 razy lub NIE jeśli nie zawiera.*/

    public static void main(String[] args) {
        int[] arrayOfInts = {6, 78, 899, 6, 45, 6, 89, 0, 3};

        for (int i = 0; i < arrayOfInts.length; i++) {
            int counter = 0;
            for (int number : arrayOfInts) {
                if (number == arrayOfInts[i]) {
                    counter++;
                }
                if (counter >= 3) {
                    System.out.println("Tak");
                    return;

                }
            }
            System.out.println("Nie");
        }
    }
}
