import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.util.*;
import java.util.Date;
import java.time.*;
public class ZooKeeperTerminal{
    public static void main(String[]args){
        Random rand = new Random();


        ArrayList<Habitat> Zoo = new ArrayList<>(); //Instantiation
        Habitat koala = new Habitat();

        //Creating animals and adding to Zoo
        Zoo.add(koala);
        koala.setAnimalType("Koala");
        koala.setCamNum(1);

        Habitat hippo = new Habitat();
        Zoo.add(hippo);
        hippo.setAnimalType("Hippo");
        hippo.setCamNum(2);

        Habitat monkey = new Habitat();
        Zoo.add(monkey);
        monkey.setAnimalType("Monkey");
        monkey.setCamNum(3);

        Habitat amoeba = new Habitat();
        Zoo.add(amoeba);
        amoeba.setAnimalType("Amoeba");
        amoeba.setCamNum(4);

        while (true) { //Run Loop
            System.out.println("Which animal do you want to see?");
            for (Habitat k : Zoo) {
                System.out.println(k.getCamNum() + " : " + k.getType());
            }
            Scanner input = new Scanner(System.in);
            int caminput = input.nextInt();

            System.out.println(Zoo.get(caminput-1));
        }
    }
}
