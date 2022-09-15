/**
 * Generic class for a small bag
 * @author Matt Rice
 * @version 08/29/2022
 *SmallBag.java
 */
public class SmallBag<E> {
	//instance variable
	private E thing;
	/**
	 * Getter for an item in the bag
	 * @return the memory location of the item
	 */
	public E getItem() {
		return thing;
	}//end getItem()
	/**
	 * Setter for the item
	 * @param thing the Item that will be set in the bag
	 */
	public void setItem(E thing) {
		this.thing=thing;
	}//end setItem(E thing)

}//end SmallBag.java

