package Inheritance;

public class Book2 {
	protected int pages;
	   //----------------------------------------------------------------
	   //  Constructor: Sets up the book with the specified number of
	   //  pages.
	   //----------------------------------------------------------------
	   public Book2(int numPages)
	   {
	      pages = numPages;
	   }
	   //----------------------------------------------------------------
	   //  Pages mutator.
	   //----------------------------------------------------------------
	   public void setPages(int numPages)
	   {
	      pages = numPages;
	   }
	   //----------------------------------------------------------------
	   //  Pages accessor.
	   //----------------------------------------------------------------
	   public int getPages()
	   {
	      return pages;
	   }
	}		

