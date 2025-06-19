package DesignPatternsAndPrinciples.SingletonPatternExample.Code;

class Main{
    public static void main(String[] args){
        Logger logger1 = Logger.getInstance();
        logger1.log("I\'m First!");
        
        Logger logger2 = Logger.getInstance();
        logger2.log("I\'m Second!");

        if(logger1==logger2){
            System.out.println("I have Succeeded!");
        }
        else{
            System.out.println("I have failed!");
        }
    }
}