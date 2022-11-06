import java.util.*;
import java.io.*;

class SortingNumbersToArray {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sorting_numbers_to_array_test.txt");
        Scanner s = new Scanner(file);
        ArrayList<Integer> listInt = new ArrayList<Integer>();

        while (s.hasNextLine())
            listInt.add(s.nextInt());

        Collections.sort(listInt);

        System.out.println(listInt);

        s.close();
    }
}