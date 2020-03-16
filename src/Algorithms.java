import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws IOException {
        Scanner file1 = new Scanner(new File("file1.txt"));
        Scanner file2 = new Scanner(new File("file2.txt"));
        ArrayList<Integer> file1List = new ArrayList();
        ArrayList<Integer> file2List = new ArrayList();
        ArrayList<Integer> dup_List = new ArrayList();


        while (file1.hasNextInt()) {
            file1List.add(file1.nextInt());
        }
        while (file2.hasNextInt()) {
            file2List.add(file2.nextInt());
        }
        for (int a=0; a<file1List.size();a++){
            int currentNum = file1List.get(a);
            for(int i2=0;i2<file2List.size();i2++) {
                int testingNum=file2List.get(i2);
                if(currentNum==testingNum) {
                    dup_List.add(currentNum);
                }
            }
        }
        return dup_List;
    }
    public static ArrayList<String> fileDuplicatesTwo() throws IOException {

        Scanner p_Data= new Scanner(new File("names.txt"));
        ArrayList<String> namesList = new ArrayList<>();

        while (p_Data.hasNext()) {
            namesList.add(p_Data.next());
        }
        System.out.println(namesList);

        for(int i=0; i<namesList.size();i++) {
            String c_String= namesList.get(i);
            for(int i2=i+1; i2<namesList.size();i2++) {
                String testingString= namesList.get(i2);
                if(c_String.equals(testingString)) {
                    namesList.remove(i2);
                    i2--;

                }
            }
        }

        return namesList;
    }


    public static ArrayList<Integer> orderedList() throws IOException{
        Scanner file1= new Scanner(new File("file1.txt"));
        ArrayList<Integer> OrderedList= new ArrayList();


        System.out.println("The Size of newly created list by default is " +OrderedList.size());

        while(file1.hasNext()){
            if(OrderedList.size()==0) {
                OrderedList.add(file1.nextInt());
            }

            int numToBeAdded = file1.nextInt();


            for(int i = 0; i < OrderedList.size(); i++){
                int testingNum=OrderedList.get(i);


                if(numToBeAdded < testingNum) {
                    OrderedList.add(i, numToBeAdded);
                    break;
                }
                if(i == OrderedList.size() - 1){
                    OrderedList.add(numToBeAdded);
                    break;
                }

            }
        }


        return OrderedList;

    }



}

