import Class.Father;
import Class.Mother;
import Class.Bundle;
import Class.Bag;
import Class.Mumi_troll;
import Class.Pot;
import Class.Crab;
public class Main {
    public static void main(String[] args) {
        Father father = new Father();
        father.setName("Папа");
        Mother mother = new Mother();
        mother.setName("Мама");
        Bundle bundle = new Bundle();
        Mumi_troll mumi_troll = new Mumi_troll();
        mumi_troll.setName("Муми-тролль");
        Bag bag = new Bag();
        Pot pot = new Pot();
        Crab crab = new Crab();
        Story(father, mother, mumi_troll, bag, bundle, pot, crab);
    }
    private static void Story(Father father, Mother mother, Mumi_troll mumi_troll, Bag bag, Bundle bundle, Pot pot, Crab crab){
        System.out.println(bag.keep());
        System.out.println(mumi_troll + mumi_troll.Do() + ",");
        System.out.println(mumi_troll.get_hungry());
        System.out.println(mumi_troll.see() + ":" + bundle.get_who_make() + ",");
        for (int i = 0; i < 4; i++) {
            System.out.print(bundle.show_title() + ", ");
        }
        System.out.println("\n" + mother + mother.Do() + bundle.show_title() + ".");
        System.out.println(bundle.get_inside() + pot.get_content() + ".");
        System.out.println(father + father.Do() + " " + pot.get_age() + ".");
        System.out.println(crab.get_freshness(pot));
    }
}