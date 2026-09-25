public class Book extends TangibleAsset{
private String isbn;
public Book(String name,int price,String color,String ibsn){
super(name,price,color);
this.ibsn=ibsn;
}
public String getIsbn(){return this.isbn;}
}
