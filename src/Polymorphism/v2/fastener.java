package Polymorphism.v2;

public class fastener {
    private String fasteningType;
    private String name;
    private boolean permanent;
    public fastener(String fasteningType, String name, boolean permanent){
        this.fasteningType = fasteningType;
        this.name = name;
    }
    public String getFasteningType(){
        return fasteningType;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        String info = "This is a(n) "+fasteningType+" fastener, called "+name;
        return info;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof fastener) {
            fastener other = (fastener) o;
            return this.name.equals(other.name) && this.fasteningType.equals(other.fasteningType) && this.permanent == other.permanent;
        }
        return false;
    }

}
