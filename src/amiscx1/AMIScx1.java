/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amiscx1;
import java.util.*;

/**
 *
 * @author Pino
 */
  
    
public class AMIScx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EventScheduler scheduler = EventScheduler.getInstance();
        
        Channel channel = new Channel(3);
        
        
        
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        
        timer1.generateTimer(100, false, 1);
        timer2.generateTimer(200, true, 2);
        
        timer1.generateTimer(300, false, 3);
        
        scheduler.startEventScheduler();
        
    }
       /*
        Scanner sc = new Scanner(System.in);
        int x;
       System.out.print("Wieviele Events wollen Sie einrichten?");
       x=sc.nextInt();
   
        
        //z.addEvent();
        //z.ausgabe();
    */
    
    
    
    
    
    
    
    
    
    
    }

