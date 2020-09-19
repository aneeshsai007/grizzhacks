package com.company;

public class Location {
    public int userLat;
    public int userLong;
    public Location(int x1, int y1){
        userLat = x1;
        userLong = y1;
    }
    public double distanceTo(Location f){
        return Math.sqrt(((f.userLat - userLat) * (f.userLat - userLat)) + ((f.userLong - userLong) * (f.userLong - userLong)));
    }
}
