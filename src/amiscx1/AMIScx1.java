/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Version 2 (Sortieren, Zeitbegrenzung, Kommentare)
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
        
        EventScheduler scheduler = EventScheduler.getInstance(); // EventScheduler als Singleton
        
        Channel channel = new Channel(3); // Kontruktor 3 Nodes
        
        Master master = new Master(0, channel);
        Slave slave1 = new Slave(1, channel, 1);
        Slave slave2 = new Slave(2, channel, 2);
        
        /*
        Node node1 = new Node(0, channel);
        Node node2 = new Node(1, channel);
        Node node3 = new Node(2, channel);
        */
        
        
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        
        timer1.generateTimer(100, false, 1); // Millisekunden / Permanent-Status / Timer-ID
        timer1.generateTimer(50, true, 4);
        timer2.generateTimer(200, true, 2);
        
        timer1.generateTimer(300, false, 3);
        
        master.sendTestpacket(); // Test
        scheduler.startEventScheduler(); // Start Scheduler - Funktion
        
        
    }
        
    }
   
  
    
    
    
    
    
    
    
    
    
    
  

