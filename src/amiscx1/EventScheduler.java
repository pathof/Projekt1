
package amiscx1;
import java.util.*;
/**
 * @author Pino
 */
public class EventScheduler{
    
     List<Event> eventList = new LinkedList(); //  neue verkettete Liste
     long  simTime = 0; // Simulationszeit
     final int SAMPLING_RATE=0; // Abtastrate 
     boolean running = false;
      Comparator<Event> comp = new EventSort(); // Nötig für Listenelement-Sortierung
     private static EventScheduler instance = new EventScheduler(); // Singleton Eventscheduler - 1 Objekt
     final long simEnd = 50000; //Konstante für das Simulationsende
    
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
    
     
    

     
    
     
     public String getTime(){return " " +simTime;} // Simulationszeit als String
     public long getTime2(){return simTime;} // Simulationszeit als long int
     public void startEventScheduler(){ // Methode Sart
         
         running = true;
         
         while (running){
             
         Event event = eventList.get(0); // Erzeugt Objekt Typ Event verweis auf eventList Posi 1
         simTime = event.absoluteTime; // simulatonszeit = absolute Zeit vom Event
         event.source.processEvent(event); // Auslösen ProzessEvent
         eventList.remove(0); // Entfernt Event
         
     
         }
     
     
         
         
         eventList.get(0);
     
     
     }
     public void stopEventScheduler(){
     
         running = false;
     }
     
     public void addEvent(Event event){     //  Hinzufügen neues Event
         event.absoluteTime=simTime+event.relativeTime; 
         eventList.add(event); // in die Liste einfügen / anhängen
     Collections.sort(eventList, comp); // Sortieren 
         
         
         System.out.println("Event added" + event.absoluteTime); // Ausgabe Text + AbsoluteZeit
         
        
     }
     
     


     
     
     
     
     
     
     
     
     
     
     
     }
     
 
       
    
 
    
 
   


