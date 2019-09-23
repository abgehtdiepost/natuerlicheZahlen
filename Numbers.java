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
    public ArrayList<Integer> primeNumbers;
    public EratosthenesPrimeSieve pS;
    
    public Numbers (int limit) {
        if (checkLimit(limit)) {
            this.limit = limit;
        } else {
            System.out.println("Bitte eine ordnugnsgemäße Grenze angeben!");
            System.exit(0);
        }
        sums = new ArrayList<>();
        pS = new EratosthenesPrimeSieve(limit);
        
        getSums();
        calc();
        
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
    
    public void calc () {
        for (int i = 0; i < sums.size(); i++) {
            for (int j = 0; j < sums.size(); j++) {
                if (pS.primeNumbers.get(i)+pS.primeNumbers.get(j) == sums.get(i)){
                    System.out.println(sums.get(i) + " summe: " + sums.get(i) + " = " + pS.primeNumbers.get(i) + " + " + pS.primeNumbers.get(j));
                }
            }
        }
        
        
        
        /*
        for (int i = 0; i < sums.size(); i++) {
            if (pS.primeNumbers.get(i)*2 == sums.get(i)) {
                System.out.println(sums.get(i) + " summe: " + sums.get(i) + " = " + pS.primeNumbers.get(i) + " + " + pS.primeNumbers.get(i));
            } else {
                    if (pS.primeNumbers.get(i) + pS.primeNumbers.get(i+1) == sums.get(i)) {
                    
                }
                
            }
        }*/
    }
    
    /*public void printDone () {
        for (int i = 0; i < sums.size(); i++) {
            System.out.println(sums.get(i) + " summe: ");
        }
    }*/
}
