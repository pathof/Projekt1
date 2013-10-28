/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amiscx1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Florian
 */
public class Channel implements EventInterface {

    
    List<Packet> packetList = new LinkedList();
    float[][] adjazenzmatrix;
    private int nodeCount;
    private Node[] nodeArray;
   EventScheduler scheduler = EventScheduler.getInstance();
    
        public Channel(int nodeCount){
     /**
     * Default-Konstruktor, der nicht außerhalb dieser Klasse
     * aufgerufen werden kann
     */ 
     this.nodeCount = nodeCount; 
     adjazenzmatrix = new float[nodeCount][nodeCount];
     //adjazenzmatrix = {{0.0,1.0,1.0},{1.0,0.0,1.0},{1.0,1.0,0.0}};
     nodeArray = new Node[nodeCount];
     
    
     
   //später eigene Klasse
   
             for(int i=0;i<=nodeCount-1;i++) {
                for(int j=0;j<=nodeCount-1; j++) {
                   if (i==j){
                   adjazenzmatrix[i][j] = (float) 0.0;
                   }
                   else{ 
                       adjazenzmatrix[i][j] = (float) 1.0;
                       }
                }
            }
     
     
     }
          
        public void addNode(int nodeID, Node node){
  
           if(0 <= nodeID && nodeID <= nodeCount-1){
               
               nodeArray[nodeID] = node; 
           }
           else {              
               System.out.println("Error while adding a node");
           }
                  
        }
   
        public void sendPacket(Packet packet, int nodeID){
            
           
           //hier erhält die methode ein packet und eine nodeID aus dem Event Scheduler
  
           addPacket(packet);
           ChannelEvent event = new ChannelEvent();
           event.relativeTime = packet.duration();
           event.source = this;
           event.packet = packet;
           event.nodeID = nodeID;
           scheduler.addEvent(event);
           
           
        }
        
        public void addPacket(Packet packet){
        packetList.add(packet);
        
        
        }
        
    @Override
        public void processEvent(Event event){
    
         ChannelEvent cEvent = (ChannelEvent)event; // Typecast 
    for ( int i =0; i<=nodeCount-1;i++){
        
        if(adjazenzmatrix[cEvent.nodeID][i] == 1.0){
            
            nodeArray[i].recievePacket(cEvent.packet);
                       
        }
        
        
    }
    
    
    
    
    };
        
        
        
}

        
/*
    
    // Klasse für Einlesen

    public void readDataInTo2d() throws IOException{                                // 
        BufferedReader dataBR = new BufferedReader(new FileReader(new File("matrix.csv")));
        String line = "";
        
                        //Deklarierung der Grundlegenden Matrix
            while ((line = dataBR.readLine()) != null) {                            //Solange die Zeile nicht leer ist ... 
              String[] stringArray = line.split(";");                               // Schreibe werte eine einen String
            
            
           /*     for(int i=0; i<9; i++)
                System.out.println("Test Einlesen: "+stringArray[i]); */
    /*                                  
            int run = 0;
                                          
                for (int i=0; i < 3; i++){                                          //Eingelesene Werte aus CSV-Datei           
                     adjazenzmatrix[0][i] = Integer.parseInt(stringArray[run]);     //werden hier in einen zweidimensionalen 
                     run += 1;                                                      //geschrieben.
                     System.out.println("Zwischen1: "+run);
                }
                for (int j=0; j < 3; j++){                   
                     adjazenzmatrix[1][j] = Integer.parseInt(stringArray[run]);
                     run += 1;
                     System.out.println("Zwischen2: "+run);     
                } 
                for (int k=0; k < 3; k++){                                        
                    adjazenzmatrix[2][k] = Integer.parseInt(stringArray[run]);
                     run += 1;
                     System.out.println("Zwischen3: "+run);
                }                        
            }
}
*/