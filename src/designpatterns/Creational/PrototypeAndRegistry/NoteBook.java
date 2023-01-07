package designpatterns.Creational.PrototypeAndRegistry;

public class NoteBook {


    private int length, width, pageCount;
    private String frontPage, lastPage;

    public NoteBook(int length, int width, int pageCount, String frontPage, String lastPage) {
        this.length = length;
        this.width = width;
        this.pageCount = pageCount;
        this.frontPage = frontPage;
        this.lastPage = lastPage;
    }
    NoteBook(NoteBook copy){
        this.length=copy.length;
        this.width=copy.width;
        this.pageCount=copy.pageCount;
        this.frontPage=copy.frontPage;
        this.lastPage= copy.lastPage;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getFrontPage() {
        return frontPage;
    }

    public void setFrontPage(String frontPage) {
        this.frontPage = frontPage;
    }

    public String getLastPage() {
        return lastPage;
    }

    public void setLastPage(String lastPage) {
        this.lastPage = lastPage;
    }

    public NoteBook clone(){
        return new NoteBook(this);
    }
}
