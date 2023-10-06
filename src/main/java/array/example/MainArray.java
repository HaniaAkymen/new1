package array.example;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(78);
        first.add(35);
        first.add(56);
        first.add(101);
        first.add(38);
        first.add(58);
        first.add(-35);

        int maxValue = first.get(0);

        for(int i = 0; i < first.size(); i++ ){
             int currentValue = first.get(i);

            if (currentValue > maxValue){
                maxValue = currentValue;
            }
        }
        System.out.println("Максимальное значение " + maxValue);
    }




}
