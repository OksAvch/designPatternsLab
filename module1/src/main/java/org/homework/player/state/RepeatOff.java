package org.homework.player.state;

import lombok.extern.slf4j.Slf4j;
import org.homework.player.PlayerImpl;

@Slf4j
public class RepeatOff implements RepeatState {
    private static final String REPEAT_ON_MESSAGE_TEMPLATE = "Repeat on";
    private static final String ALREADY_ON_THE_FIRST_TRACK_MESSAGE_TEMPLATE =
            "Already on the first track: {}";
    private static final String ALREADY_ON_THE_LAST_TRACK_MESSAGE_TEMPLATE =
            "Already on the last track: {}";

    private final PlayerImpl context;

    public RepeatOff(PlayerImpl context) {
        this.context = context;
    }

    public void next() {
        if (context.isLastTrack()) {
            log.info(ALREADY_ON_THE_LAST_TRACK_MESSAGE_TEMPLATE, context.getCurrentTrack());
            return;
        }

        context.moveToNext();
        log.info(PLAYING_NEXT_TRACK_MESSAGE_TEMPLATE, context.getCurrentTrack());
    }

    public void previous() {
        if (context.isFirstTrack()) {
            log.info(ALREADY_ON_THE_FIRST_TRACK_MESSAGE_TEMPLATE, context.getCurrentTrack());
            return;
        }

        context.moveToPrevious();
        log.info(PLAYING_PREVIOUS_TRACK_MESSAGE_TEMPLATE, context.getCurrentTrack());
    }

    public void repeatOnOrOff() {
        context.setRepeatOn();
        log.info(REPEAT_ON_MESSAGE_TEMPLATE);
    }
}
