package designpatterns.Creational.PrototypeAndRegistry;

public class Client {

    public static void main(String [] args){
        NoteBook prototype1 = new NoteBook(30,16,100,"Gandhi picture", "India map");
        NoteBook n1 = prototype1.clone();
        n1.setFrontPage("Nehru picture");
        NoteBook n2 = prototype1.clone();
        n2.setFrontPage("Bhagat sing picture");

        RuledNoteBook prototype2 = new RuledNoteBook(30,16,100,"Gandhi pic","India map","Black",1);
        RuledNoteBook n3 = prototype2.clone();
        RuledNoteBook n4 = prototype2.clone();
        n4.setLineColor("Red");

        //Use Registry pattern
        NoteBookRegistry registry = new NoteBookRegistry();
        NoteBook n11 = registry.getNoteBookPrototype("grid");
        NoteBook n12 = n11.clone();
    }
}
