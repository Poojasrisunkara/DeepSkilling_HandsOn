package DesignPatternsAndPrinciples.BuilderPatternExample.Code;
public class Computer {
    public String RAM;
    public String CPU;
    public String Storage;
    public String Mouse;

    private Computer(Builder builder){
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.Storage = builder.Storage;
        this.Mouse = builder.Mouse;
    }

    public static class Builder{
        public String RAM;
        public String CPU;
        public String Storage;
        public String Mouse;

        public Builder SetCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        public Builder SetRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        public Builder SetStorage(String Storage){
            this.Storage = Storage;
            return this;
        }
        public Builder SetMouse(String Mouse){
            this.Mouse = Mouse;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public void display() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + Storage);
        System.out.println("Mouse: "+ ((Mouse==null)? "None": Mouse));
    }
}
