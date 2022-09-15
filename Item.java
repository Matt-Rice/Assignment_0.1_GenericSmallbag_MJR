
/**
 * Generic class for an Item
 * @author Matt Rice
 * @version 08/29/2022
 *Item.java
 */
public class Item<T> {
	//Instance variable
	private T e;
	/**
	 * Method to set the e value of an item
	 * @param e the value to be set
	 */
	public void setE(T e) {
		this.e=e;
	}//end setE()
	/**
	 * Get the e value of an item
	 * @return T the e value of the desired item
	 */
	public T getE() {
		return e;
	}//end getE()

}//end Item
