package com.company;
public class player {
    private String[] name={"Dawid Malan","Aaron Finch","Babar Azam","Devon Conway","Virat Kohli","Lokesh Rahul","Glenn Maxwell","Rassie van der Dussen","Evin Lewis","Martin Guptill",};
    private int[] age = {33,34,26,30,32,28,31,32,27,34};
    private double[] statistics = {1090,2356,2035,473,3159,1557,980,843,745,1875};
    private int[] bestperformance = {103,172,122,99,94,88,70,52,78,101};
    private int nn;
    public player(int nn){
        this.nn = nn;
    }

    public void viewplayerdetails(){
        System.out.println("player name is "+name[nn-1]);
        System.out.println("player name is "+age[nn-1]);
        System.out.println("player's "+statistics[nn-1]);
        System.out.println();
    }

    public void getbattingaverage(){
        double average;
        average = statistics[nn-1]/15;
        System.out.println("batting average is "+average);
        System.out.println();
    }

    public  void getbestperformance(){
        System.out.println("best performance is "+bestperformance[nn-1]);
        System.out.println();
    }
}
