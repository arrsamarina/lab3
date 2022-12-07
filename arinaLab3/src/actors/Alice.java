package actors;


import enums.EmotionalCondition;
import interfaces.Watchable;

public class Alice extends Person implements Watchable {


    public Alice(String name) {
        super(name);

    }

    public static Builder newBuilder() {
        return new Alice("АААЛЛЛИИИСССААА") {

        }.new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Alice.Builder setName(String name) {
            Alice.this.setName(name);
            return this;
        }

        public Alice.Builder setEmotionalCondition(EmotionalCondition emotionalCondition) {
            Alice.this.setEmotionalCondition(emotionalCondition);
            return this;
        }

        public Alice build() {
            return Alice.this;
        }

    }


    public void comeback() {
        System.out.println(getName() + " вернулась " + new Location("куст"));
    }

    public void nearHouse() {
        System.out.println(getName() + " подошла " + new Location("дом"));
    }

    public void knock() {
        System.out.println(getName() + " постучалась " + new Location("дом"));
    }

    @Override
    public void move(Location location) {
        System.out.println(getName() + " убежала " + location);

    }

    @Override
    public void bow(Person person) {
        System.out.println(getName() + " наклонилась и выглянула из-за угла и посмотрела на " + person.getName());
    }

    @Override
    public void watch(Location location) {
        System.out.println(getName() + " подглядывает" + location);
    }
}
