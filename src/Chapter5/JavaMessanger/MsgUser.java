package Chapter5.JavaMessanger;

import java.util.Set;

public class MsgUser implements Comparable<Object>{
	
	Server server;
	String name, password;
	
	MsgWindow myWindow;
	
	public MsgUser(Server server, String name, String password){
		this.server = server;
		this.name = name;
		this.password = password;
	}
	
	public String toString(){
		return name;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public boolean equals(Object other){
		return (other != null) && (this.name.equalsIgnoreCase(((MsgUser)other).getName()));
	}

	@Override
	public int compareTo(Object other) {
		return this.name.compareToIgnoreCase(((MsgUser) other).getName());
	}
	
	public void openDialogue(Set<MsgUser> buddies){
		myWindow = new MsgWindow(this, buddies);
	}
	
	public void addBuddy(MsgUser u){
		if (this.myWindow != null)
			this.myWindow.addBuddy(u);
	}
	
	public void removeBuddy(MsgUser u){
		if (this.myWindow != null)
			this.myWindow.removeBuddy(u);
	}
	
	public void receiveMessage(String text){
		if(this.myWindow != null){
			this.myWindow.showMessage(text);
		}
	}
	
	public void quit(){
		myWindow.dispose();
		server.logout(this);
	}

}
