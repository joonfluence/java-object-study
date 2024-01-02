package object._02_movie.movie.step02;

import object._02_movie.money.Money;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
