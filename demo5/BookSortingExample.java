package demo5;
import java.util.*;

class  Book implements Comparable<Book>{
	private String title;
	private String author;
	private String publisher;
	private Date publicationDate;
	
	public Book(String title, String author, String publisher, Date publicationDate) {
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.publicationDate=publicationDate;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	@Override
	public int compareTo(Book other) {
		return this.publicationDate.compareTo(other.getPublicationDate());
		
	}
	@Override
	public String toString() {
		return title + " by " + author + "published by " + publisher + " on " + publicationDate;
	}
	
	}


import LibraryManagement.Book;
public class BookSortingExample {
	public static void main(String[] args) {
		//creating a HAshMAp to store books with publications date as key
		Map<Date, Book> booksMap=new HashMap<>();
		
		//adding books to the HashMap
		booksMap.put(new Date(121,0,1),new Book("Book1", "Author1","Publisher1", new Date(121,0,1)));
		booksMap.put(new Date(121,0,1),new Book("Book1", "Author1","Publisher1", new Date(121,0,1)));
		booksMap.put(new Date(121,0,1),new Book("Book1", "Author1","Publisher1", new Date(121,0,1)));
		Map<Date, Book> sortedBookMap=new TreeMap<>(booksMap);
		
		for(Book book : sortedBooksMap.values()) {
			System.out.println(book);
		}
	}
}
