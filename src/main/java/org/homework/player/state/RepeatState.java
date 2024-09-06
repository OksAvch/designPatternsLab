package org.homework.player.state;

public interface RepeatState {
    String PLAYING_NEXT_TRACK_MESSAGE_TEMPLATE = "Playing next track: {}";
    String PLAYING_PREVIOUS_TRACK_MESSAGE_TEMPLATE = "Playing previous track: {}";

    void next();

    void previous();

    void repeatOnOrOff();
}
