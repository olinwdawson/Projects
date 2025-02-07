import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Habitat {
    Scanner input = new Scanner(System.in);
    private String animalType;
    Random rand = new Random();
    private int camNum;
    private String filepath;
    private final double temp = rand.nextDouble(-50.0,100.0);
    public String getType(){
        return animalType;
    }
    public int getCamNum(){
        return camNum;
    }
    public double getTemp() {
        return temp;
    }
    public String getFilepath(){
        return filepath;
    }
    public void setAnimalType(String animal){
        animalType = animal;
    }
    public void setCamNum(int cam){
        camNum = cam;
    }
    public void setFilepath(String filepath1){
        filepath=filepath1;
    }
    public void createHabitat(int size){
        setCamNum(size);
        System.out.println("Animal Type: ");
        setAnimalType(input.nextLine());
        System.out.println("Filepath: ");
        setFilepath(input.nextLine());
        System.out.println("Done");
    }
    public String display(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("k:mm a, z");
        String time;
        String zookeeperMessage = String.format("Animal type: %s\nCurrent time: %S PM\nHabitat temperature: %.2f", animalType, time, temp);
        return (zookeeperMessage);
    }
}
