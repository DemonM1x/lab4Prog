package Class;

import Abstract.Person;
import Interface.CanDo;

public class Mother extends Person implements CanDo {
    Bundle bundle = new Bundle();
    @Override
    public String Do(){
            return "На последнем написала: ";
        }
}
