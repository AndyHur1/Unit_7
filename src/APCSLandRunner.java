public class APCSLandRunner {

    public static void main(String[] args) {
        int[] input1 = {3,5,1,8,2,7};
        int[] input2 = {5,7,8,7,5,5,3,8,7,3,7,7,8,8};
        int[] input3 = {3,3,1,2,2,7,5,7};
        int[] input4 = {5,7,4,1,3,8,7,6,4,6};
        int[] input5 = {1,2,3,5,3,8,1,8,5,7};

        APCSLand game1 = new APCSLand(input1);
        game1.play(); // Should print A-6, B-20

        APCSLand game2 = new APCSLand(input2);
        game2.play(); // Should print A-END, B-37

        APCSLand game3 = new APCSLand(input3);
        game3.play(); // Should print A-8, B-19

        APCSLand game4 = new APCSLand(input4);
        game4.play(); // Should print A-7, B-4

        APCSLand game5 = new APCSLand(input5);
        game5.play(); // A-5, B-15
    }
}
