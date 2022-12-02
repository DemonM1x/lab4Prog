package Class;
import Class.Crab;
import Interface.Thing;

public class Pot implements Thing {
     Conditions condition = Conditions.Spring;
    @Override
    public String get_content(){

        return "банка крабов";
    }
    @Override
    public String get_age(){
        if (random() >= 0.5) {
            condition = Conditions.Winter;
            return "с зимы";

        }
        else return "с весны";
    }
    public double random(){
        return Math.random();
    }
    public Conditions get_condition(){
        return condition;
    }
}
