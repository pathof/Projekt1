/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amiscx1;

/**
 *
 * @author intre_000
 */
public class Master extends Node {
    
    public Master(int nodeID, Channel channel){
      
        super(nodeID, channel);
    }
    
    public void recievePacket(Packet packet){
        
        System.out.println("Master hat ein Packet empfangen");
        
    }
    
    /*
    public void sendPacket(Packet packet){
        
    }*/
    
}
