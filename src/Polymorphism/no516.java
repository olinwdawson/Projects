package Polymorphism;

public class no516 extends bolt{
    private boolean stripped;
    public no516(Double length, boolean stripped) {
        super(length, "5/16-18", "button head");
        this.stripped = stripped;
    }
    @Override
    public void tightening(){
        if(stripped){
            System.out.println("Uh oh! This bolt can't be tightened.");
        } else {
            System.out.println("This requires a 1/4 driver.");
        }
    }
}
