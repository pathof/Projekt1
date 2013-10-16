/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amiscx1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Florian
 */
public class Channel {

    
    List<Packet> packetList;
    float[][] adjazenzmatrix; 
    private int nodeCount;
    private Node[] nodeArray;
    
        public Channel(int nodeCount){
     /**
     * Default-Konstruktor, der nicht außerhalb dieser Klasse
     * aufgerufen werden kann
     */ 
     this.nodeCount = nodeCount;        
     adjazenzmatrix = new float[nodeCount][nodeCount]; 
     nodeArray = new Node[nodeCount];
     
     
     // matrix füllen mit for-schleifen.
     }
     
        public void addNode(int nodeID, Node node){
  
           if(0 <= nodeID && nodeID <= nodeCount-1){
               
               nodeArray[nodeID] = node; 
           }
           // else-error integrieren
        }
   
        public void sendPacket(Packet packet, int nodeID){
            
           // packetList.addPacket.....
            
        }}


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