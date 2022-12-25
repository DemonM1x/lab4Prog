package Class;

import Abstract.Person;
import Interface.CanDo;
import Interface.CanSee;
import Interface.Position;
import Interface.StayWith;

public class MumiTroll extends Person implements CanDo, CanSee, StayWith {

    @Override
    public String Do(){
        return "сложил бутербродики рядом один к одному";
    }
    public String getHungry(){
        return "не голоден";
    }
    @Override
    public String see(){
        return "Увидел надписи на свертках";
    }
    public String takeOff(Basket basket){
        return "машинально снял " + basket.keep();
    }
    TypeOfPosition typeOfPosition = new TypeOfPosition();
    public String switchPosition(){
        return typeOfPosition.transform();
    }
    public String gettingPosition(){
        return typeOfPosition.getPosition();
    }

    private class TypeOfPosition implements Position {
        enum Stats{NO, YES}

        static Stats stats = Stats.NO;
        public String getPosition(){
            if (stats == Stats.NO) return "долго сидел с Фрекен Снорк";
            else return "встал с постели";
        }
        public String transform(){
            stats = Stats.YES;
            return getPosition();
        }
    }
}
