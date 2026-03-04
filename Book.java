class Book{
	static int totalBooks;

	String title;
	String author;
	String isbn;

	boolean isBorrowed;

	static {
		totalBooks = 0;  // <----------
	}

	Book(String isbn, String title, String author) { // paqrametrized constructor
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		totalBooks++;
	}

	Book(String isbn){ // another parameterized constructor typr 2
		this(isbn, "Unknown" ,  "Unknown");
	}

	static int totalBooks(){
		return totalBooks;
	}

	void borrowBooks(){
		if (isBorrowed){
			System.out.println("Bok is already borrowed");
		}else{
			this.isBorrowed = true;
			System.out.println("Enjoy the book");
		}
	}


	void returnBook(){
		if(isBorrowed) {
			this.isBorrowed = false;
			System.out.println("Hope you enjoyed the book pls share your rewiew");
		}else{
			System.out.println("This  book is already in the library");
		}
	}


	public static void main(String[] args){
		Book mb = new Book( "1",  "Java book", "Nageswar Rao");
		Book bb = new Book("2");
		System.out.println(Book.totalBooks());
		mb.borrowBooks();
		bb.returnBook();
		bb.returnBook();

	}

}
