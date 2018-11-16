package com.firstapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int command = -1;

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
            System.out.println("4. Give us a feedback");
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
