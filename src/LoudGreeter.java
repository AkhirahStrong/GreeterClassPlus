
public class LoudGreeter extends Greeter{
	
private String extra = "!";
	
	public LoudGreeter(String greeting){
		super(greeting);
	}
	
	// Adds on additional "!"'s from "extra"
	public String greet(String name) {
		return (super.greet(name) + extra);
	}
	
	public void addVolume() {
		extra += "!";
	}

}
