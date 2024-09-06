package org.homework.player;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;

@ExtendWith(MockitoExtension.class)
class PlayerImplTest {
    private static final List<String> TRACKS = List.of("Track 1", "Track 2", "Track 3");
    private static final String PLAYING_PREVIOUS_TRACK_MESSAGE_TEMPLATE =
            "Playing previous track: {}";
    private static final String REPEAT_ON_MESSAGE_TEMPLATE = "Repeat on";
    private static final String REPEAT_OFF_MESSAGE_TEMPLATE = "Repeat off";
    private static final String ALREADY_ON_THE_FIRST_TRACK_MESSAGE_TEMPLATE =
            "Already on the first track: {}";
    private static final String ALREADY_ON_THE_LAST_TRACK_MESSAGE_TEMPLATE =
            "Already on the last track: {}";
    private static final String PLAYING_NEXT_TRACK_MESSAGE_TEMPLATE = "Playing next track: {}";
    private static final String REPLAYING_FIRST_TRACK_MESSAGE_TEMPLATE =
            "Replaying first track: {}";
    private static final String PLAYING_MESSAGE_TEMPLATE = "Playing: {}";
    private static final String STOPPING_MESSAGE_TEMPLATE = "Stopping: {}";
    private static final String ALREADY_STOPPED_MESSAGE_TEMPLATE = "Already stopped";
    private static final String PAUSED_ON_MESSAGE_TEMPLATE = "Paused on: {}";

    @Mock(name = "org.homework.player.state.Active")
    Logger activeStateLogger;
    @Mock(name = "org.homework.player.state.Ready")
    Logger readyStateLogger;
    @Mock(name = "org.homework.player.state.RepeatOff")
    Logger repeatOffLogger;
    @Mock(name = "org.homework.player.state.RepeatOn")
    Logger repeatOnLogger;

    @Test
    void shouldPlay() {
        Player sut = new PlayerImpl(TRACKS);
        sut.playOrPause();

        Mockito.verify(readyStateLogger).info(PLAYING_MESSAGE_TEMPLATE, TRACKS.get(0));
    }

    @Test
    void shouldPause() {
        Player sut = new PlayerImpl(TRACKS);
        sut.playOrPause();
        sut.playOrPause();

        Mockito.verify(readyStateLogger).info(PLAYING_MESSAGE_TEMPLATE, TRACKS.get(0));
        Mockito.verify(activeStateLogger).info(PAUSED_ON_MESSAGE_TEMPLATE, TRACKS.get(0));
    }

    @Test
    void shouldSayAlreadyStopped() {
        Player sut = new PlayerImpl(TRACKS);
        sut.stop();

        Mockito.verify(readyStateLogger).info(ALREADY_STOPPED_MESSAGE_TEMPLATE);
    }

    @Test
    void shouldStop() {
        Player sut = new PlayerImpl(TRACKS);
        sut.playOrPause();
        sut.stop();

        Mockito.verify(readyStateLogger).info(PLAYING_MESSAGE_TEMPLATE, TRACKS.get(0));
        Mockito.verify(activeStateLogger).info(STOPPING_MESSAGE_TEMPLATE, TRACKS.get(0));
    }

    @Test
    void shouldPlayNextByCircle() {
        Player sut = new PlayerImpl(TRACKS);
        sut.repeatOnOrOff();//sets repeat on

        sut.next();
        Mockito.verify(repeatOnLogger).info(PLAYING_NEXT_TRACK_MESSAGE_TEMPLATE, TRACKS.get(1));

        sut.next();
        Mockito.verify(repeatOnLogger).info(PLAYING_NEXT_TRACK_MESSAGE_TEMPLATE, TRACKS.get(2));

        sut.next();
        Mockito.verify(repeatOnLogger).info(REPLAYING_FIRST_TRACK_MESSAGE_TEMPLATE, TRACKS.get(0));
    }

    @Test
    void shouldPlayNextTillEnd() {
        Player sut = new PlayerImpl(TRACKS);

        sut.next();
        Mockito.verify(repeatOffLogger).info(PLAYING_NEXT_TRACK_MESSAGE_TEMPLATE, TRACKS.get(1));

        sut.next();
        Mockito.verify(repeatOffLogger).info(PLAYING_NEXT_TRACK_MESSAGE_TEMPLATE, TRACKS.get(2));

        sut.next();
        Mockito.verify(repeatOffLogger)
                .info(ALREADY_ON_THE_LAST_TRACK_MESSAGE_TEMPLATE, TRACKS.get(2));
    }

    @Test
    void shouldPlayPreviousTillFirstOne() {
        Player sut = new PlayerImpl(TRACKS);
        sut.next();

        sut.previous();
        Mockito.verify(repeatOffLogger)
                .info(PLAYING_PREVIOUS_TRACK_MESSAGE_TEMPLATE, TRACKS.get(0));
        sut.previous();
        Mockito.verify(repeatOffLogger)
                .info(ALREADY_ON_THE_FIRST_TRACK_MESSAGE_TEMPLATE, TRACKS.get(0));
    }

    @Test
    void shouldPlayPreviousByCircle() {
        Player sut = new PlayerImpl(TRACKS);
        sut.repeatOnOrOff();//sets repeat on

        sut.previous();
        Mockito.verify(repeatOnLogger).info(PLAYING_PREVIOUS_TRACK_MESSAGE_TEMPLATE, TRACKS.get(2));

        sut.previous();
        Mockito.verify(repeatOnLogger).info(PLAYING_PREVIOUS_TRACK_MESSAGE_TEMPLATE, TRACKS.get(1));

        sut.previous();
        Mockito.verify(repeatOnLogger).info(PLAYING_PREVIOUS_TRACK_MESSAGE_TEMPLATE, TRACKS.get(0));
    }

    @Test
    void repeatOnOrOff() {
        Player sut = new PlayerImpl(TRACKS);

        sut.repeatOnOrOff();
        Mockito.verify(repeatOffLogger).info(REPEAT_ON_MESSAGE_TEMPLATE);

        sut.repeatOnOrOff();
        Mockito.verify(repeatOnLogger).info(REPEAT_OFF_MESSAGE_TEMPLATE);
    }
}