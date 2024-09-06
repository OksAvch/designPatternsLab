package org.homework.player.state;

import lombok.extern.slf4j.Slf4j;
import org.homework.player.PlayerImpl;

@Slf4j
public class RepeatOn implements RepeatState {
    private static final String REPEAT_OFF_MESSAGE_TEMPLATE = "Repeat off";
    private static final String REPLAYING_FIRST_TRACK_MESSAGE_TEMPLATE =
            "Replaying first track: {}";

    private final PlayerImpl context;

    public RepeatOn(PlayerImpl context) {
        this.context = context;
    }

    public void next() {
        if (context.isLastTrack()) {
            context.moveToNext();
            log.info(REPLAYING_FIRST_TRACK_MESSAGE_TEMPLATE, context.getCurrentTrack());
            return;
        }

        context.moveToNext();
        log.info(PLAYING_NEXT_TRACK_MESSAGE_TEMPLATE, context.getCurrentTrack());
    }

    public void previous() {
        context.moveToPrevious();
        log.info(PLAYING_PREVIOUS_TRACK_MESSAGE_TEMPLATE, context.getCurrentTrack());
    }

    public void repeatOnOrOff() {
        context.setRepeatOff();
        log.info(REPEAT_OFF_MESSAGE_TEMPLATE);
    }
}
