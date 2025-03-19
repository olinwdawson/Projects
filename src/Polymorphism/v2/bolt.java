package Polymorphism.v2;

public class bolt extends fastener{
    private int threadDenomination;
    private boolean hasLoctite;
    private String size;
    public bolt(String size, int threadDenomination, boolean hasLoctite) {
        super("mechanical", size, true );
        this.threadDenomination = threadDenomination;
        this.size = size;
    }
    public int getThreadDenomination() {
        return threadDenomination;
    }
    @Override
    public String toString(){
        String info = "This bolt is a mechanical fastener with size "+size+" and thread denomination "+threadDenomination;
        if(hasLoctite){
            info+=" and it has loctite";
        }
        return info;
    }
}
