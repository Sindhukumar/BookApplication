
public class Book {

	private String title, author, description;
	private double price;
	private boolean isInStock;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isInStock() {
		return isInStock;
	}
	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}
	public void getDisplayText(){
		System.out.println("Author: "+ author);
		System.out.println("Title: "+ title);
		System.out.println("Description: "+ description);
	}
	
	
	
}
