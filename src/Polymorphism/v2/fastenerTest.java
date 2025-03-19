package Polymorphism.v2;
import java.util.ArrayList;
public class fastenerTest {
    public static void main(String[] args) {
        fastener bolt1 = new bolt("5/16",18,true);
        fastener tape1 = new tape("duct tape");
        fastener bolt2 = new bolt("number 10", 32, false);
        fastener boilerPlate = new fastener("mechanical","CA-Glue", true);
        ArrayList<fastener> fastenerList = new ArrayList<>();
        fastenerList.add(bolt1);
        fastenerList.add(tape1);
        fastenerList.add(bolt2);
        fastenerList.add(boilerPlate);
        for(fastener fastener : fastenerList){
            System.out.println(fastener.toString());
        }
    }
}
