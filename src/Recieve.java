import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Recieve extends Thread{
	private DatagramSocket socket;
	public Recieve(DatagramSocket socket){this.socket=socket;}
	public void run(){
		try{
			while(true){
				DatagramPacket ppkt=new DatagramPacket(new byte[1024],1024);
				this.socket.receive(ppkt);
				System.out.println(new String(ppkt.getData()));
			}
		}catch(Exception e){e.printStackTrace();}
	}
	

}
