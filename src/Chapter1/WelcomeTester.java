package Chapter1;

public class WelcomeTester {
	public static void main(String[] args){
		WelcomeMessage[] messages = new WelcomeMessage[3];
		messages[0] = new WelcomeEnglish();
		messages[1] = new WelcomeSpanish();
		messages[2] = new WelcomeFrench();
		
		for(WelcomeMessage m : messages)
			System.out.println(m.getWelcomeMessage());
	}
	
}
