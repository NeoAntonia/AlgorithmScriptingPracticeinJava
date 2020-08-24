package example.com;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        //Array to store strings
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Mazda");
        cars.add("Ford");
        for (int i= 0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        //Array to store numbers and print it
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(18);
        myNumbers.add(15);
        myNumbers.add(27);
        myNumbers.add(25);

        Collections.sort(myNumbers); // to sort an array in asc
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
