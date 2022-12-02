package Class;

import Abstract.Person;
import Interface.CanDo;

public class Father extends Person implements CanDo {
    @Override
    public String Do(){
        return "берег банку";
    }
}
