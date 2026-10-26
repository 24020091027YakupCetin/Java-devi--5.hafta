package main;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Karıştırmadan önce: " + numbers);
        
        shuffle(numbers);
        
        System.out.println("Karıştırdıktan sonra: " + numbers);
    }
}