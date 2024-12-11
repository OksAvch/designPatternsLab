package org.homework.mediator;

class MixingMachine extends Component {
    public MixingMachine(Mediator mediator) {
        super(mediator);
    }

    public void startMixing() {
        System.out.println("MixingMachine: Mixing ingredients...");
        mediator.notify(this, "mixingDone");
    }
}
