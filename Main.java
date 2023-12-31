//This will be my client class

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Variables to store values needed for the display
        RestaurantCommand command;
        Scanner sc = new Scanner(System.in);

        Order.addItem(OrderItem item = new OrderItem());
        switch(displayMainMenu(sc)){
            case 1:
                command = new DisplayMenu();
                break;
            case 2:
                command = new SubmitOrder();
                break;
            case 3:
                command = new SubmitOrder();
                break;
            default:
                displayMainMenu(sc);
                break;
        }

    }

    static int displayMainMenu(Scanner sc){
         String[] options = {"Display Menu", "Submit Order", "Display Tab"};
        int i = 1;
        System.out.println("Welcome to Lel's Restaurant");
        System.out.println("Please select an option (Use a number from 1 - 3):");    

        for(String option : options){
            System.out.println(i+ " - " + option);
            i++;
        }
        i =1;

        return sc.nextInt();
       
    }
}