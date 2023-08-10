package footballscores;

import java.util.ArrayList;
import java.util.List;

public class ScoreSubject implements ScoreSource {
    private List<ScoreObserver> observers = new ArrayList<>();
    private String liveScore;

    @Override
    public void registerObserver(ScoreObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(ScoreObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ScoreObserver observer : observers) {
            observer.update(liveScore);
        }
    }

    @Override
    public void setLiveScore(String liveScore) {
        this.liveScore = liveScore;
        notifyObservers();
    }
}
