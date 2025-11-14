public class Book {
    private String title;
    private String author;
    private enum Status {
        CHECKED_OUT("This book is currently checked out."), IN_INVENTORY("This book is currently in our inventory.");
    };
    private Status currentStatus;
    private int numPages;

    public void Book(String title, String author, int numPages) {
        setTitle(title);
        setAuthor(author);
        setNumPages(numPages);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void checkOut(){
        this.currentStatus = Status.CHECKED_OUT;
    }

    public void returnBook(){
        this.currentStatus = Status.IN_INVENTORY;
    }

    public void setStatus(Status newStatus){
        this.Status = newStatus;
    }

    public Status isAvailable(){
        return this.currentStatus;
    }

    public int getNumPages(){
        return this.numPages;
    }

    public setNumPages()
}