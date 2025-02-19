public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
//oon
    public Book(int id,String title, String author, int year){
        this.id = id;
        this.title = title;
        this.author=author;
        this.year = year;
    }
//get
    public int getId(){
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
//set
    public void setId(int id){
        this.id=id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Book{"+
                "id=" + id +", title= " + title +", author= "+ author + ", year= " + year+"}";
    }
}
