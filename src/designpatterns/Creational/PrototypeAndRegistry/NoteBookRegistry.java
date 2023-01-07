package designpatterns.Creational.PrototypeAndRegistry;

import java.util.HashMap;

public class NoteBookRegistry {
    private HashMap<String,NoteBook> registry = new HashMap<>();

    NoteBookRegistry(){
        RuledNoteBook prototype1 = new RuledNoteBook(30,16,100,"Gandhi pic","India map","Black",1);
        GridNoteBook prototype2 = new GridNoteBook(30,16,100,"Gandhi pic","India map",1,"Blue");
        registry.put("ruled",prototype1);
        registry.put("grid",prototype2);
    }

    public NoteBook getNoteBookPrototype(String type){
        if(registry.containsKey(type))
            return registry.get(type);
        else return null;
    }

}
