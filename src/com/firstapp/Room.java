package com.firstapp;

public class Room {

    private static final int LUXURY_ROOM_TYPE = 2;
    private static final int SIMPLE_ROOM_TYPE = 1;

    private String owner;

    private String type;

    int guestsInRoom;

    public void setType(int type){
        if(type == LUXURY_ROOM_TYPE){
            this.type = "Luxury";
        }else if(type == SIMPLE_ROOM_TYPE){
            this.type = "Simple";
        }
}

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }
}
