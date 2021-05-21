import java.util.Scanner;

public class StylizedCupcakeCostCalculator {

    public static String keyboardInput() {      //Method to take keyboard input
        Scanner keyboard = new Scanner(System.in);
        return (keyboard.nextLine());           //Takes entire input line
    }

    public static int costCalc(String [] values) {
        int price, t = 0, k = 0, d = 0, D = 0;         //Initialize Variables

        for (String i : values) {                      //Loops over all the values of the array by creating a var 'i'
            if ('t' == i.charAt(0)) {
                t = Integer.parseInt(i.substring(2));
            } else if ('k' == i.charAt(0)) {           //Checks whether to assign to the proper var
                k = Integer.parseInt(i.substring(2));  //Takes the number part of the equation and assigns it to a var
            } else if ('d' == i.charAt(0)) {
                d = Integer.parseInt(i.substring(2));
            } else if ('D' == i.charAt(0)) {
                D = Integer.parseInt(i.substring(2));
            }
        }

        if (t <= k) {        //Checks to see if cupcakes are less than a certain amount
            price = t * d;   //Calculates cost based on original price
        } else {             //If cupcakes do not meet that certain amount
            price = t * D;   //Calculates cost based on discounted price
        }

        return (price);    //Prints answer to terminal
    }

    public static String finalAnswer (int price) {      //Takes the final price and puts it in required form
        String answer = price + " Dollars";
        String extra = "*".repeat(answer.length());     //Creates top and bottom lines using String method
        return (String.format("%s%n%s%n%s", extra, answer, extra));     //Returns the appropriate output format to main method
    }

    public static void main(String[] args) {
        String input = keyboardInput();
        String[] values = input.split(" ");      //Converts the line of string into an array
        int price = costCalc (values);                 //Obtains cost from method given values
        System.out.println(finalAnswer(price));       //Prints final cost to terminal
        }
    }