package animals;

public interface IReptile {
    /// לבדוק אם זה חוקי להגדיר מתשנה קבוע בצורה הזאת בממשק
    static final int MAX_SPEED = 5;

    public boolean speedUp(int speed);

}
