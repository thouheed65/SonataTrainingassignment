package sonata.Lambdaexample;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	 public List<Book>getBook(){
	
			 List<Book> books = new ArrayList<>();
			 books.add(new Book(101,"Core Java", 400));
			 books.add(new Book(102,"Hibernate", 300));
			 books.add(new Book(103,"Spring", 200));
			 books.add(new Book(104,"React JS", 300));
			 
		 return books;
			 
		 }
	 }
	



