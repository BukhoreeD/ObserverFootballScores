package footballscores;

public class FootballFan implements ScoreObserver {
    @Override
    public void update(String liveScore) {
        System.out.println("live result: " + liveScore);
    }
}
