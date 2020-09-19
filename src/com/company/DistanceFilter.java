package com.company;

public class DistanceFilter implements Filter
{
    public int radius;
    //public int rank;
    public DistanceFilter(int h){//,int r){
        radius = h;
        //rank = r;
    }
    public boolean match(String dto){
        if(Integer.parseInt(dto)<=radius){
            return true;
        }
        return false;
    }

}
