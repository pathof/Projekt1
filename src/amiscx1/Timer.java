/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amiscx1;

import java.util.Collections;

/**
 *
 * @author Rapier
 */
public class Timer implements EventInterface {
    EventScheduler scheduler = EventScheduler.getInstance();
    
    @Override
    public void processEvent(Event event){
       TimerEvent tEvent = (TimerEvent)event; // Typecast 
       
       if(tEvent.permament == true){
           this.generateTimer(tEvent.relativeTime, true, tEvent.timerID); // Timer Event Relative Zeit, Permanent, timerID
       }
       
        if(scheduler.getTime2() > scheduler.simEnd){ // Wenn SimTime als Int größer als SimEnde
            scheduler.stopEventScheduler(); // StopEventScheduler
        }
        System.out.println(scheduler.getTime() +" Timer.processEvent aufgerufen " +tEvent.timerID ); // Ausgabe
    }
    
    
    public void generateTimer(long relativeTime, boolean permament, int timerID){
    
    TimerEvent event = new TimerEvent();
    event.relativeTime = relativeTime;
    event.permament = permament;
    event.timerID = timerID;
    event.source = this; 
    scheduler.addEvent(event);
    
    }
    
}
