/**
ريان حسن
 */
public class GameEntry {
    private int Score;
    private String name;

    public GameEntry(int id, String name) {
        this.Score = id;
        this.name = name;
    }

    public int getScore() {
        return Score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "id=" + Score +
                ", name='" + name + '\'' +
                '}';
    }

}
