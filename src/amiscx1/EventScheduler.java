
package amiscx1;
import java.util.*;
/**
 * @author Pino
 */
public class EventScheduler{
    
     List<Event> eventList = new LinkedList();
     long  simTime = 0;
     final int SAMPLING_RATE=0;
     boolean running = false;
    
     private static EventScheduler instance = new EventScheduler();
    
    private EventScheduler(){
     /**
     * Default-Konstruktor, der nicht außerhalb dieser Klasse
     * aufgerufen werden kann
     */ 
     }
     
    public static EventScheduler getInstance() 
    {return instance;
    /**
     * Statische Methode, liefert die einzige Instanz dieser
     * Klasse zurück
     */
    }
    
     
    
     public void ausgabe(){
     System.out.println("Haaaaaaaaaaaaaaaaallllllllooooooo");
     Event X = new Event();  
     
     
       
             
             }
     
     public String getTime(){return " " +simTime;}
     public long getTime2(){return simTime;} 
     public void startEventScheduler(){
         
         running = true;
         
         while (running){
         Event event = eventList.get(0);
         simTime = event.absoluteTime;
         event.source.processEvent(event);
         eventList.remove(0);
         }
     
     // sortieren nebensächlich ... machen wir später
         
         
         eventList.get(0);
     
     
     }
     public void stopEventScheduler(){
     
         running = false;
     }
     
     public void addEvent(Event event){     
         event.absoluteTime=simTime+event.relativeTime;
         eventList.add(event);
         
         System.out.println("Event added");
     }
     
     
     }
     
 
       
    
 
    
 
   


