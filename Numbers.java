/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue1;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Numbers {
    public int limit;
    public ArrayList<Integer> sums;
    
    public Numbers (int limit) {
        if (checkLimit(limit)) {
            this.limit = limit;
        } else {
            System.out.println("Bitte eine ordnugnsgemäße Grenze angeben!");
            System.exit(0);
        }
        sums = new ArrayList<>();
        getSums();
        printDone();
        
    }
    
    public boolean checkLimit (int limit) {
        if (limit == 2 || limit == 0) {
            return false;
        }
        if (limit % 2 == 0) {
            return true;
        }
        return false;
    }
    
    public void getSums () {
        for (int i = 4; i <= limit; i+=2) {
            sums.add(i);
        }
    }
    
    public void printDone () {
        for (int i = 0; i < sums.size(); i++) {
            System.out.println(sums.get(i) + " summe: ");
        }
    }
}
