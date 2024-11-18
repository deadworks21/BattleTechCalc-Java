import java.util.ArrayList;
import java.util.List;

public class Lance {

    private ArrayList<Mech> mechs;

    public Lance() {
        mechs = new ArrayList<>();
    }

    public void addMech(Mech mech) {
        mechs.add(mech);
    }

    public void listMechs() {
        for (int i = 0; i <mechs.size(); i++){
            System.out.print((i + 1) + ". ");
            mechs.get(i).getInfo();
        }
    }

    public List<Mech> getMechs() {
        return mechs;
    }


}
