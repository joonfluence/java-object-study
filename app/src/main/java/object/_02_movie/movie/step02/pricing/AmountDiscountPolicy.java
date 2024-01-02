package object._02_movie.movie.step02.pricing;

import object._02_movie.money.Money;
import object._02_movie.movie.step02.DiscountCondition;
import object._02_movie.movie.step02.Screening;
import object._02_movie.movie.step02.DefaultDiscountPolicy;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}