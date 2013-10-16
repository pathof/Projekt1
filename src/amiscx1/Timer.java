/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amiscx1;

/**
 *
 * @author Rapier
 */
public class Timer implements EventInterface {
    EventScheduler scheduler = EventScheduler.getInstance();
    
    @Override
    public void processEvent(Event event){
       TimerEvent tEvent = (TimerEvent)event;
       
       if(tEvent.permament == true){
           this.generateTimer(tEvent.relativeTime, true, tEvent.timerID);
       }
       
        if(scheduler.getTime2() > 2000){
            scheduler.stopEventScheduler();
        }
        System.out.println(scheduler.getTime() +" Timer.processEvent aufgerufen " +tEvent.timerID ); 
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
