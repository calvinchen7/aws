interface Readable {
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable
{
	public void readBook() { }
}

class Ebook extends Book {
	public void readBook() {}
	public void setBookMark() {}
}