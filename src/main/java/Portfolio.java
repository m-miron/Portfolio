import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Asset> assets;

    public Portfolio(String name, String owner, ArrayList<Asset> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public static void main(String[] args) {

        ArrayList<Asset> asset = new ArrayList<Asset>();
        asset.add(new Gold(17));
        asset.add(new Jewelry("Grandma's wedding ring", 700, 10));
        asset.add(new Vehicle("Luxury Car",200000, 2021, "Mercedes", "Maybach", "new"));
    }

}
