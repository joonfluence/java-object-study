package object._02_movie.movie.step02.pricing;

import object._02_movie.money.Money;
import object._02_movie.movie.step02.DiscountPolicy;
import object._02_movie.movie.step02.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
