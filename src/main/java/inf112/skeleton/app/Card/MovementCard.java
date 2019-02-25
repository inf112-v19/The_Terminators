package inf112.skeleton.app.Card;

import inf112.skeleton.app.Card.Card;

public abstract class MovementCard extends Card {
    private int steps;

    public MovementCard(int priority, int steps) {
        super(priority);
        if (steps > 3 || steps < 1){throw new IllegalStateException();}
        this.steps = steps;
    }
}