package org.homework.player.state;

import lombok.extern.slf4j.Slf4j;
import org.homework.player.PlayerImpl;

@Slf4j
public class Active implements PlayState {
    private static final String PAUSE_MESSAGE_TEMPLATE = "Paused on: {}";
    private static final String STOP_MESSAGE_TEMPLATE = "Stopping: {}";

    private final PlayerImpl context;

    public Active(PlayerImpl context) {
        this.context = context;
    }

    @Override
    public void playOrPause() {
        log.info(PAUSE_MESSAGE_TEMPLATE, context.getCurrentTrack());
        context.setStateReady();
    }

    @Override
    public void stop() {
        log.info(STOP_MESSAGE_TEMPLATE, context.getCurrentTrack());
        context.setStateReady();
    }
}
