/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amiscx1;

/**
 *
 * @author intre_000
 */
public class Slave extends Node {
    
    int slaveID;
    
    public Slave(int nodeID, Channel channel, int slaveID){
      
        super(nodeID, channel);
        this.slaveID = slaveID;
    }
        
    
    public void recievePacket(Packet packet){
        
        System.out.println("Slave " + slaveID + " hat ein Packet empfangen");
        
    }
   
    
}
