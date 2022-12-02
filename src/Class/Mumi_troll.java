package Class;

import Abstract.Person;
import Interface.CanDo;
import Interface.CanSee;

public class Mumi_troll extends Person implements CanDo, CanSee {

    @Override
    public String Do(){
        return "сложил бутербродики рядом один к одному";
    }
    public String get_hungry(){
        return "есть не хочется";
    }
    @Override
    public String see(){
        return "Увидел надписи на свертках";
    }
}
