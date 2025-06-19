package DesignPatternsAndPrinciples.CommandPatternExample.Code;

public class LightOnCommand implements Command{
     private Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.lightON();
    }
}
