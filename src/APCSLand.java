import java.util.ArrayList;

/**
 *                                                      APCSLand
 * @since April, 2020
 * @version 3.0
 *
 * APCSLand program is


 */

public class APCSLand {

    private int[] arr;

    public APCSLand(int[] arr) {
        this.arr = arr;
    }



    /*
    This method will implement the rules of the game. The last line of the method should
    print out the results of the game in the expected format.
     */
    public void play() {
        int player_A = 0;
        int player_B = 0;
        /*
        Each player starts at position 0.
         */
        for (int a = 0; a<arr.length;a++) {

            if (a% 2==0||a==0) {
                if (arr[a]==4||arr[a]==6)
                    player_A-= arr[a];
                else { player_A += arr[a];}
                /*
                Subtract value from player A, if he got either 4 or 6, other than that add up all the value.
                 */

                if (player_A<=0){
                    player_A=0;}
                if (player_A==player_B)
                    player_B=0;
                /*
                If player A got where player B is, then take his place and move player B to start point which is 0.
                 */


            }else if(a% 2!=0){
                if (arr[a]==4||arr[a]==6){
                    player_B-= arr[a];
                }else{ player_B += arr[a];}
                /*
                Subtract value from player B, if he got either 4 or 6, other than that add up all the value.
                 */
                if (player_B<=0){
                    player_B=0;}
                if (player_B==player_A)
                    player_A=0;
                /*
                If player B got where player A is, then take his place and move player A to start point which is 0.
                 */



            }


            if (player_A>=41||player_B>=41){
                break;
                /*
                If either player reaches or pass the point 41 the game stops
                 */
            }
        }
            if (player_A >=41) {
                System.out.println("A-END," + " B-" + player_B);
                /*If player A reaches 41, returns A-End instead of number
                 */
            }else if (player_B>=41){
                System.out.println("A-"+player_A+" B-END");
                /*If player B reaches 41, returns B-End instead of number

                 */

            }else if (player_A>=41&&player_B>=41){
                System.out.println("A-END,"+" B-END");
                /*
                If both player reach 41, then both players returns with "Player name"-END, instead of number
                 */
            }else {
                System.out.println("A-"+player_A+","+" B-"+player_B);
            }
            /*
            If neither player did not pass the 41, which is goal point, it will just return with numbers
             */


    }
}
/**
 *                                                  Method-Play
 *
 * Description: Play method creates the basic rule of the game which is called APCSLand. The rules are simple. There are two players A and B on the board with 41 spaces.
 * Each player rolls 8-sided dice and each player adds all the value that they have got from the dice. The game ends when either gets to 41 which is equal to END.
 * Player A always rolls first. If they got 4 or 6, they subtract value that they have got. They cannot goes under 0. If a player lands on a space that the other player is already on,
 * the player that was on the space goes back to start (position 0).
 *
 *
 * @return This program will return where each players at by numbers, but if either player reached 41 then it will return END instead of number.

 */

