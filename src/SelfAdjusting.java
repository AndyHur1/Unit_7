import java.util.ArrayList;

/**
 *                                                      SelfAdjusting
 * @author Andy Hur
 * @since March 16, 2020
 * @version 3.0
 *
 * Description:
 * The Java class SelfAdjusting includes one method and two constructors. The first constructor includes a ArrayList
 * parameter. It passes the users ArrayList to instance variable, which stores an ArrayList. The second constructor
 * includes no parameters and creates a "default ArrayList" and passes it to private instance variable.
 *
 *The objective:
 *The point of this class is search an ArrayList with pre-defined search numbers. If the number  the user is search for
 *  is found It should me moved to front of list to increase the speed of querying the list and find the desired number.
 *  If the number the user is searching for is already at index 0 do nothing and If the
 * number is not found do nothing.
 */


public class SelfAdjusting {

    private ArrayList<Integer> queryArrayList; /*private instance of ArrayList, which is the ArrayList we are
     sorting for.*/

    public SelfAdjusting(ArrayList<Integer>queryArrayList) { /*SelfAdjusting constructor with parameter.
    It passes the user selected ArrayList to private ArrayList instance.*/

        this.queryArrayList= queryArrayList;
    }
    public SelfAdjusting() {
        ArrayList<Integer>defaultArrayList= new ArrayList<>(); //default ArrayList if no parameter is passed
        defaultArrayList.add(2);
        defaultArrayList.add(4);
        defaultArrayList.add(10);
        defaultArrayList.add(15);
        defaultArrayList.add(0);
        this.queryArrayList=defaultArrayList;
    }

    /**
     *
     * @return returns the ArrayList saved in the private instance of the SelfAdjusting Class
     */
    public ArrayList<Integer> getQueryArrayList() {
        return queryArrayList;
    }

    /**                                             Method-AdjustList
     *
     *Description:
     * AdjustList is a method that requires one parameter. The parameter is an ArrayList containing
     * the numbers you want to search for. The method includes a default list which will be so searched at and
     * will be modified by the algorithm described below, to more quickly find the number.
     *
     *
     * Algorithm:
     * Essentially the Algorithm is you search for your designated number, if its in the list and its not the first
     * index move it the front of the ArrayList.
     *
     * 1)Create for loop to test each individual number in the ArrayList the user wants to search for.
     *
     * 2)Creates another for loop to test the pre-defined ArrayList.
     *
     * 3) traverse the for loop for pre-define ArrayList until it finds the pre-defined number in the ArrayList and
     * the number in the searchArrayList.
     *
     * 4) then I will ask if they both have the same number ask what is the pre-defined index of number in the ArrayList.
     * If the index=0 break. otherwise move the value to end first and remove the value from its original location
     * with the saved index.
     *
     *
     *
     */
    public void adjustList() {

        //Creates the ArrayList we are searching at and adds the designated numbers to it
        ArrayList<Integer> arrayListToBeSearched_Modified= new ArrayList<>();
        arrayListToBeSearched_Modified.add(2);
        arrayListToBeSearched_Modified.add(4);
        arrayListToBeSearched_Modified.add(6);
        arrayListToBeSearched_Modified.add(8);
        arrayListToBeSearched_Modified.add(10);
        arrayListToBeSearched_Modified.add(12);
        arrayListToBeSearched_Modified.add(14);
        arrayListToBeSearched_Modified.add(16);
        arrayListToBeSearched_Modified.add(18);
        arrayListToBeSearched_Modified.add(20);

        //Provides The original ArrayList and String text that will go with modified arrayList
        System.out.println("Original ArrayList/Pre-defined ArrayList :\n" + arrayListToBeSearched_Modified + "\n"
                + "\nModified ArrayList:");

        for(int i= 0; i<queryArrayList.size();i++) {
            int currentNum= queryArrayList.get(i); //actual value of the number we are searching for.
            if(currentNum==0) {
                break; //ends the loop immediately if the stop number "0" is found.
            }

            for(int i2=0; i2<arrayListToBeSearched_Modified.size();i2++) {
                int indexOfSearchNum=i2; //the index of number we are searching for.
                int testingNum=arrayListToBeSearched_Modified.get(i2); //the value of number we are searching for.

                if(currentNum==testingNum) {
                    if(indexOfSearchNum==0) {
                        break; // breaks the loop if index of number==0 and the numbers value is ==.
                    }
                    else if(indexOfSearchNum!=0) {
                        arrayListToBeSearched_Modified.add(0,testingNum); /* takes the number the user
                        is searching  "If Found" to  first index. to find the value quicker.*/

                        arrayListToBeSearched_Modified.remove(indexOfSearchNum+1); /*I add + since the array
                        was modified.*/
                        break; //breaks out the for loop before any errors can be caused.
                    }
                }

            }
        }
        System.out.println(arrayListToBeSearched_Modified);//Prints the Modified ArrayList
    }


}