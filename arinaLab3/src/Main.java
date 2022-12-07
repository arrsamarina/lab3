import actors.*;
import enums.EmotionalCondition;

public class Main {

    public static void main(String[] args) {

        Alice aliceWithBuilder = Alice.newBuilder().setName("Алиса через билдер").setEmotionalCondition(EmotionalCondition.CALM).build(); //создание объекта через билдер
        System.out.println(aliceWithBuilder.getName());
        Alice alice = new Alice("Алиса");
        System.out.println(alice);
        Carp carp = new Carp("Карась");
        System.out.println(carp);
        Doorman doorman = new Doorman("Швейцар");
        System.out.println(doorman);
        doorman.bow(carp);
        carp.bow(doorman);
        alice.emotion(EmotionalCondition.LAUGH);
        alice.move(new Location(" лес"));
        alice.emotion(EmotionalCondition.FINISHEDLAUGHING);
        alice.comeback();
        alice.bow(doorman);
        alice.watch(new Location("куст"));
        carp.move(new Location(" непонятно куда"));
        doorman.move(new Location(" на земле"));
        doorman.watch(new Location("небо"));
        doorman.emotion(EmotionalCondition.EMPTYHEAD);
        alice.nearHouse();
        alice.knock();
        alice.emotion(EmotionalCondition.SHYLY);

    }
}
