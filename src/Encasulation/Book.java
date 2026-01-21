package Encasulation;
class Read{
    public  String name;
    private int page;
    private int chapter;
    private int time;
    private int price;
    Read(String s,int p,int c,int t,int pr){
        this.name=s;
        this.page=p;
        this.chapter=c;
        this.time=t;
        this.price=pr;
    }
    public int getPage(){
        return page;
    }
    public void setpage(){
        this.page=page;
    }

    public int getChapter() {
        return chapter;
    }
    public void setChapter(){
        this.chapter=chapter;
    }

    public int getTime() {
        return time;
    }
    public void setTime(){
        this.time=time;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
    public void display(){
        System.out.println("name of book  "+name);
        System.out.println("pages of book "+page);
        System.out.println("chapter of book "+chapter);
        System.out.println("time read to book "+time);
        System.out.println("price of the book "+price);
    }
}
public class Book {
    public static void main(String[] args) {
        Read r=new Read("money",200,10,4,350);
        r.display();

    }
}
