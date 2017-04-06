
public class Zad6{

    //Napisz program,który: wczyta ze standardowego wejścia liczbę naturalną oraz liczby, wypisze na standardowe wyjście.

    public static void main(String[] args) {
        int[] arrayOfInt = {1212, 343, 3, 65, 32, 6, 9, 24};

        for(int i = 0; i<arrayOfInt.length; i++){
            int counter = 0;
            for(int b = i; b<arrayOfInt.length; b++){
                counter +=arrayOfInt[b];


            }
            System.out.println(counter + " ");
        }

    }
}


