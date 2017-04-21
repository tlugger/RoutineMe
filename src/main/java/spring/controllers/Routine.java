package spring.controllers;

/**
 * Created by Nhi on 4/16/17.
 */
public class Routine {
    private RoutineHeader header;
    private TypeCollection typeCollection;

    Routine( RoutineHeader header, TypeCollection collection){
        this.header = header;
        this.typeCollection = collection;
    }

    public RoutineHeader getRoutineHeader(){ return this.header; }

    public TypeCollection getTypeCollection(){ return this.typeCollection; }

    public void setRoutineHeader(RoutineHeader header) { this.header = header;}

    public void setTypeCollection(TypeCollection collection) { this.typeCollection = collection; }
}
