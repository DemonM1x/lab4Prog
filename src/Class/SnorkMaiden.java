package Class;

import Abstract.Person;
import Exceptions.GiftOfSpeech;
import Exceptions.ShakeHard;
import Interface.CanDo;
import Interface.Shake;


public class SnorkMaiden extends Person implements CanDo, Shake {

    @Override
    public String Do(){
        return "села и огляделась вокруг";
    }
    public String cry(){
        return "тихо плакала, уткнувшись в перину";
    }
    public String  shake(Person person){

        try {
            return shakeHard(person);
        }
        catch (ShakeHard e){
            person.rename("Поколеченный " + person.getName());
            return "Затрясла " + person.getName() + " до полусмерти";
        }
    }
    public String shakeHard(Person person) throws ShakeHard {
        Double chance = Math.random();
        if (chance < 0.5) throw new ShakeHard("Затрясла" + person.getName() + "до полусмерти");
        else return "осторожно потрясла "+person.getName();
    }
    private interface Speech{
        String getSpeechSkills();
    }
    public Speech getGiftOfSpeech(){
        class PersonalSpeechSkills implements Speech{
            @Override
            public String getSpeechSkills(){
                double chance = Math.random();
                if (chance < 0.2) {
                    throw new GiftOfSpeech("Фрекен Снорк утратила дар речи навсегда");
                }
                else if (chance <= 0.6){
                    return "утратила дар речи на день";
                }
                else return "утратила дар речи на мгновение";
            }
            @Override
            public String toString(){
                return this.getSpeechSkills();
            }
        }
        return new PersonalSpeechSkills();
    }

    
}
