package ch5;

public class ArrayEx6 {
    public static void main(String[] args){
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];
        for(int i:score){
            if(i > max)
                max = i;
            else if(i < min)
                min = i;
        }
        System.out.println("최댓값:" + max);
        System.out.println("최솟값:" + min);
    }
}
