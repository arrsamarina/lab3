package actors;


import interfaces.Watchable;

public class Doorman extends Person implements Watchable {

    public Doorman(String name){
        super(name);

    }

    @Override
    public void move(Location location) {
        System.out.println(getName() + " сел " + location);
    }

    @Override
    public void bow(Person person) {
        System.out.println(getName() + " поклонился ");
    }

    @Override
    public void watch(Location location) {
        System.out.println(getName() + " смотрит " + location);
    }


}
