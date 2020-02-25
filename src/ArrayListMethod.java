import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListMethod {

    private static Scanner scan = new Scanner(System.in);
public static ArrayList<Integer> numberList() {

    ArrayList<Integer> arrayListValue = new ArrayList<Integer>();
    arrayListValue.add(0);
    arrayListValue.add(-5);
    arrayListValue.add(7);
    arrayListValue.add(12);
    arrayListValue.add(-1);
    System.out.println(arrayListValue);
    arrayListValue.set(2,10);
    arrayListValue.set(1,9);
    System.out.println(arrayListValue);
    arrayListValue.remove(3);
    System.out.println(arrayListValue);




return arrayListValue;
}
public static ArrayList<Double> firstAndLast(){
    double input_num = 0;
    ArrayList<Double> arrayListValue = new ArrayList<Double>();
    while (input_num != 0) {
        System.out.println("Please Enter a decimal number");
        input_num = scan.nextDouble();
        arrayListValue.add(input_num);
    }
    return arrayList(arrayListValue);

}
public static ArrayList<Double> getNumbers (){
    int a = 0;
    ArrayList<Double> arrayListValue = new ArrayList<>();
    while (a<3){
        System.out.println("Please Enter your decimal number" );
        double input_num = scan.nextDouble();
        arrayListValue.add(input_num);
    }
    return arrayList(arrayListValue);
}
public static ArrayList<Double> arrayList (ArrayList<Double> numbers){
    ArrayList<Double> ArrayList = numbers;
    int a = 0;


}
}
