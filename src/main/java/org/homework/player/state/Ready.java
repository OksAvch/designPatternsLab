package org.homework.player.state;

import lombok.extern.slf4j.Slf4j;
import org.homework.player.PlayerImpl;

@Slf4j
public class Ready implements PlayState {
    private static final String PLAY_MESSAGE_TEMPLATE = "Playing: {}";
    private static final String STOP_MESSAGE_TEMPLATE = "Already stopped";

    private final PlayerImpl context;

    public Ready(PlayerImpl context) {
        this.context = context;
    }

    @Override
    public void playOrPause() {
        log.info(PLAY_MESSAGE_TEMPLATE, context.getCurrentTrack());
        context.setStateActive();
    }

    @Override
    public void stop() {
        log.info(STOP_MESSAGE_TEMPLATE);
    }
}
