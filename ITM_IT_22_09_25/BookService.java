class BookService 
{
	void showBookDetails(Book  obj){
		System.out.println(obj.getBookId());
		System.out.println(obj.getAuthorName());
		System.out.println(obj.getPrice());
		System.out.println(obj.getSubject());
	}
}
