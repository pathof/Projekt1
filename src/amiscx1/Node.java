/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amiscx1;

/**
 *
 * @author Florian
 */
public class Node {
    
    
    private int nodeID; 
    private Channel channel;
    private Packet packet;
    
    
    



        /**
     *
     * @param nodeID
     * @param channel
     */
    public Node(int nodeID, Channel channel){

               this.nodeID = nodeID; 
               this.channel = channel;
               channel.addNode(nodeID, this);
        }
        
        public void recievePacket (Packet packet) {
            
            System.out.println(this.nodeID+" Packet empfangen");        
    
        }
        
    public void sendTestpacket(){
        
        Packet testPacket = new Packet();
        testPacket.cin = 1;
        //testPacket.controlfield[0] = 'c';
        channel.sendPacket(testPacket, nodeID);
        
    }
}