package object._02_movie.movie.step02;

import object._02_movie.money.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@SuppressWarnings({"InnerClassMayBeStatic", "NonAsciiCharacters"})
@DisplayName("Movie 클래스")
class MovieTest {


    abstract class TestCalculateMovieFee {
        abstract Movie givenMovie();

        Money 기본_요금() {
            return givenMovie().getFee();
        }

        Money subject(Screening screening) {
            return givenMovie().calculateMovieFee(screening);
        }
    }

    @Nested
    @DisplayName("calculateMovieFee 메소드는")
    class Describe_calculateMovieFee {
        @Nested
        @DisplayName("주어진 영화가 '아바타'일때 (할인 조건: 상영 시작 시간, 상영 순번 / 할인 금액: 고정 금액)")
        class Context_with_avatar extends TestCalculateMovieFee {

            @Override
            Movie givenMovie() {
                return null;
            }

            @Nested
            @DisplayName("상영 시작 시간이 할인 조건에 맞는다면")
            class Context_with_valid_period {

                @Test
                @DisplayName("고정할인 금액만큼 할인된 금액을 리턴한다")
                void it_returns_discounted_fee() {

                }
            }

            @Nested
            @DisplayName("상영 시작 시간이 할인 조건에 맞지 않는다면")
            class Context_with_invalid_period {
                @Test
                @DisplayName("할인되지 않은 금액을 리턴한다")
                void it_returns_fee_does_not_discounted() {

                }
            }

            @Nested
            @DisplayName("상영 순번이 할인 조건에 맞는다면")
            class Context_with_valid_seq {

                @Test
                @DisplayName("고정할인 금액만큼 할인된 금액을 리턴한다")
                void it_returns_discounted_fee() {

                }
            }

            @Nested
            @DisplayName("상영 순번이 할인 조건에 맞지 않는다면")
            class Context_with_invalid_seq {
                @Test
                @DisplayName("할인되지 않은 금액을 리턴한다")
                void it_returns_fee_not_discounted() {

                }
            }
        }

        @Nested
        @DisplayName("주어진 영화가 '타이타닉'일때 (할인 조건: 상영 시작 시간, 상영 순번 / 할인 금액: 퍼센트)")
        class Context_with_titanic extends TestCalculateMovieFee {

            @Override
            Movie givenMovie() {
                return null;
            }

            @Nested
            @DisplayName("상영 시작 시간이 할인 조건에 맞는다면")
            class Context_with_valid_period {
                @Test
                @DisplayName("지정된 비율만큼 할인된 금액을 리턴한다")
                void it_returns_discounted_fee() {

                }
            }

            @Nested
            @DisplayName("상영 시작 시간이 할인 조건에 맞지 않는다면")
            class Context_with_invalid_period {
                @Test
                @DisplayName("할인되지 않은 금액을 리턴한다")
                void it_returns_fee_not_discounted() {

                }
            }

            @Nested
            @DisplayName("상영 순번이 할인 조건에 맞는다면")
            class Context_with_valid_seq {

                @Test
                @DisplayName("지정된 비율만큼 할인된 금액을 리턴한다")
                void it_returns_discounted_fee() {

                }
            }

            @Nested
            @DisplayName("상영 순번이 할인 조건에 맞지 않는다면")
            class Context_with_invalid_seq {
                @Test
                @DisplayName("할인되지 않은 금액을 리턴한다")
                void it_returns_fee_not_discounted() {
                }
            }
        }

        @Nested
        @DisplayName("주어진 영화가 '스타워즈'일때 (할인 조건 없음)")
        class Context_with_starwars extends TestCalculateMovieFee {
            @Test
            @DisplayName("할인되지 않은 금액을 리턴한다")
            void it_returns_fee_not_discounted() {

            }

            @Override
            Movie givenMovie() {
                return null;
            }
        }
    }

    @Nested
    @DisplayName("changeDiscountPolicy 메소드는")
    class Describe_changeDiscountPolicy {
        @Nested
        @DisplayName("주어진 영화가 '스타워즈'일때 (할인 조건 없음)")
        class Context_with_starwars {
            @Nested
            @DisplayName("'아바타'의 할인정책이 주어지면")
            class Context_with_avatar_discount_policy {
                @Test
                @DisplayName("주어진 할인 정책으로 할인정책을 교체하고 void를 리턴한다")
                void it_changes_the_discount_policy() {
                }
            }

            @Nested
            @DisplayName("'타이타닉'의 할인정책이 주어지면")
            class Context_with_starwars_policy {
                @Test
                @DisplayName("주어진 할인 정책으로 할인정책을 교체하고 void를 리턴한다")
                void it_changes_the_discount_policy() {
                }
            }
        }
    }
}