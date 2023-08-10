package footballscores;

public interface ScoreSource {
    void registerObserver(ScoreObserver observer);
    void unregisterObserver(ScoreObserver observer);
    void notifyObservers();
    void setLiveScore(String liveScore);
}
