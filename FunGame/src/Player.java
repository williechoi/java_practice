public class Player {
    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int count) {
        level.go(count);
    }

}
