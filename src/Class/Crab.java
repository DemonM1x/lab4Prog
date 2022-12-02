package Class;
import Class.Pot;
public class Crab {

    public String get_name(){
        return "крабы";
    }
    public String get_freshness(Pot pot){

       if (pot.get_condition() == Conditions.Winter) return "Краб протух";
       else return "Краб свежий";
    }
}
