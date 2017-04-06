
public class Zad4 {

    // Dla danej tablicy liczb całkowitych oblicz średnią arytmetyczną oraz sumę ciągu.

    public static void main(String[] args) {
        int[] elements = {2, 4, 4, 4,5 ,6,6};

        int sum = 0;

        for(int number : elements){
            sum += number;
        }
        System.out.println(sum);
        System.out.println(sum/elements.length);


    }
}
