class MainApp1 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Please enter book id");
		int  id=sc.nextInt();
		System.out.println("Please enter book subject");
		String  subject=sc.next();
		System.out.println("Please enter book price");
		double  price=sc.nextDouble();
		System.out.println("Please enter book author");
		String  author=sc.next();
		
		Book  b1=new Book(id,author,price,subject);
		//b1.bookId=222;
		//b1.setBookId();
		//b1.setAuthorName(author);
		//b1.setPrice(price);
		//b1.setSubject(subject);
		BookService  bs=new BookService();
		bs.showBookDetails(b1);
	}
}

class BookService 
{
	void showBookDetails(Book  obj){
		System.out.println(obj.getBookId());
		System.out.println(obj.getAuthorName());
		System.out.println(obj.getPrice());
		System.out.println(obj.getSubject());
	}
}

class Book{
	private int bookId;
	private String authorName;
	private double price;
	private String subject;

    public Book(int bookId, String authorName, double price, String subject) {
		this.bookId = bookId;
		this.authorName = authorName;
		this.price = price;
		this.subject = subject;
	}
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
