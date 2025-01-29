package Entity;

import java.io.Serializable;

public class playerStats implements Serializable {
    String username;

    int score;

    int time;

    public playerStats(String username, int score, int time) {
        this.username = username;
        this.score = score;
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PlayerName:"+username+"has achieved score:"+score+" in " +time + " seconds";
    }
}
