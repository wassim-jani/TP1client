import java.net.*;



public class Etudiant {
	
	
	private String nom,login;
	private int niveau,port;
	private boolean connected;
	private InetAddress Add;
	
	
	
	public Etudiant(String nom, String login, int niveau, int port, boolean connected, InetAddress add) {
		super();
		this.nom = nom;
		this.login = login;
		this.niveau = niveau;
		this.port = port;
		this.connected = connected;
		Add = add;
	}

	public InetAddress getAdd() {
		return Add;
	}

	public void setAdd(InetAddress add) {
		Add = add;
	}

	public Etudiant() {
		super();
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}



	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public boolean isConnected() {
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}

}
