/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue1;

/**
 *
 * @author david
 */
public class Numbers {
    int limit;
    
    public Numbers (int limit) {
        if (checkLimit(limit)) {
            this.limit = limit;
        } else {
            System.out.println("Bitte eine ordnugnsgemäße Grenze angeben!");
            System.exit(0);
        }
        
    }
    
    public boolean checkLimit (int limit) {
        if (limit % 2 == 0) {
            return true;
        }
        return false;
    }
}
