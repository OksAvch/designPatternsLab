package org.homework.player;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.homework.player.state.Active;
import org.homework.player.state.PlayState;
import org.homework.player.state.Ready;
import org.homework.player.state.RepeatOff;
import org.homework.player.state.RepeatOn;
import org.homework.player.state.RepeatState;

@Slf4j
public class PlayerImpl implements Player {

    private final Active active;
    private final Ready ready;
    private final RepeatOn repeatOn;
    private final RepeatOff repeatOff;
    private final List<String> tracks;
    private PlayState playState;
    private RepeatState repeatState;
    private int currentTrack;

    public PlayerImpl(List<String> tracks) {
        this.tracks = tracks;
        this.currentTrack = 0;
        this.repeatOn = new RepeatOn(this);
        this.repeatOff = new RepeatOff(this);
        this.repeatState = repeatOff;
        this.active = new Active(this);
        this.ready = new Ready(this);
        this.playState = ready;
    }

    @Override
    public void playOrPause() {
        playState.playOrPause();
    }

    @Override
    public void stop() {
        playState.stop();
    }

    @Override
    public void next() {
        repeatState.next();
    }

    @Override
    public void previous() {
        repeatState.previous();
    }

    @Override
    public void repeatOnOrOff() {
        repeatState.repeatOnOrOff();
    }

    public void setStateActive() {
        this.playState = active;
    }

    public void setStateReady() {
        this.playState = ready;
    }

    public void setRepeatOn() {
        this.repeatState = repeatOn;
    }

    public void setRepeatOff() {
        this.repeatState = repeatOff;
    }

    public String getCurrentTrack() {
        return tracks.get(currentTrack);
    }

    public void moveToNext() {
        currentTrack = (currentTrack + 1) % tracks.size();
    }

    public void moveToPrevious() {
        currentTrack = (tracks.size() + currentTrack - 1) % tracks.size();
    }

    public boolean isLastTrack() {
        return currentTrack == tracks.size() - 1;
    }

    public boolean isFirstTrack() {
        return currentTrack == 0;
    }
}
