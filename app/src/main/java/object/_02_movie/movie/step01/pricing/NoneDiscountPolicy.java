package object._02_movie.movie.step01.pricing;

import object._02_movie.money.Money;
import object._02_movie.movie.step01.DiscountPolicy;
import object._02_movie.movie.step01.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
