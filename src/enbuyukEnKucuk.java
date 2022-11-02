import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class enbuyukEnKucuk {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = {15 , 12 , 788 , 1 , -1 , -778 , 2 , 0};
        System.out.println(Arrays.toString(list));

        System.out.println("Bir sayı giriniz:");
        int sayi = inp.nextInt();

        Arrays.sort(list);

        int min = list[0];
        int max = list[list.length-1];

        for(int i : list){
            if(i < max && i> sayi){
                max = i;
            }
            if(i> min && i< sayi){
                min = i;
            }
        }
        System.out.println("en küçük sayı: " + min);
        System.out.println("en büyük sayı: " + max);
    }
}
