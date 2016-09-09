import java.util.Scanner;

public class BookApp {
	public static void main(String args[]) {
		Book b1= new Book();
		b1.setAuthor("Aname");
		b1.setTitle("Atitle");
		b1.setDescription("Adescription");
		b1.getDisplayText();
		b1.setPrice(20);
		double pricePerBook = b1.getPrice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of books you want the price for:");
		int numOfBooks = sc.nextInt();
		
		double price = b1.getPrice(numOfBooks);
		if(price!=numOfBooks*pricePerBook){
			System.out.println("We only have "+price/pricePerBook+" books in stock");
			System.out.println("Price for "+price/pricePerBook+" is: "+ price);
		}
		System.out.println("Price for "+numOfBooks+" books is: "+price);
		
	}
}
