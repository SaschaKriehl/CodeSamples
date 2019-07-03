package HelloWorld.src;

public class Meister {

    public void gibAnweisung() {

        System.out.println("Der Meister gibt Anweisungen:");

        Lehrling lehrling = new Lehrling();
        Schaufel schaufel = new Schaufel();
        Spaten spaten = new Spaten();

        lehrling.grabeLoch(schaufel);
        lehrling.grabeLoch(spaten);
    }

}
