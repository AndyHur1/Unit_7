import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DonorRunner {

    public static ArrayList<Donor> readFile() throws IOException {
        Scanner get_D_File= new Scanner(new File("donors.txt"));

        ArrayList<Donor> ObjectArrayList= new ArrayList<>();

        while(get_D_File.hasNextLine()) {
            String donorName= get_D_File.next();
            double donationAmount= get_D_File.nextDouble();
            ObjectArrayList.add(new Donor(donorName,donationAmount));
        }
        for(int i=0; i<ObjectArrayList.size();i++) {
            System.out.println(ObjectArrayList.get(i).getName() + " " +
                    ObjectArrayList.get(i).getAmount());
            System.out.println(ObjectArrayList.get(i));
        }
        return ObjectArrayList;
    }

    public static ArrayList<Donor> sortDonors(ArrayList<Donor>donorObject) {

        for(int i=0; i<donorObject.size();i++) {
            int indexOfLargestNum=i;
            for(int i2=i+1; i2<donorObject.size();i2++) {
                if(donorObject.get(i2).getAmount()>donorObject.get(indexOfLargestNum).getAmount()) {
                    indexOfLargestNum=i2;
                }
            }
            Donor toBeSwapped = donorObject.get(i);
            donorObject.set(i,donorObject.get(indexOfLargestNum));
            donorObject.set(indexOfLargestNum,toBeSwapped);

        }
        return donorObject;
    }

    public static void main(String[]args) {

    }
}