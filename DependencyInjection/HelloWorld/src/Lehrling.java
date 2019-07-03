package HelloWorld.src;

public class Lehrling {

    protected void grabeLoch(IGrabable grabeWerkzeug) {
        System.out.printf("Lehrling gräbt ein Loch. -> ");
        grabeWerkzeug.buddel();
    }
}