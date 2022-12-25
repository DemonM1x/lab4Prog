package Class;

import Interface.Storage;

public class Bundle implements Storage {
    private Titles title = Titles.Cheese;

    public String getInside(){
        return "В свертке оказалась ";
    }

    public String getWhoMake(){
        return "их сделала мама";
    }
    public String keep(){
        if (equals(1)) {
            title = Titles.Only_butter;
            return "\"С сыром\"";
        }
        else if (equals(2)) {

            title = Titles.Expensive_sausage;
            return " \"Только с маслом\"";
        }
        else if (equals(3)) {
            title = Titles.Good_morning;
            return " \"С дорогой колбасой\"";
        }
        else if (equals(4)){
            title = Titles.From_Father;
            return " \"С добрым утром!\"";
        }
        else return "\"Это от папы\"";
    }


    @Override
    public boolean equals(Object obj) {
        Integer i = (Integer) obj;
        return this.hashCode() == i;
    }

    @Override
    public int hashCode() {
        if (title == Titles.Cheese) return 1;
        else if (title == Titles.Only_butter) return 2;
        else if (title == Titles.Expensive_sausage) return 3;
        else if (title == Titles.Good_morning) return 4;
        else return 0;
    }
}
