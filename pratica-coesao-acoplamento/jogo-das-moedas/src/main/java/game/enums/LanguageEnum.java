package game.enums;

import java.util.Locale;

public enum LanguageEnum {
    ENGLISH, PORTUGUESE, SPANISH;

    public static LanguageEnum from() { return ENGLISH; }

    public static LanguageEnum from(String language) {
        try {
            return valueOf(language.trim().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException(
                "Language must be english, portuguese, or spanish: " + language,
                exception
            );
        }
    }
}