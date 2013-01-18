package Chapter5.JavaMessanger;

import java.util.TreeMap;
import java.util.TreeSet;

public class Server implements Login{
	
	TreeMap<String, MsgUser> users;
	TreeSet<MsgUser> online;
	
	public Server(){
		users = new TreeMap<String, MsgUser>();
		online = new TreeSet<MsgUser>();
	}
	
	public int addUser(String name, String password){

		if(name.length() < 4 || name.length() > 10)
			return -1;
		if(password.length() < 2 || password.length() > 10)
			return -2;
		if(users.containsKey(name))
			return -3;
		
		MsgUser user = new MsgUser(this, name, password);
		users.put(name, user);	
		
		return 0;
	}
	
	@Override
	public int login(String name, String password) {
		MsgUser user = users.get(name);
		if(user == null)
			return -1;
		if(!users.get(name).getPassword().equals(password))
			return -2;
		if(online.contains(user))
			return -3;
		
		for(MsgUser u : online){
			u.addBuddy(user);
		}
		user.openDialogue(online);
		online.add(user);

		return 0;
	}

	public void logout(MsgUser u){
		online.remove(u);
		for(MsgUser user : online)
			user.removeBuddy(u);
	}
}
