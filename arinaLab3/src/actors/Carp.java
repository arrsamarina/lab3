package actors;


public class Carp extends Person {

    public Carp(String name) {
        super(name);
    }


    @Override
    public void move(Location location) {
        System.out.println(getName() + " ушел " + location);
    }

    @Override
    public void bow(Person person) {
        System.out.println(getName() + " поклонился ");
    }


}
