import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws IOException {

        Scanner file_Compare = new Scanner(new File("sortedData.txt"));

        ArrayList<Integer> file_CompareList = new ArrayList<>();


        while (file_Compare.hasNextInt()) {

            file_CompareList.add(file_Compare.nextInt());
        }
        return file_CompareList;
    }

    public static boolean isSorted(ArrayList<Integer> arr) {



        for(int i=0; i<arr.size()-1;i++) {
            int c_Num= arr.get(i) ;
            int testingNum= arr.get(i+1);
            if(c_Num>testingNum) {
                return false;
            }

        }
        return true;
    }
}