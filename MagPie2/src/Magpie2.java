
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";{
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("teacher") >= 0) {
				response = "I like that teacher.";
		} else if (statement.indexOf("Mrs") >= 0
				|| statement.indexOf("Ms") >= 0) {
			response = "She sounds like a nice person.";
		} else if (statement.indexOf("Mr") >= 0) {
			response = "He sounds like a good teacher.";
		} else if (statement.indexOf("sorry") >= 0) {
			response = "It's fine. I forgive you. :)";
		} else if (statement.indexOf("food") >= 0) {
			response = "I love chicken and rice. It's my favorite food.";
		} else if (statement.indexOf("weather") >= 0) {
			response = "It's sunny as long as you're here.";
		} else if (statement.indexOf("Giants") >= 0
				|| statement.indexOf("49ers") >= 0
				|| statement.indexOf("Warriors") >= 0) {
			response = "I bet they'll win their next game.";
		} else if (statement.trim().length() < 1) {
			response = "Say something please.";
			
		} else {
			response = getRandomResponse();
		}
		return response;
	}
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "I don't like that.";
		} else if (whichResponse == 5) {
			response = "Oh, ok.";
		} else if (whichResponse == 6) {
			response = "Whatever.";
		}

		return response;
	}
}
