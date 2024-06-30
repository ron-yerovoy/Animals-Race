package Olympics;
public class Medal {
    public static enum type{bronze, silver, gold};
    private type place = type.bronze;
    private String tournament = "Null";
    private int year = 2024;



    public Medal(type place, String tournament, int year) {
        this.place = place;
        this.tournament = tournament;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Medal{" +
                "place=" + place +
                ", tournament='" + tournament + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Medal))
        return false;
        Medal medal = (Medal)other;
        return place.equals(medal.place) && tournament.equals(medal.tournament) && year == medal.year;
    }

}



