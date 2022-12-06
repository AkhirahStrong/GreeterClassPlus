
public class Greeter {
	
	private String greeting;
	
	
	
	public Greeter(String greeting) {
		this.greeting = greeting;
	}
	
	public String greet(String name) {
		return (greeting + ", " + name + "!");
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
