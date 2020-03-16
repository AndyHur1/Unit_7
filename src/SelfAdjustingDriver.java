import java.util.ArrayList;

public class SelfAdjustingDriver {



        public static void main(String[] args){

            ArrayList<Integer> test1ArrayList= new ArrayList<>();
            ArrayList<Integer> test2ArrayList= new ArrayList<>();

            test1ArrayList.add(12);
            test1ArrayList.add(14);
            test1ArrayList.add(8);
            test1ArrayList.add(2);
            test1ArrayList.add(0);


            test2ArrayList.add(11);
            test2ArrayList.add(14);
            test2ArrayList.add(11);
            test2ArrayList.add(8);
            test2ArrayList.add(13);
            test2ArrayList.add(0);

            SelfAdjusting test1= new SelfAdjusting(test1ArrayList);
            test1.adjustList();



        }
    }

