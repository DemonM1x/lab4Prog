package Class;
import Interface.Storage;

public class Pot implements Storage {
     Conditions condition = Conditions.Spring;
     Food food = Food.Crab;
    public String keep(){
        double rand = random();
        if (rand < (double)1/3) {
            food = Food.Crab;
            return "банка крабов";
        }
        else if (rand >= (double) 1/3 && rand < (double) 2/3){
            food = Food.Octopus;
            return "банка осьминогов";
        }
        else {
            food = Food.Shrimp;
            return "банка креветок";
        }
    }

    public String getAge(){
        if (random() >= 0.5) {
                condition = Conditions.Winter;
                return "с зимы";

        }
        else return "с весны";
    }
    public double random(){
        return Math.random();
    }
    public String getCondition(){
        if (food == Food.Crab)
            if (condition == Conditions.Spring) return "Краб свежий";
            else return "Краб протух";
        else if (food == Food.Octopus)
            if (condition == Conditions.Spring) return "Осьминог свежий";
            else return "Осьминог протух";
        else if (condition == Conditions.Spring)return "Креветка свежая";
            else return "Креветка протухла";
    }
}
