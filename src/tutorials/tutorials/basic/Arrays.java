package tutorials.tutorials.basic;

public class Arrays {
    public static void main(String[] args) {
        int x; // create that one box in memory that store one int value

        int[] myArray; //declaration of array that store ints
        //myArray = new int[5000]; //initializing array to be capable of holding 4 ints
        myArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        for (int number = 0; number<myArray.length; number++) {
//            myArray[number] = number;
//        }

        for (int number : myArray) { // for every number in myArray do something
            System.out.println(number);
        }


    }
}
