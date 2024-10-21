import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.util.*;
import java.util.Date;
import java.time.*;
public class ZooKeeperTerminal{
    public static void main(String[]args){
        Random rand = new Random();
        File file  = new File("src/amoeba.txt");
        double temp = rand.nextDouble(-50.0,100.0);
        int AnimalNum;
        System.out.print("Which animal do you want to see?\n1.Koala\n2.Hippo\n3.Monkey\n4.Amoeba\n> ");
        Scanner input = new Scanner(System.in);
        AnimalNum = input.nextInt();
        switch(AnimalNum){
            case 1:
                System.out.println("Animal Type: Koala");
                Date date1 = new Date();
                System.out.printf("%1$tH:%1$tM:%1$tS %1$Tp GMT %1$tz  %n", date1);
                System.out.printf("Habitat Temperature: %.2f", temp);
                System.out.println(" degrees fahrenheit");
                file  = new File("src/koalaReal.txt");
                break;

            case 2:
                System.out.println("Animal Type: Hippo");
                Date date2 = new Date();
                System.out.printf("%1$tH:%1$tM:%1$tS %1$Tp GMT %1$tz  %n", date2);
                System.out.printf("Habitat Temperature: %.2f", temp);
                System.out.println(" degrees fahrenheit");
                file  = new File("src/Hippo.txt");
                break;
            case 3:
                System.out.println("Animal Type: Monkey");
                Date date3 = new Date();
                System.out.printf("%1$tH:%1$tM:%1$tS %1$Tp GMT %1$tz  %n", date3);
                System.out.printf("Habitat Temperature: %.2f", temp);
                System.out.println(" degrees fahrenheit");
                file  = new File("src/Monkey.txt");
                break;
            case 4:
                System.out.println("Animal Type: Amoeba");
                Date date4 = new Date();
                System.out.printf("%1$tH:%1$tM:%1$tS %1$Tp GMT %1$tz  %n", date4);
                System.out.printf("Habitat Temperature: %.2f", temp);
                System.out.println(" degrees fahrenheit");
                file  = new File("src/amoeba.txt");
                break;
            default:
                System.out.println("That is not a valid camera. Try again.");
        }
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No File");
        }
        System.out.println("---\n" +
                "You've reached the end of the program. To check another habitat, please restart the watcher.");
    }
}
