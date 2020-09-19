package com.company;
import java.util.*;
public class Main
{
    public static HashMap<Town, ArrayList<Integer>> appRatings = new HashMap<Town, ArrayList<Integer>>();
    public static void main(){
        System.out.println("Welcome to Locator C-19!");
        System.out.println("This app will help you navigate through your town and figure out places near you and if they follow the COVID-19 specifications that you have.");
        ArrayList<Building>a = new ArrayList<Building>();
        String name = "";
        System.out.println("What is the name of your town");
        Scanner reader = new Scanner(System.in);
        name = reader.next();
        System.out.println("What is your location: enter x coordinates");
        reader = new Scanner(System.in);
        int x = reader.nextInt();
        if(x>100){
            x=0;
        }
        System.out.println("What is your location: enter y coordinates");
        reader = new Scanner(System.in);
        int y = reader.nextInt();
        if(y>100){
            y = 0;
        }
        Location user = new Location(x,y);
        System.out.println("Welcome to " + name + "!" );
        Town t = new Town(name);
        Building [][] b= t.map();
        System.out.println("What location are you looking for near you?");
        System.out.println("Write 'S' for Supermarket, 'P' for Park, 'R' for Restaurant, 'G' for Gas Station, 'H' for Salon, and 'C' for COVID-19 testing facilities.");
        reader = new Scanner(System.in);
        String place = reader.next();
        System.out.println("What is the maximum radius you want this location to be in?");
        reader = new Scanner(System.in);
        int maxRadius = reader.nextInt();
        System.out.println("What is the maximum number of people you want to be at this location");
        reader = new Scanner(System.in);
        int maxPeople = reader.nextInt();
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                if(b[i][j].type.equals("E")){
                    continue;
                }
                else if(b[i][j].type.contains(place) && (b[i][j].location.distanceTo(user) <= maxRadius) && (b[i][j].people <= maxPeople)){
                    a.add(b[i][j]);
                }
            }
        }
        for(int i = 0; i < a.size()-1; i++){
            for(int j = 0; j < a.size()-1-i; j++){
                if(a.get(j).location.distanceTo(user) > a.get(j+1).location.distanceTo(user)){
                    Building c = a.get(j);
                    a.remove(j);
                    a.add(j+1, c);
                }
            }
        }
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
            System.out.println("Distance from your location: " + a.get(i).location.distanceTo(user) + " miles.");
            System.out.println();
        }
        addReviews(b, t);
    }
    public static void addReviews(Building [][] b, Town town){
        String answer = "";
        String answer1 = "";
        int x1 = 0;
        int y1 = 0;
        int rating = 0;
        int rating1 = 0;
        System.out.println("Would you like to rate any locations?");
        Scanner ra = new Scanner(System.in);
        answer = ra.next();
        while(answer.toLowerCase().contains("y")){
            System.out.println("Enter the x-coordinate of the location you picked.");
            Scanner r = new Scanner(System.in);
            x1 = r.nextInt();
            System.out.println("Enter the y-coordinate of the location you picked.");
            r = new Scanner(System.in);
            y1 = r.nextInt();
            while(b[x1][y1].type.equals("E")){
                System.out.println("Thats not the coordinates of a proper location. Please enter proper coordinates.");
                System.out.println("Enter the x-coordinate of the location you picked.");
                Scanner re = new Scanner(System.in);
                x1 = re.nextInt();
                System.out.println("Enter the y-coordinate of the location you picked.");
                re = new Scanner(System.in);
                y1 = re.nextInt();
            }
            System.out.println("What is your rating for this location?");
            r = new Scanner(System.in);
            rating = r.nextInt();
            while(rating > 5 || rating < 1){
                System.out.println("That's not a proper rating. Please give a rating between 1 and 5 stars.");
                System.out.println("What is your rating for this location?");
                r = new Scanner(System.in);
                rating = r.nextInt();
            }
            b[x1][y1].averageReview = ((b[x1][y1].averageReview * (b[x1][y1].numReviews)) + rating)/(b[x1][y1].numReviews+1);
            System.out.println("Would you like to rate other locations?");
            r = new Scanner(System.in);
            answer = r.next();
        }
        System.out.println("Would you like to rate our app?");
        Scanner a = new Scanner(System.in);
        answer1 = a.next();
        while(answer1.toLowerCase().contains("y")){
            System.out.println("What is your rating for our app?");
            a = new Scanner(System.in);
            rating1 = a.nextInt();
            while(rating1 > 5 || rating1 < 1){
                System.out.println("That's not a proper rating. Please give a rating between 1 and 5 stars.");
                System.out.println("What is your rating for our app?");
                a = new Scanner(System.in);
                rating1 = a.nextInt();
            }
            if(appRatings.containsKey(town)){
                appRatings.get(town).add(rating1);
            }
            else{
                appRatings.put(town, new ArrayList<Integer>());
                appRatings.get(town).add(rating1);
            }

        }
    }
}
