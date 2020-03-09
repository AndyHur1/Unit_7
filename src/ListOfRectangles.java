import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {
    public static ArrayList<Rectangle> getRectangles() throws IOException {
        Scanner presetData = new Scanner(new File("src/rectangle.txt"));

        ArrayList<Rectangle> listOfRectangleOjects = new ArrayList<>();

        while (presetData.hasNextDouble()) {
            double rectangleLength = presetData.nextDouble();
            double rectangleWidth = presetData.nextDouble();
            listOfRectangleOjects.add(new Rectangle(rectangleLength, rectangleWidth));
        }
        return listOfRectangleOjects;
    }

    public static double findAverage(ArrayList<Rectangle> rectangles) {
        double average = 0;
        for (Rectangle rectangleObject : rectangles) {
            System.out.println(rectangleObject.getRectangleLength() + " " + rectangleObject.getRectangleWidth());
            average += rectangleObject.getRectangleArea();
        }
        average /= rectangles.size();
        return average;
    }


    public static void main(String[] args) throws IOException {
        ArrayList<Rectangle> rectangleObjects = getRectangles();
        System.out.println(findAverage(rectangleObjects));

    }
}
