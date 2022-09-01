package sonata.Lambdaexample;
import static org.junit.Assert.*;

import org.junit.Test;


public class BookServiceTest {
	@Test
	
	public void testbook = () {
		BookService o1 = new BookService
				this.page(200);
		        this.page(300);
		        int size = o1.getSize();
		        System.out.println(size);
				 assertEquals(200,size);

		        
		
		
	}
	


}
