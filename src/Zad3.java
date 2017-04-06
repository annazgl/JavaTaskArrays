
public class Zad3 {

   // W tablicy jednowymiarowej znajdź liczbę, która występuje najczęściej.

    public static void main(String[] args) {
        int[] arrayOfInt = {2,4,3,23,4,2,3,2,32,2,23,4,4};
        int [] arrayOfResponse = new int[arrayOfInt.length];

        for(int i = 0; i<arrayOfInt.length ; i++){
            int counter= 0;

            for(int number :arrayOfInt){
                if(arrayOfInt[i] == number){
                    counter++;
                }
                arrayOfResponse[i] = counter;
            }

            int temp = 0;
            int tempIndex = 0;
            for(i = 0; i<arrayOfResponse.length; i++){
                if(arrayOfResponse[i]>temp){
                    temp = arrayOfResponse[i];
                    tempIndex = i;
                }
            }
            System.out.println(arrayOfInt[tempIndex]);
        }

    }
}
