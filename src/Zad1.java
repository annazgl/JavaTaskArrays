
public class Zad1 {

    //Wprowadź n liczb całkowitych do jednowymiarowej tablicy i wyprowadź je na ekran w odwrotnej kolejności.

    public static void main(String[] args) {

        int[] array = {1, 4, 5, 6, 3};

        for(int i = array.length -1; i>=0; i--){
            System.out.println(array[i]);
        }

    }
}
