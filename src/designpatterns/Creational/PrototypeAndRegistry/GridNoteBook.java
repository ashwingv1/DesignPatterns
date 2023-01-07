package designpatterns.Creational.PrototypeAndRegistry;

public class GridNoteBook extends NoteBook{
    private int gridSize;
    private String lineColor;

    public GridNoteBook(int length, int width, int pageCount, String frontPage, String lastPage, int gridSize, String lineColor) {
        super(length, width, pageCount, frontPage, lastPage);
        this.gridSize = gridSize;
        this.lineColor = lineColor;
    }

    public GridNoteBook(GridNoteBook copy) {
        super(copy);
        this.gridSize = copy.gridSize;
        this.lineColor = copy.lineColor;
    }

    public int getGridSize() {
        return gridSize;
    }

    public void setGridSize(int gridSize) {
        this.gridSize = gridSize;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public GridNoteBook clone(){
        return new GridNoteBook(this);
    }
}
