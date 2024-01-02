package object._02_movie.movie.step01.pricing;

import object._02_movie.money.Money;
import object._02_movie.movie.step01.DiscountCondition;
import object._02_movie.movie.step01.DiscountPolicy;
import object._02_movie.movie.step01.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
