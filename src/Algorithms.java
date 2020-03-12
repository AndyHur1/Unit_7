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
            int c_num= file1List.get(a)
            for (int b=0; b<file2List.size();a++){
                if (file1List.get(a)==file2List.get(b)){
                    dup_List.add(file1List.get(a));
                }
            }
        }
        return dup_List;
    }
    public static ArrayList<String> fileDuplicatesTwo() throws IOException{
        Scanner name_file = new Scanner(new File("names.txt"));
        ArrayList<String> name_list = new ArrayList<>();
        ArrayList<String> no_dup_name = new ArrayList<>();

        while (name_file.hasNext()){
            name_list.add(name_file.next());
        }
        while (name_file.hasNext()){
            no_dup_name.add(name_file.next());
        }
        for (int a=0; a<name_list.size(); a++){
            for (int b=0; b<name_list.size(); b++){
                if (a!=b&&name_list.get(a).equals(name_list.get(b))){
                    no_dup_name.remove(a);
                }
            }
        }
        return no_dup_name;
    }
    public static ArrayList<Integer> orderedList() throws IOException{
        Scanner file1= new Scanner(new File("file1.txt"));
        ArrayList<Integer> createdOrderedList= new ArrayList();


        System.out.println("The Size of newly created list by default is " +createdOrderedList.size());

        while(file1.hasNext()){
            if(createdOrderedList.size()==0) {
                createdOrderedList.add(file1.nextInt());
            }

            int numToBeAdded = file1.nextInt();


            for(int i = 0; i < createdOrderedList.size(); i++){
                int testingNum=createdOrderedList.get(i);


                if(numToBeAdded < testingNum) {
                    createdOrderedList.add(i, numToBeAdded);
                    break;
                }
                if(i == createdOrderedList.size() - 1){
                    createdOrderedList.add(numToBeAdded);
                    break;
                }

            }
        }


        return createdOrderedList;

    }

    }

