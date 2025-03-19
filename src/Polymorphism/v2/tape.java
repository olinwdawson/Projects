package Polymorphism.v2;

public class tape extends fastener{
    private boolean residue;
    public tape(String name) {
        super("adhesive", name, false );
    }
    @Override
    public String toString(){
        String info = "This is an adhesive fastener, called "+super.getName();
        if(residue){
            info+=", and it leaves residue";
        }
        return info;
    }
}
