package Attractions;

import ThemePark.Visitor;
import java.util.ArrayList;

public abstract class Attraction {

    private String name;
    private ArrayList<Visitor> visitors;

    public Attraction(String name){
        this.name = name;
        this.visitors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    public ArrayList<Visitor> getVisitors(){
        return visitors;
    };
}
