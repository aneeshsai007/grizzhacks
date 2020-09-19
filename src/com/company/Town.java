package com.company;
public class Town {
    public Building [][] entireTown = new Building[100][100];
    public String name;
    public Town(String n){
        name = n;
    }
    public Building [][] map(){
        int min = 0;
        int open = 0;
        int closed = 0;
        int review = 0;
        int num = 0;
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                int r = (int)(Math.random()*15 + 10);
                int c = (int)(Math.random()*15 + 10);
                entireTown[i][j] = new Building();
                if(((i%r) == 0) && (j%c) == 0&&entireTown[i][j].type.equals("E")){
                    min = (int)(Math.random()*50+1);
                    open = (int)(Math.random()*12+1);
                    closed = (int)(Math.random()*12+1);
                    review = (int)(Math.random()*4+2);
                    num = (int)(Math.random()*50+1);
                    entireTown[i][j] = new Building(i + "S" + j,new Location(i,j),min,open,closed, review, num);//Supermarket
                }
                r = (int)(Math.random()*30 + 10);
                c = (int)(Math.random()*30 + 10);
                if(((i%r) == 0) && (j%c) == 0&&entireTown[i][j].type.equals("E")){
                    min = (int)(Math.random()*20+1);
                    open = (int)(Math.random()*12+1);
                    closed = (int)(Math.random()*12+1);
                    review = (int)(Math.random()*4+2);
                    num = (int)(Math.random()*50+1);
                    entireTown[i][j] = new Building(i + "P" + j,new Location(i,j),min,open,closed, review, num);//Park
                }
                r = (int)(Math.random()*30 + 10);
                c = (int)(Math.random()*30 + 10);
                if(((i%r) == 0) && (j%c) == 0&&entireTown[i][j].type.equals("E")){
                    min = (int)(Math.random()*10+1);
                    open = (int)(Math.random()*12+1);
                    closed = (int)(Math.random()*12+1);
                    review = (int)(Math.random()*4+2);
                    num = (int)(Math.random()*50+1);
                    entireTown[i][j] = new Building(i + "G" + j,new Location(i,j),min,open,closed, review, num);//Gas Station
                }
                r = (int)(Math.random()*20 + 10);
                c = (int)(Math.random()*20 + 10);
                if(((i%r) == 0) && (j%c) == 0&&entireTown[i][j].type.equals("E")){
                    min = (int)(Math.random()*20+1);
                    open = (int)(Math.random()*12+1);
                    closed = (int)(Math.random()*12+1);
                    review = (int)(Math.random()*4+2);
                    num = (int)(Math.random()*50+1);
                    entireTown[i][j] = new Building(i + "R" + j,new Location(i,j),min,open,closed, review, num);//Restaurant
                }
                r = (int)(Math.random()*35 + 15);
                c = (int)(Math.random()*35 + 15);
                if(((i%r) == 0) && (j%c) == 0&&entireTown[i][j].type.equals("E")){
                    min = (int)(Math.random()*15+1);
                    open = (int)(Math.random()*12+1);
                    closed = (int)(Math.random()*12+1);
                    review = (int)(Math.random()*4+2);
                    num = (int)(Math.random()*50+1);
                    entireTown[i][j] = new Building(i + "H" + j,new Location(i,j),min,open,closed, review, num);//Salon
                }
                r = (int)(Math.random()*35 + 15);
                c = (int)(Math.random()*35 + 15);
                if(((i%r) == 0) && (j%c) == 0&&entireTown[i][j].type.equals("E")){
                    min = (int)(Math.random()*15+1);
                    open = (int)(Math.random()*12+1);
                    closed = (int)(Math.random()*12+1);
                    review = (int)(Math.random()*4+2);
                    num = (int)(Math.random()*50+1);
                    entireTown[i][j] = new Building(i + "C" + j,new Location(i,j),min,open,closed, review, num);//Covid19 testing facilities
                }

                System.out.print(entireTown[i][j].type + " ");
            }
            System.out.println();
        }
        return entireTown;

    }

}

