import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DonorRunner {

    public static ArrayList<Donor> readFile() throws IOException {
        Scanner get_File= new Scanner(new File("donors.txt"));

        ArrayList<Donor> ObjectArrayList= new ArrayList<>();

        while(get_File.hasNextLine()) {
            String donorName= get_File.next();
            double donationAmount= get_File.nextDouble();
            ObjectArrayList.add(new Donor(donorName,donationAmount));
        }
        for(int a=0; a<ObjectArrayList.size();a++) {
            System.out.println(ObjectArrayList.get(a).getName() + " " +
                    ObjectArrayList.get(a).getAmount());
            System.out.println(ObjectArrayList.get(a));
        }
        return ObjectArrayList;
    }

    public static ArrayList<Donor> sortDonors(ArrayList<Donor>donorObject) {

        for(int a=0; a<donorObject.size();a++) {
            int Biggest_Num=a;
            for(int b=a+1; b<donorObject.size();b++) {
                if(donorObject.get(b).getAmount()>donorObject.get(Biggest_Num).getAmount()) {
                    Biggest_Num=b;
                }
            }
            Donor toBeSwapped = donorObject.get(a);
            donorObject.set(a,donorObject.get(Biggest_Num));
            donorObject.set(Biggest_Num,toBeSwapped);

        }
        return donorObject;
    }

    public static void main(String[]args) {

    }
}