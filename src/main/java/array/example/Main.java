package array.example;

import java.util.ArrayList;
import java.util.Random;

  public class Main {
    public static void main(String[] args) {

      ArrayList<Integer> randomList = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 100; i++) {
            int randomNumber = rand.nextInt(100);
            randomList.add(randomNumber);

        }
            System.out.println("Cписок случайных чисел: " + randomList);

            System.out.println("Все элементы списка, которые больше предыдущего элемента этого же списка: ");

                for (int i = 1; i < randomList.size(); i++){

                    int currentNumber = randomList.get(i);
                    int previousNumber = randomList.get(i -1);

                    if (currentNumber > previousNumber){
                        System.out.println(currentNumber);
                    }
                }

                System.out.println("Наименьший из всех положительных элементов в списке: ");

                int minPositive = Integer.MAX_VALUE;

                for (int i = 0; i < randomList.size(); i++){

                    int currentNumber = randomList.get(i);

                    if (currentNumber > 0 && currentNumber < minPositive){
                        minPositive = currentNumber;
                    }
                        System.out.println(currentNumber);
                }
    }

  }
