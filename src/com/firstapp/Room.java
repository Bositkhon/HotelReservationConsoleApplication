package com.firstapp;

public class Room {

    private static final int LUXURY_ROOM_TYPE = 2;
    private static final int SIMPLE_ROOM_TYPE = 1;

    private String owner;
    public double price;
    public int type;

    public Room(){
        this.price = 50 + (int)((Math.random()*100)%50);
    }

    public double getPrice() {
        return price;
    }

    public void setType(int type){
        if(type == LUXURY_ROOM_TYPE){
            this.type = LUXURY_ROOM_TYPE;
        }else if(type == SIMPLE_ROOM_TYPE){
            this.type = SIMPLE_ROOM_TYPE;
        }
    }

    public int getType() {
        return type;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }



}
