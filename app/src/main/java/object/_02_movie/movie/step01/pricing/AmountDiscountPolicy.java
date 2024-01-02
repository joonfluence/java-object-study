package object._02_movie.movie.step01.pricing;

import object._02_movie.money.Money;
import object._02_movie.movie.step01.DiscountCondition;
import object._02_movie.movie.step01.DiscountPolicy;
import object._02_movie.movie.step01.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
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