import java.util.Arrays;

//Antonio Balagot APCS1
//   10/23/16
//   
public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		String apples = "I reallyreally like apples";
		String[] split = apples.split("really");
		System.out.println(Arrays.toString(split));
	}
			
		//Your task:
		/*Write a method that takes in a string like "applespineapplesbreadlettucetomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	String bread;	
	bread =("applespineapplesbreadlettucetomatobaconmayohambreadcheese");
	public static void bread(String string){
		String[] ingredients = string.split("bread");
		int piecesOfBread = 0;
		//For checking if bread is part of the sandwich
		String isThereBread;
		//Sandwich with nothing in it
		String nothingSandwich;
		while(isThereBread.indexOf("bread") !=-1){
			int check = isThereBread.indexOf("bread");
			isThereBread = isThereBread.substring(check + 4);
			piecesOfBread++;
		}
		if(ingredients.length >3){
			for(int i=1; i <ingredients.length; i++){
				System.out.println(ingredients[i - 1]);
			if(piecesOfBread < 2){
				System.out.println("This is not a sandwich");
			}else if(nothingSandwich.equals("")){
				System.out.println("This is not a sandwich");
			}else if(piecesOfBread < 2){
				System.out.println("This is not a sandwich");
			}else if (ingredients.length < 2){
				System.out.println("This is not a sandwich");
			}else{
				System.out.println(ingredients[1]);
			}
		}
		}
	}
}
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettuce tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/




