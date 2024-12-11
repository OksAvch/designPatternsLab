package org.homework.mediator;

class Oven extends Component {
    public Oven(Mediator mediator) {
        super(mediator);
    }

    public void startBaking() {
        System.out.println("Oven: Baking goods...");
        mediator.notify(this, "bakingDone");
    }
}
