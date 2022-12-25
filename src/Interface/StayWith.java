package Interface;

import Abstract.Person;

public interface StayWith {
    default String stayWith(Person person){
        return("остался наедине с "+ person.getName());
    }
}
