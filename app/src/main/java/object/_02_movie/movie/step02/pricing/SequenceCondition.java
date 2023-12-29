package object._02_movie.movie.step02.pricing;

import object._02_movie.movie.step02.Screening;
import object._02_movie.movie.step02.DiscountCondition;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
