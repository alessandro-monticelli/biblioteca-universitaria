package it.univaq.biblioteca;
public class Libro{
    private String author;
    private String title;
    private int publishedDate;
    private String isbn;
    private String editor;
    private String category; 
    private String language;
    private int pages;
    private float price;
    private String _abstract;// private String bookAbstract (sinossi?)


    /**
     * 
     * @param author
     * @param title
     * @param publishedDate
     * @param isbn
     * @param editor
     * @param category
     * @param language
     * @param pages
     * @param price
     * @param _abstract
     */


    public Libro(String author, String title, int publishedDate, String isbn, String editor, String category,
            String language, int pages, float price, String _abstract) {
        super();
        this.author = author;
        this.title = title;
        this.publishedDate = publishedDate;
        this.isbn = isbn;
        this.editor = editor;
        this.category = category;
        this.language = language;
        this.pages = pages;
        this.price = price;
        this._abstract = _abstract;
        }


    public Libro(String author, String title, int publishedDate) {
        this.author = author;
        this.title = title;
        this.publishedDate = publishedDate;
        //existing info
    }
    //metodi get e set di tutte le istanze
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    //... impostare la java doc do ognuno

    // override di toString
    public String toString() {
        return "Libro{" +
                "_abstract='" + _abstract + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                ", language='" + language + '\'' +
                ", category='" + category + '\'' +
                ", editor='" + editor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishedDate=" + publishedDate +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}






    