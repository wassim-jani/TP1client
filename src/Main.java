import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// etudiant
public class Main {

	public static void main(String[] args) {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
		try{
			DatagramSocket socket=new DatagramSocket();
			System.out.println("entrez votre nom svp");
			String nom =bf.readLine();
			System.out.println("entrez votre login svp");
			String login =bf.readLine();
			System.out.println("entrez votre niveau svp");
			String niveau =bf.readLine();
			String messageConnexion="##"+login+"#"+nom+"#"+niveau ;
			DatagramPacket packet =new DatagramPacket(messageConnexion.getBytes(),messageConnexion.length(),InetAddress.getLocalHost(),3000);
			socket.send(packet);
			Send s1=new Send(socket);
			s1.start();
			Recieve r=new Recieve(socket);
			r.start();			
		}catch (Exception e){System.out.println("erreur");
		
	
		}}
}
