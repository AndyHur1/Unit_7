import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class TraversingArrayList {
    private static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> getStates() {
        ArrayList<String> States = new ArrayList<>();
        while (true) {
            System.out.println("Enter the name of a state or \"stop\" to quit: ");
            String states = scan.next();
            if (states.equals("stop")) {
                break;
            }
            States.add(states);


        }
        return States;

    }

    public static String createList(ArrayList<String> states) {

        ArrayList<String> stateArrayList = states;

        String stringOfStates = "";

        for (int i = 0; i < stateArrayList.size(); i++) {
            if (i == stateArrayList.size() - 1) {
                stringOfStates += stateArrayList.get(i);
            } else {
                stringOfStates += stateArrayList.get(i) + " -> ";
            }
        }
        return stringOfStates;
    }
    public static ArrayList<Integer> largestAndSmallest() throws IOException {

        Scanner presetData= new Scanner(new File("src/numbers.txt"));
        ArrayList<Integer> arrayDataStorage=new ArrayList<>();
        int


}