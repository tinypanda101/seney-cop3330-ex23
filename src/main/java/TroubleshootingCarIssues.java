/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class TroubleshootingCarIssues {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String userInput = "";

        System.out.print("Is the car silent when you turn the key? Use y for yes and n for no. ");
        userInput = scanner.next();
        if (userInput.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            userInput = scanner.next();
            if (userInput.equals("y")){
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);
            }
            else{
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }

        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            userInput = scanner.next();
            if (userInput.equals("y")){
                System.out.print("Replace the battery.");
                System.exit(0);
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                userInput = scanner.next();
                if (userInput.equals("y")){
                    System.out.print("Check spark plug connections");
                    System.exit(0);
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    userInput = scanner.next();
                    if (userInput.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        userInput = scanner.next();
                        if (userInput.equals("y")){
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else{
                        System.out.print("This should not be possible");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
