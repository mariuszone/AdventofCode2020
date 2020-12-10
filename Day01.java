package me.mariusm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int x=0;
        while (x != -1) {
            x = Integer.parseInt(reader.readLine());
            if (x != -1) myList.add(x);
        }
        for (int i=0; i< myList.size()-1; i++) {
            for (int j=i+1; j< myList.size(); j++) {
                if (myList.get(i)+myList.get(j) == 2020) System.out.println(myList.get(i) + " + " + myList.get(j) + " = 2020");
            }
        }
    }
}
