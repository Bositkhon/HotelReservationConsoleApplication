package com.firstapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int command = -1;
//        System.out.println(price);

        Hotel myHotel = new Hotel();

        System.out.println("Hello, Customer!");
        System.out.println("Welcome to our hotel reservation application");
        System.out.println("============================================");

        while(command != 0) {
            System.out.println("========================================");
            System.out.println("Please select one of there options");
            System.out.println("1. View all rooms");
            System.out.println("2. View empty rooms");
            System.out.println("3. Book a room");
            System.out.println("4. Calculate overall cost");
            System.out.println("5. Give us a feedback");
            System.out.println("0. Exit application");


            command = sc.nextInt();
            switch (command){
                case 1:{
                    myHotel.viewAllRooms();
                    break;
                }
                case 2:{
                    myHotel.viewEmptyRooms();
                    break;
                }
                case 3:{
                    System.out.println("Please enter the room number from (1 to " + Hotel.TOTAL_NUMBER_OF_ROOMS + ")");
                    int roomID = sc.nextInt();
                    System.out.println("Please enter your name");
                    String owner = sc.next();
                    myHotel.bookRoom(roomID, owner);
                    break;
                }

                case 4:{
                    System.out.println("Please enter your name");
                    String owner = sc.next();
                    System.out.println("Please enter the number of night you are going to stay in our hotel");
                    int days = sc.nextInt();
                    double cost = myHotel.calculateCost(days, owner);
                    if(cost == 0){
                        System.out.println("Please book a room before calculating the total cost");
                        break;
                    }else{
                        System.out.println("=====================================================================================");
                        System.out.println("Dear " + owner + "!");
                        System.out.println("You are going to stay in the Room #" + myHotel.getOccupiedRoomNumber(owner) + " for " + days + " days");
                        System.out.println("The total amount of money you have to pay for us is " + cost + " USD");
                        System.out.println("=====================================================================================");
                        System.out.println("Do you really want to proceed the checkout? (YES/NO)");
                        String answer = sc.next();
                        if(answer.equals("YES")){
                            System.out.println("We are pleased to inform you that you have successfully booked a room for " + days + " nights");
                            System.out.println("Enjoy out comforts!");
                            command = 0;
                            break;
                        }
                    }
                    break;
                }

                case 5:{
                    System.out.println("If there is a bug please feel free to send us a message clearly indicating the incompleteness of our application");
                    String feedback;
                    feedback = sc.nextLine();
                    if(feedback.isEmpty()){
                        System.out.println("Are you sure you want to leave the message empty?");
                    }else{
                        System.out.println("Thank you for your feedback!");
                    }
                    break;
                }

                default:{
                    System.out.println("You entered an invalid data");
                    System.out.println("Please try again!");
                    break;
                }

            }
        }
    }

}
