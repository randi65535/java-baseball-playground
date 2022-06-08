package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest  {
    public String input;

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        input = "1,2";
        String[] strs = input.split(",");
        assertThat(strs).containsExactly("1", "2");
    }

    @Test
    void substring() {
        input = "(1,2)";

        String result = input.substring(0, input.length()-1);
        assertThat(result).isEqualTo("(1,2");

        result = result.substring(1,input.length()-1);
        assertThat(result).isEqualTo("1,2");
    }

    @DisplayName("\"abc\" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습")
    @Test
    void charAt() {
        input = "abc";

        assertThatThrownBy(() -> {
            input.charAt(4);
        })
                .isInstanceOf(IndexOutOfBoundsException.class)
                .withFailMessage("인덱스가 문자열의 범위를 넘어섰습니다.");
    }

}
