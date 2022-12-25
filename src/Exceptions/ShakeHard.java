package Exceptions;

public class ShakeHard extends Exception{
    public ShakeHard(){
        super();
    }
    public ShakeHard(String string){
        super(string);
    }
    public ShakeHard(String string, Throwable cause){
        super(string,cause);
    }
}
