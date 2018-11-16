package com.firstapp;

import java.security.acl.Owner;

public class Hotel {

    public static final int NUMBER_OF_LUXURY_ROOMS = 5;
    public static final int NUMBER_OF_SIMPLE_ROOMS = 10;

    public static final int TOTAL_NUMBER_OF_ROOMS = NUMBER_OF_LUXURY_ROOMS + NUMBER_OF_SIMPLE_ROOMS;

    private Room[] rooms = new Room[TOTAL_NUMBER_OF_ROOMS];

//    private String client;

    public Hotel(){

//        System.out.println(TOTAL_NUMBER_OF_ROOMS);

        for(int i = 0; i < TOTAL_NUMBER_OF_ROOMS; i++){
            this.rooms[i] = new Room();
        }
        for(int i = 0; i < NUMBER_OF_LUXURY_ROOMS; i++){
            this.rooms[i].setType(2);
            this.rooms[i].setOwner("nobody");
        }
        for(int i = NUMBER_OF_LUXURY_ROOMS; i < TOTAL_NUMBER_OF_ROOMS; i++){
            this.rooms[i].setType(1);
            this.rooms[i].setOwner("nobody");
        }
    }

    public void viewAllRooms(){
        for(int i = 0; i < TOTAL_NUMBER_OF_ROOMS; i++){
            if(this.rooms[i].getOwner().equals("nobody")){
                System.out.println("Room #" + (i + 1) + " is empty");
            }else{
                System.out.println("Room #" + (i + 1) + " is occupied by " + this.rooms[i].getOwner());
            }
            System.out.println("    - Room Type: " + (this.rooms[i].getType() == 2 ? "Luxury" : "Simple"));
            System.out.println("    - Price: " + this.rooms[i].getPrice() + " USD");
        }
    }

    public void viewEmptyRooms(){
        for(int i = 0; i < TOTAL_NUMBER_OF_ROOMS; i++){
            if(this.rooms[i].getOwner().equals("nobody")){
                System.out.println("Room #" + (i + 1) + " is empty");
            }

        }
    }

    public void bookRoom(int roomID, String owner){
        this.rooms[roomID - 1].setOwner(owner);
//        this.client = owner;
    }

    public double calculateCost(int days, String owner){
        double sum = 0;
        for(int i = 0; i < TOTAL_NUMBER_OF_ROOMS; i++){
            if(this.rooms[i].getOwner().equals(owner)){
                sum += this.rooms[i].getPrice() * days;
            }
        }

        return sum;
    }

    public int getOccupiedRoomNumber(String owner){
        int roomID = 0;
        for(int i = 0; i < TOTAL_NUMBER_OF_ROOMS; i++){
            if(this.rooms[i].getOwner().equals(owner)){
                roomID = i + 1;
            }
        }
        return roomID;
    }

}
