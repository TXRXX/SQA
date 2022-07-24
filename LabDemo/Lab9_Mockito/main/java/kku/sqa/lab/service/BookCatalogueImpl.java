package kku.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import kku.sqa.lab.api.BookCatalogueService;

public class BookCatalogueImpl {
	
	private BookCatalogueService bookcatalogueservice;

	public BookCatalogueImpl(BookCatalogueService bookcatalogueservice) {
		super();
		this.bookcatalogueservice = bookcatalogueservice;
	}
	
	//get only books relative to cooking in the catalogue of a certain month
	public List<String> getCookingBook(String month) {
		List<String> booklist = new ArrayList<String>();
		List<String> allbooklist = bookcatalogueservice.getBookCatalogue(month);
		
		for (String book: allbooklist) {
			if (book.contains("Cooking")) {
				booklist.add(book);
			}
		}
		return booklist;
	}
}
