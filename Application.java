/**
 * Class to test the methods of SmallBag.java
 * @author Matt Rice
 * @version 08/29/2022
 *Application.java
 */
public class Application {

	public static void main(String[] args) {
		//Creating and instantiating items and setting their e values
		Item<String> item= new Item<String>(); 
		
			item.setE("MattRice");//sets item.e to my name
			
		Item<Integer> item2= new Item<Integer>();
			
			item2.setE(15);//sets item2.e to 15
		//Creates a SmallBag of type Item
		SmallBag<Item> smallbag= new SmallBag<Item>();
		
			//Sets items in the SmallBag and prints their e values
			smallbag.setItem(item);//puts item into smallbag
		
			System.out.println(smallbag.getItem().getE());//prints the e value of item
		
			smallbag.setItem(item2);//puts item2 into smallbag
			
			System.out.println(smallbag.getItem().getE());//prints the e value of item2
	}//end main

}//end Application.java

