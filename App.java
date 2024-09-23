package com.Hibernate.BookApp.BookApp;

import org.hibernate.SessionFactory;

import com.Hibernate.BookApp.DAO.Execution;
import com.Hibernate.BookApp.model.Book;
import com.Hibernate.BookApp.util.BookConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf=BookConfig.method1();
		System.out.println(sf);
		
		Book b1=new Book();
		b1.setBookName("You Only Live Once");
		b1.setBookId(101);
		b1.setBookCopies(1);
		b1.setBookPrice(500);
		
		Book b2=new Book();
		b2.setBookName("Still Hoping");
		b2.setBookId(1998);
		b2.setBookCopies(4);
		b2.setBookPrice(360);
		
		
		

		
		Execution e=new Execution();
		e.saveBook(b1);
		e.saveBook(b2);
		e.updateBook(b2);
//		e.deleteBook(1);
		
		
		
		
		
		
		
		
		
		Book b3=new Book();
		b3.setBookName("Let's Talk");
		b3.setBookId(102);
		b3.setBookCopies(1);
		b3.setBookPrice(360);
		
		e.saveBook(b3);
//		e.deleteBook(1);
		
		
//		String choice="getallBooks";
//		switch(choice) {
//		case "savetheBook":{
//								Execution e=new Execution();
//								e.saveBook(b2);
//		}
//		case "gettheBookbyid":{
//								Execution e=new Execution();
//								e.getBookbyInt(b1.getBookId());
//         }
//		case "updateBookBybookId":{
//								Execution e=new Execution();
//								e.updateBook(b1);
//		}
//		case "getallBooks":{
//								Execution e=new Execution();
//								e.getAllBooks();
//		}
//		case "deleteBookbyId":{
//								Execution e=new Execution();
//								e.deleteBook(b1.getBookId());
//		}
//		default:{
//			System.out.println("Plz enter valid input.");
//		}
//		
//		}
		
    }
}
