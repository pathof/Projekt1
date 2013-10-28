/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amiscx1;

/**
 *
 * @author Pino
 */
import java.util.Comparator;
 
public class EventSort implements Comparator<Event> { // Implementiert Komperator
 
  @Override // Ueberschreibt die alte compare Mehtode
  public int compare(Event b1, Event b2) { // compare Event1 - Event2
   
      
      return (int)b1.absoluteTime - (int)b2.absoluteTime; // Rückgabe Absolutzeit Event1 - Absolutzeit Event2
}}
