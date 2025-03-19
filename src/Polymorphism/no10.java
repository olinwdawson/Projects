package Polymorphism;
public class no10 extends bolt {
    private boolean hasLoctite;
    public no10(Double length, String headType, boolean hasLoctite) {
        super(length, "10-32", headType);
        this.hasLoctite = hasLoctite;

        }
    @Override
    public void tightening(){
        if(hasLoctite){
            System.out.println("This requires a 5/32 hex driver, and it might be hard to remove.");
        } else {
            System.out.println("This requires a 5/32 hex driver, maybe use loctite to keep it in.");
        }

    }
}
