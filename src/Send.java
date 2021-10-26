import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send extends Thread {
	private Etudiant e;
	private DatagramSocket socket;
	public Send(DatagramSocket socket){this.socket=socket;}
	public void run(){
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
		try{
			while (true){
				System.out.println("Welecom...");
				String msg=bf.readLine();
				DatagramPacket pkt=new DatagramPacket( msg.getBytes(),
						msg.length(),InetAddress.getLocalHost(),3001);
				this.socket.send(pkt);
		}
	}catch(Exception e){e.printStackTrace();}

}}
