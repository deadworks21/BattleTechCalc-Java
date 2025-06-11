public class Mech {
    private String name;
    private Integer tonnage;
    private Integer heat;

    public Mech(String name,int tonnage,int heat){
        this.name = name;
        this.tonnage = tonnage;
        this.heat = heat;
    }

    public String getName() {
        return name;
    }

    public int getTons(){
        return tonnage;
    }

    public int getHeat(){
        return heat;
    }

    public void getInfo(){
        System.out.println("Mech Name: " + name);
        System.out.println("Mech Tonnage: " + tonnage);
        System.out.println("Current Heat: " + heat);
    }

}
