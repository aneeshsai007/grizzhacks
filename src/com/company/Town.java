package com.company;

public class Town {
    int [][] entireTown = new int[100][100];
    public void map(){
        for (int i = 1; i < 100; i++){
            for (int j = 0; j < 100; j++){
                if(((i%13) == 0) && (j%17) == 0){
                    entireTown[i][j] = 1;//Supermarket
                }
                if(((i%17) == 0) && (j%13) == 0){
                    entireTown[i][j] = 2;//Park
                }
                if(((i%19) == 0) && (j%21) == 0){
                    entireTown[i][j] = 3;//Gas Station
                }
                if(((i%21) == 0) && (j%19) == 0){
                    entireTown[i][j] = 4;//Restaurant
                }
                if(((i%37) == 0) && (j%11) == 0){
                    entireTown[i][j] = 5;//Salon
                }
                if(((i%11) == 0) && (j%37) == 0){
                    entireTown[i][j] = 6;//Covid19 testing facilities
                }
                System.out.print(entireTown[i][j] + " ");
            }
            System.out.println();
        }


    }
}
