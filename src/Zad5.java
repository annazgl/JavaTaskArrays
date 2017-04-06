
public class Zad5 {

    //Dla tablicy liczb całkowitych znajdź jednocześnie minimum i maksimum tablicy.

    public static void main(String[] args) {
        int[] elements = {1, 3, 6, 89, 39, 73};

        int min = elements[0];
        int max = elements[0];

        for (int number : elements) {
            if (min > number ) {
                min = number;
            }
            if (max < number) {
                max = number;
            }

        }
        System.out.println(min);
        System.out.println(max);
    }
}