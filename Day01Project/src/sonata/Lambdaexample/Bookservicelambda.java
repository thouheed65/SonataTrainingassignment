package sonata.Lambdaexample;
import java.util.Collections;
import java.util.List;



public class Bookservicelambda {
	public List<Book>getBookinSort(){
		List<Book> books = new BookDAO().getBook();
		Collections.sort(books,(o1,o2)-> o1.getName().compareTo(o2.getName()));
		return books;
	}
		public static void main(String[] args) {
			Bookservicelambda a1 = new Bookservicelambda();
			   System.out.println(new Bookservicelambda().getBookinSort());

				}

			}

