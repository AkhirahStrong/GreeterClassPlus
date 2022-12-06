import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterAppTest {

	@Test
	void testGreeterConstructer1() {
		Greeter greet1 = new Greeter("Hello");
		assertEquals("Hello", greet1.getGreeting());
	}
	
	@Test
	void testGreeterConstructer2() {
		Greeter greet2 = new Greeter("How's it going");
		assertEquals("How's it going", greet2.getGreeting());
	}
	
	@Test
	void testGreeterGreetMethod1() {
		Greeter greet3 = new Greeter("Hola");
		assertEquals("Hola, Tim!", greet3.greet("Tim"));
	}
	
	@Test
	void testGreeterGreetMethod2() {
		Greeter greet4 = new Greeter("What's up");
		assertEquals("What's up, Adam!", greet4.greet("Adam"));
	}
	
	@Test
	void testSimonGreeterConstructer1() {
		SimonGreeter greet1 = new SimonGreeter("Hello");
		assertEquals("Hello", greet1.getGreeting());
	}
	
	@Test
	void testSimonGreeterConstructer2() {
		SimonGreeter greet2 = new SimonGreeter("How's it going");
		assertEquals("How's it going", greet2.getGreeting());
	}
	
	@Test
	void testSimonGreeterGreetMethod1() {
		SimonGreeter greet3 = new SimonGreeter("Hola");
		String expected = "Simon Says, \"Hola, Tim!\"";
		assertEquals(expected, greet3.greet("Tim"));
	}
	
	@Test
	void testSimonGreeterGreetMethod2() {
		SimonGreeter greet4 = new SimonGreeter("What's up");
		String expected = "Simon Says, \"What's up, Bob!\"";
		assertEquals(expected, greet4.greet("Bob"));
	}
	
	@Test
	void testLoudGreeterConstructer1() {
		LoudGreeter greet1 = new LoudGreeter("Hello");
		assertEquals("Hello", greet1.getGreeting());
	}
	
	@Test
	void testLoudGreeterConstructer2() {
		LoudGreeter greet2 = new LoudGreeter("How's it going");
		assertEquals("How's it going", greet2.getGreeting());
	}
	
	@Test
	void testLoudGreeterGreetMethod1() {
		LoudGreeter greet3 = new LoudGreeter("Hola");
		String expected = "Hola, Tim!!";
		assertEquals(expected, greet3.greet("Tim"));
	}
	
	@Test
	void testLoudGreeterGreetMethod2() {
		LoudGreeter greet4 = new LoudGreeter("What's up");
		greet4.addVolume();
		greet4.addVolume();
		String expected = "What's up, Sam!!!!";
		assertEquals(expected, greet4.greet("Sam"));
	}
	
	@Test
	void testHtmlGreeterConstructor1() {
		HtmlGreeter greet1 = new HtmlGreeter("Hello");
		assertEquals("h1", greet1.getTagName());
	}

	@Test
	void testHtmlGreeterConstructor2() {
		HtmlGreeter greet2 = new HtmlGreeter("Hola", "/p");
		assertEquals("/p", greet2.getTagName());
	}
	
	@Test
	void testHtmlGreeterGreetMethod1() {
		HtmlGreeter greet3 = new HtmlGreeter("What's up", "/p");
		assertEquals("</p>What's up, Lloyd!</p>", greet3.greet("Lloyd"));
	}
	
	@Test
	void testHtmlGreeterGreetMethod2() {
		HtmlGreeter greet4 = new HtmlGreeter("Howdy");
		assertEquals("<h1>Howdy, Tim!<h1>", greet4.greet("Tim"));
	}
	
	@Test
	void testHtmlGreeterGreetMethod3() {
		HtmlGreeter greet5 = new HtmlGreeter("What's poppin", "lol");
		assertEquals("<lol>What's poppin, Floyd!<lol>", greet5.greet("Floyd"));
	}

}
