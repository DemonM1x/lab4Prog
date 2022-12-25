package Exceptions;

public class GiftOfSpeech extends RuntimeException{
    public GiftOfSpeech(){
        super();
    }
    public GiftOfSpeech(String string){
        super(string);
    }
    public GiftOfSpeech(String string, Throwable cause){
        super(string, cause);
    }
    public GiftOfSpeech(Throwable cause){
        super(cause);
    }
}
