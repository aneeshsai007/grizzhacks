package com.company;

public class Building
{
    public String type;
    public Location location;
    public int people;
    public int openhours;
    public int closinghours;
    public int averageReview;
    public int numReviews;
    public Building(String t,Location l,int p,int o,int c, int r, int n){
        type = t;
        location = l;
        people = p;
        openhours = o;
        closinghours = c;
        averageReview = r;
        numReviews = n;
    }
    public Building(){
        type = "E";

    }
    public String toString(){
        return "Location type is: " + type + ".\nLocation coordinates are: " + "(" + location.userLat + "," + location.userLong + ")" +".\nNumber of people at location is: " + people + ".\nOpen hours: "  + openhours + "am-" + closinghours + "pm." + "\nAverage Rating: " + averageReview + " stars." + "\nNumber of Reviews: " + numReviews + ".";
    }
}
