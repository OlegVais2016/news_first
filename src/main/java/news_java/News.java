package news_java;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
@Getter
public enum News {
    POLITIC("human rights"),
    NO_POLITIC("");
    private final String word;

    public static News getWord(String politic_word){
    String d = "human rights";
        return Arrays.stream(values())
                .filter(news -> news.getWord().equals(d))
                .findAny().orElse(NO_POLITIC);
    }
}
