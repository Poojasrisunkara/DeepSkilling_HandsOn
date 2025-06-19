package DesignPatternsAndPrinciples.CommandPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command On = new LightOnCommand(light);
        Command Off = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
         remote.setCommand(On);
        remote.toggle();  

        remote.setCommand(Off);
        remote.toggle();
    }
}
