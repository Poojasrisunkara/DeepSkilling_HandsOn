package DesignPatternsAndPrinciples.BuilderPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        Computer spaceStationPC = new Computer.Builder()
                .SetCPU("Platin")
                .SetRAM("Nepto 2.8")
                .SetStorage(" 300TB CrystoXL")
                .SetMouse("External Mouse Connected")
                .build();

        Computer retroPC = new Computer.Builder()
                .SetCPU("Saturn 1.9")
                .SetRAM("VenIIs 2.8")
                .SetStorage(" 400TB CrystoXXL")
                .build(); 

        System.out.println("Space Station PC:");
        spaceStationPC.display();
        System.out.println("\nRetro PC:");
        retroPC.display();
    }
}
