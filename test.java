package Arraytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s1 = new Scanner(System.in);
        
        int sayi = s1.nextInt();
        
        while (sayi != 0) {
            list.add(sayi);
            sayi = s1.nextInt();
        }
        
        if (!list.isEmpty()) {
            System.out.println("en büyük sayı:" + Collections.max(list));
        } else {
            System.out.println("Liste boş!");
        }
        
        s1.close();
    }
}