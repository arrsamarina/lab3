package actors;


import enums.EmotionalCondition;
import interfaces.Moveable;

public abstract class Person implements Moveable {

    private String name;
    private EmotionalCondition emotionalCondition;
    private Location location;
    public Location getLocation() {
        return location;
    }

    public Person setLocation(Location location) {
        this.location = location;
        return this;
    }



    public Person (String name, EmotionalCondition emotionalCondition) {
        this(name);
        this.emotionalCondition = emotionalCondition;
    }
    public Person (String name) {
        this.name =name;
    }
    public Person() {
    }

    public EmotionalCondition getEmotionalCondition() {
        return emotionalCondition;
    }

    public Person setEmotionalCondition(EmotionalCondition emotionalCondition) {
        this.emotionalCondition = emotionalCondition;
        return this;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public void emotion(EmotionalCondition emotionalCondition) {
        this.emotionalCondition = emotionalCondition;
        if (emotionalCondition != EmotionalCondition.CALM)
        System.out.println("У героя " + getName() + " появляется эмоция: " + emotionalCondition);
        else
            System.out.println(getName()+ " в спокойном состоянии");
    }
    public void bow(Person person){
        System.out.println(getName() + " поклонился " + person.getName());
    }

    @Override
    public String toString(){
        return "Создано существо: " + getName();
    }

    @Override
    public int hashCode(){
        return 10 * name.hashCode();
    }






}



