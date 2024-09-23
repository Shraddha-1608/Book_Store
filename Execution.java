package com.Hibernate.BookApp.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate.BookApp.model.Book;
import com.Hibernate.BookApp.util.BookConfig;

public class Execution {
	
	
	

	

	public void saveBook(Book book) {
		Transaction tran=null;
		try(Session ses=BookConfig.method1().openSession()){
			tran=ses.beginTransaction();
			ses.save(book);
			System.out.println(ses.save(book));
			tran.commit();
		}
		catch(Exception e) {
			if(tran!=null) {
				tran.rollback();
			}
			
		}
	}
	
	public List<Book> getAllBooks(){
		Transaction tran=null;
		List<Book> books=null;
		try(Session ses=BookConfig.method1().openSession()){
			tran=ses.beginTransaction();
			books=ses.createQuery("from Book").list();
			for(Book b:books) {
				///add books there in database
			}
			tran.commit();

		}
		catch(Exception e) {
			if(tran!=null) {
				tran.rollback();
			}
		}
		return books;
	}
	
	public Book getBookbyInt(int bookId) {
		Transaction tran=null;
		Book book=null;
		try(Session ses=BookConfig.method1().openSession()){
			tran=ses.beginTransaction();
			book=ses.get(Book.class, bookId);
			tran.commit();
		}
		catch(Exception e) {
			if(tran!=null) {
				tran.rollback();
			}
		}
		return book;
	}
	public void updateBook(Book book) {
		Transaction tran=null;
		try(Session ses=BookConfig.method1().openSession()){
			tran=ses.beginTransaction();
			ses.saveOrUpdate(book);
			tran.commit();
		}
		catch(Exception e) {
			if(tran!=null) {
				tran.rollback();
			}
		}
	}
	public void deleteBook(int bookId) {
		Transaction tran=null;
		try(Session ses=BookConfig.method1().openSession()){
			Book book=null;
			tran=ses.beginTransaction();
			
			book=ses.get(Book.class,bookId);
			ses.delete(book);
			tran.commit();
			
			}
		catch(Exception e) {
			if(tran!=null) {
				tran.rollback();
			}
		}
	}
		


	}

  

