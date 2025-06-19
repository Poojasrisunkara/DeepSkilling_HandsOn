package DesignPatternsAndPrinciples.CommandPatternExample.Code;

public class RemoteControl {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void toggle(){
        command.execute();
    }
}
