import Class.Father;
import Class.Mother;
import Class.Bundle;
import Class.Basket;
import Class.MumiTroll;
import Class.Pot;
import Class.SnorkMaiden;
import Class.Outside;
public class Main {
    public static void main(String[] args) {
        SnorkMaiden snorkMaiden = new SnorkMaiden();
        snorkMaiden.setName("Фрекен Снорк");
        Father father = new Father();
        father.setName("Папа");
        Mother mother = new Mother();
        mother.setName("Мама");
        Bundle bundle = new Bundle();
        MumiTroll mumiTroll = new MumiTroll();
        mumiTroll.setName("Муми-тролль");
        Basket bag = new Basket();
        Pot pot = new Pot();
        Outside outside = new Outside();
        story(father, mother, mumiTroll, bag, bundle, pot, snorkMaiden, outside);
    }
    private static void story(Father father, Mother mother, MumiTroll mumiTroll, Basket bag,
                              Bundle bundle, Pot pot,SnorkMaiden snorkMaiden, Outside outside){
        System.out.println(snorkMaiden + snorkMaiden.Do());
        System.out.println(outside.toString());
        System.out.println(new Outside.Home());
        System.out.println(mumiTroll + mumiTroll.stayWith(snorkMaiden));
        System.out.println(snorkMaiden +" " + snorkMaiden.getGiftOfSpeech());
        System.out.println(snorkMaiden.shake(mumiTroll));
        System.out.println(outside.getWeather());
        System.out.println(mumiTroll + mumiTroll.gettingPosition());
        System.out.println(snorkMaiden + snorkMaiden.cry());
        System.out.println(mumiTroll + mumiTroll.switchPosition());
        System.out.println(mumiTroll.takeOff(bag));
        System.out.println(mumiTroll.Do() + ",");
        System.out.println(mumiTroll.getHungry());
        System.out.println(mumiTroll.see() + ":" + bundle.getWhoMake() + ",");
        for (int i = 0; i < 4; i++) {
            System.out.print(bundle.keep() + ", ");
        }
        System.out.println("\n" + mother + mother.Do() + bundle.keep() + ".");
        System.out.println(bundle.getInside() + pot.keep() + ".");
        System.out.println(father + father.Do() + " " + pot.getAge() + ".");
        System.out.println(pot.getCondition() + ".");
    }
}