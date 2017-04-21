package spring.controllers;

/**
 * Created by Nhi on 4/16/17.
 */
public class Routine {
    private RoutineHeader header;
    private TypeCollection typeCollection;
    private RoutineContent content;

    Routine(){
        this.header = new RoutineHeader();
        this.typeCollection = new TypeCollection();
        this.content = new RoutineContent();

    }

    Routine( RoutineHeader header, TypeCollection collection, RoutineContent content){
        this.header = header;
        this.typeCollection = collection;
        this.content = content;
    }

    public RoutineHeader getRoutineHeader(){ return this.header; }

    public TypeCollection getTypeCollection(){ return this.typeCollection; }

    public RoutineContent getRoutineConetent(){ return this.content; }

    public void setRoutineHeader(RoutineHeader header) { this.header = header;}

    public void setTypeCollection(TypeCollection collection) { this.typeCollection = collection; }

    public void setRoutineContent(RoutineContent content) { this.content = content; }
}
