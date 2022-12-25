package Abstract;

import Interface.Position;

public abstract class Person {
    protected String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void rename(String str){
        this.setName(str);
    }
    @Override
    public String toString(){
        return this.getName() + ": ";
    }

    @Override
    public boolean equals(Object object){
        if (getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return (this == person);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
