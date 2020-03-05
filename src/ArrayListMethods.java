import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListMethods {

    private static Scanner scan = new Scanner(System.in);
    private static Object Double;

    public static ArrayList<Integer> numberList() {

        ArrayList<Integer> arrayListValue = new ArrayList<Integer>();
        arrayListValue.add(0);
        arrayListValue.add(-5);
        arrayListValue.add(7);
        arrayListValue.add(12);
        arrayListValue.add(-1);
        System.out.println(arrayListValue);
        arrayListValue.add(2, 10);
        arrayListValue.set(1, 9);
        System.out.println(arrayListValue);
        arrayListValue.remove(4);
        System.out.println(arrayListValue);


        return arrayListValue;
    }

    public static ArrayList<Double> firstAndLast() {
        double input_num = 0;
        ArrayList<Double> arrayListValue = new ArrayList<Double>();
        ArrayList<Double> arrayListNewValue= new ArrayList<>();
        while (true) {
            System.out.println("Please Enter a decimal number");
            input_num = scan.nextDouble();
            if (input_num==0) {
                break;
            }
            arrayListValue.add(input_num);

        }

        arrayListNewValue.add((double) arrayListValue.size());
        arrayListNewValue.add(arrayListValue.get(0));
        arrayListNewValue.add(arrayListValue.get(arrayListValue.size()-1));
        return arrayListNewValue;

    }

    public static ArrayList<Double> getNumbers() {

        ArrayList<Double> arrayListValue = new ArrayList<>();
        for (int a=0; a<3; a++){
            System.out.println("Please Enter your decimal number");
            double input_num = scan.nextDouble();
            arrayListValue.add(input_num);
        }
        return arrayListValue;
    }
    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers) {
        for (int i = 0; i < numbers.size(); i++) {//checks first index is the largest if so set it the last index
            if (numbers.get(0) > numbers.get(1) && numbers.get(0) > numbers.get(2)) {
                double temp = numbers.get(2);
                numbers.set(2, numbers.get(0));
                numbers.set(0, temp);
            } else if (numbers.get(0) > numbers.get(1) && numbers.get(0) < numbers.get(2)) {
                // checks first index is larger than second index but smaller than last index.
                double temp = numbers.get(1);
                numbers.set(1, numbers.get(0));
                numbers.set(0, temp);
            } else if (numbers.get(0) < numbers.get(1) && numbers.get(0) > numbers.get(2)) {
                double temp = numbers.get(2);

                numbers.set(2, numbers.get(0));
                numbers.set(0, temp);
            } else if (numbers.get(1) > numbers.get(2)) {
                double temp = numbers.get(2);
                numbers.set(2, numbers.get(1));
                numbers.set(1, temp);
            }
        }





        return numbers;
    }



}
