/**
 * 
 */

/**
 * @author Antonio Balagot
 *
 */
public class Magpie3 {
		//Get a default greeting and return a greeting
		public String getGreeting() {
			return "Hello, let's talk.";
		}
		
		/*
		 * 1
		/**
		 * Gives a response to a user statement
		 * takes in user statement
		 * response based on the rules given
		 */
		
		
		public String getResponse(String statement) {
			String response = "";{
				if (findKeyword(statement,"no") >= 0) {
					response = "Why so negative?";
				} else if (findKeyword(statement,"mother") >= 0
						|| findKeyword(statement,"father") >= 0
						|| findKeyword(statement,"sister") >= 0
						|| findKeyword(statement,"brother") >= 0) {
					response = "Tell me more about your family.";
				} else if (findKeyword(statement,"teacher") >= 0) {
						response = "I like that teacher.";
				} else if (findKeyword(statement,"Mrs") >= 0
						|| findKeyword(statement,"Dreyer") >= 0
						|| findKeyword(statement,"Alberta") >=0
						|| findKeyword(statement,"Louie") >=0
						|| findKeyword(statement,"Arge") >=0
						|| findKeyword(statement,"Ms") >= 0) {
					response = "She sounds like a nice person.";
				} else if (findKeyword(statement,"Mr") >= 0
						|| findKeyword(statement,"Headley") >= 0
						|| findKeyword(statement,"Latham") >=0) {
					response = "He sounds like a good teacher.";
				} else if (findKeyword(statement,"sorry") >= 0) {
					response = "It's fine. I forgive you. :)";
				} else if (findKeyword(statement,"food") >= 0) {
					response = "I love chicken and rice. It's my favorite food.";
				} else if (findKeyword(statement,"weather") >= 0) {
					response = "It's sunny as long as you're here.";
				} else if (findKeyword(statement,"Giants") >= 0
						|| findKeyword(statement,"49ers") >= 0
						|| findKeyword(statement,"Warriors") >= 0) {
					response = "I bet they'll win their next game.";
				} else if (statement.trim().length() < 1) {
					response = "Say something please.";
					
				} else {
					response = getRandomResponse();
				}
				return response;
			}
			}
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

			/**
			 * Pick a default response to use if nothing else fits.
			 * returns a non-committal string
			 */
			
		/**
		 * Search for one word in phrase. The search is not case sensitive. This
		 * method will check that the given goal is not a substring of a longer
		 * string (so, for example, "I know" does not contain "no").
		 * 
		 * parameter: statement
		 *            the string to search
		 * parameter: goal
		 *            the string to search for
		 * parameter: startPos
		 *            the character of the string to begin the search at
		 * return the index of the first occurrence of goal in statement or -1 if
		 *         it's not found
		 */
		private int findKeyword(String statement, String goal, int startPos) {
			String phrase = statement.trim();
			// The only change to incorporate the startPos is in
			// the line below
			int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

			// Refinement--make sure the goal isn't part of a
			// word
			while (psn >= 0) {
				// Find the string of length 1 before and after
				// the word
				String before = " ", after = " ";
				if (psn > 0) {
					before = phrase.substring(psn - 1, psn).toLowerCase();
				}
				if (psn + goal.length() < phrase.length()) {
					after = phrase.substring(psn + goal.length(),
							psn + goal.length() + 1).toLowerCase();
				}

				// If before and after aren't letters, we've
				// found the word
				if (before.equals(" ") && after.equals(" ")) {
					return psn;
				}

				// The last position didn't work, so let's find
				// the next, if there is one.
				psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

			}

			return -1;
		}

		/**
		 * Search for one word in phrase. The search is not case sensitive. This
		 * method will check that the given goal is not a substring of a longer
		 * string (so, for example, "I know" does not contain "no"). The search
		 * begins at the beginning of the string.
		 * 
		 * takes in the string to search
		 * takes in the string to search for
		 * returns the index of the first occurrence of goal in statement or -1 if it's not found
		 */
		private int findKeyword(String statement, String goal) {
			return findKeyword(statement, goal, 0);
			
		}

		/**
		 * Pick a default response to use if nothing else fits.
		 * returns a non-committal string
		 */
		
			
			
	
			
		}




