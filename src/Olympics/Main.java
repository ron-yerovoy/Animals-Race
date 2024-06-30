package Olympics;

public class Main {
    public static void main(String[] args) {
        Medal medal1 = new Medal(Medal.type.bronze, "Olympics", 2024);
        Medal medal2 = new Medal(Medal.type.bronze, "Olympics", 2024);
        Medal medal3 = new Medal(Medal.type.gold, "euro", 2020);
        
        System.out.println(medal1.toString());
        System.out.println(medal2.toString());
        System.out.println(medal3.toString());
        
    }

}
