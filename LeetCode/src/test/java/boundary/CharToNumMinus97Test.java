package boundary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class CharToNumMinus97Test {
    CharToNumMinus97 sut;

    @BeforeEach
    void init() {
        sut = new CharToNumMinus97();
    }

    @Test
    @DisplayName("a에 대한 반환값은 0이다")
    void test1() {
        assertThat(sut.convert('a'), is(0));
    }

    @Test
    @DisplayName("getBaseNumber는 97을 반환한다")
    void test2() {
        assertThat(sut.getBaseNumber(), is(97));
    }
}