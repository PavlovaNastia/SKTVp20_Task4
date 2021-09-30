/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task4anastasiapavlova;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pavlo
 */
public class SKTVp20Task4AnastasiaPavlova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] nums = new int[100];
        Random random = new Random();

        for (int i=0; i < nums.length; i++) { // цикл заполнения массива нечетными числами в диапазоне 0 - 200
            do {
                nums[i] = random.nextInt(200);
            } while (nums[i]%2==0);    
        }

        
        int count = 0;
        for(int i=0; i < nums.length; i++) {
            count++;
            if (count%10==0) {
                
            }
        }

      
        Arrays.sort(nums); //сортировка по возрастанию

       
        int count2 = 0;

        for(int i=0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
            count2++;
            if (count2%10==0) {
                System.out.println("");
            }
        }

        System.out.println("");

        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Cреднее арифметическое всех чисел массива: " + (sum/100));

    }

}
