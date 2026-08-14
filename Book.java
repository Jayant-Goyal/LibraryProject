public class Book {
    private String title;
    private String author;
    private String isbn;
    private Boolean isCheckedOut;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = false;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public Boolean isCheckedOut(){
        return isCheckedOut;
    }

    public void setCheckedOut(Boolean isCheckedOut){
        this.isCheckedOut = isCheckedOut;
    }

    @Override
    public String toString(){
        return String.format("'%s' by %s (ISBN:%s) is %s.",title,author,isbn, isCheckedOut ? "checked out." : "available");
    }

}