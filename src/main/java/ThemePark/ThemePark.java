package ThemePark;

import Attractions.Attraction;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls){
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addVisitor(visitor);
    }
}
