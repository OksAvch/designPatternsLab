package org.homework.mediator;

class PackagingMachine extends Component {
    public PackagingMachine(Mediator mediator) {
        super(mediator);
    }

    public void startPackaging() {
        System.out.println("PackagingMachine: Packaging goods...");
        mediator.notify(this, "packagingDone");
    }
}
