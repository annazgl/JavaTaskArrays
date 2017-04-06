
public class Zad2 {

    //W tablicy jednowymiarowej przechowującą liczby całkowite znaleźć liczbę minimalną ciągu.

    public static void main(String[] args) {
        int [] elements = {23, 54, -543, 0, 5,4};
       int min = elements[0];
       for(int a : elements ){
           if(a<min){
               min = a;
           }
       }
        System.out.println(min);
    }
}
