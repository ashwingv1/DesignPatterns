package designpatterns.Creational.PrototypeAndRegistry;

public class RuledNoteBook extends NoteBook{

    private String lineColor;
    private int lineGap;

    public RuledNoteBook(int length, int width, int pageCount, String frontPage, String lastPage, String lineColor, int lineGap) {
        super(length, width, pageCount, frontPage, lastPage);
        this.lineColor = lineColor;
        this.lineGap = lineGap;
    }

    public RuledNoteBook(RuledNoteBook copy) {
        super(copy);
        this.lineColor = copy.lineColor;
        this.lineGap = copy.lineGap;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public int getLineGap() {
        return lineGap;
    }

    public void setLineGap(int lineGap) {
        this.lineGap = lineGap;
    }

    public RuledNoteBook clone(){
        return new RuledNoteBook(this);
    }
}
