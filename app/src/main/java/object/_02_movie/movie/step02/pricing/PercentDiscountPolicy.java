package object._02_movie.movie.step02.pricing;


import object._02_movie.money.Money;
import object._02_movie.movie.step02.DefaultDiscountPolicy;
import object._02_movie.movie.step02.DiscountCondition;
import object._02_movie.movie.step02.Screening;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
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
