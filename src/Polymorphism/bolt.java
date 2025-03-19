package Polymorphism;

public class bolt {
    private Double length;
    private String threadDenomination;
    private String headType;
    public bolt(Double length, String threadDenomination, String headType) {
        this.length = length;
        this.threadDenomination = threadDenomination;
        this.headType = headType;
    }
    public Double getLength() {
        return length;
    }
    public String getThreadDenomination() {
        return threadDenomination;
    }
    public String getHeadType() {
        return headType;
    }
    @Override
    public String toString() {
        String info = threadDenomination + " x " + length + ", " + headType;
        return info;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof bolt) {
            bolt b = (bolt) obj;
            return this.threadDenomination.equals(b.threadDenomination) && this.length.equals(b.length);
        }
        return false;
    }
    public void tightening(){
        System.out.println("This requires a screwdriver of some kind.");
    }

}
