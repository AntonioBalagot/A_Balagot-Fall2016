import java.util.Arrays;

//Antonio Balagot APCS1
//   10/23/16
//   
public class Split 
{
	public static void main(String[] args) 
	{
		//play around
		String apples = "I reallyreally like apples";
		String[] split = apples.split("really");
		System.out.println(Arrays.toString(split));
		
		System.out.println(splitSandwich("applespineapplesbreadlettucetomatobaconmayohambreadcheese"));
		System.out.println(splitSandwich2("apples pineapples bread lettuce tomato baconmayo ham bread cheese"));
	}
			
	
	//Returns what is in the middle of the sandwich (ie. Everything but bread)
	public static String splitSandwich(String string){
		String[] ingredients = string.split(" ");
		int piecesOfBread = 0;
		String singleIngredient = "";
		//For checking if bread is part of the sandwich
		String isThereBread = (" ");
		while(isThereBread.indexOf("bread") !=-1){
			int check = isThereBread.indexOf("bread");
			isThereBread = isThereBread.substring(check + 4);
			piecesOfBread++;
		}
		if(ingredients.length >3){
			for(int i=1; i <ingredients.length; i++){
				System.out.println(ingredients[i - 1]);
			}
			}else if(ingredients.equals(" ")){
				System.out.println("This is not a sandwich");
			}else if(piecesOfBread < 2){
				System.out.println("This is not a sandwich");
			}else if (ingredients.length < 2){
				System.out.println("This is not a sandwich");
			}else{
				int firstBread=string.indexOf("bread") + 5;
				String lastBread = string.substring(firstBread);
				String Ingredients=lastBread.substring(0, lastBread.lastIndexOf("bread"));
				if(Ingredients.indexOf("bread")>=0){
					String[] sandwich = Ingredients.split("bread");
						if(sandwich.length==0){
							System.out.println("This is not  sandwich.");
						}else{
							for(String part:sandwich){
								singleIngredient= singleIngredient + part;
							}
				System.out.println(ingredients[1]);
			}
				}}
		return(Arrays.toString(ingredients));
		}

	//Returns middle of sandwich after taking in a string without spaces
	public static String splitSandwich2(String statement){
		//Take out spaces
		String[] removeSpaces=statement.split(" ");
		//Separate into each ingredient
		String singleIngredient = "";
		for(String part:removeSpaces){
			singleIngredient = singleIngredient + part;
		}
		
		int piecesOfBread = 0;
		
		for(int i=0; i<singleIngredient.length() - 4; i++){
			if(singleIngredient.substring(i, i+5).equals("bread")){
				piecesOfBread = piecesOfBread + i;
			}
		}
		if(piecesOfBread < 2){
			System.out.println("This is not a sandwich");
		}else{
			int firstBread=statement.indexOf("bread") + 5;
			String lastBread = statement.substring(firstBread);
			String Ingredients=lastBread.substring(0, lastBread.lastIndexOf("bread"));
			if(Ingredients.indexOf("bread")>=0){
				String[] sandwich = Ingredients.split("bread");
					if(sandwich.length==0){
						System.out.println("This is not  sandwich.");
					}else{
						for(String part:sandwich){
							singleIngredient= singleIngredient + part;
						}
					}
		}
	}
		return (singleIngredient);
	}
	}





