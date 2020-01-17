package com.mapbox.mapboxsdk.utils;

import androidx.annotation.Keep;
import java.text.Normalizer;
import java.text.Normalizer.Form;

@Keep
class StringUtils {
    StringUtils() {
    }

    @Keep
    static String unaccent(String str) {
        return Normalizer.normalize(str, Form.NFD).replaceAll("(\\p{InCombiningDiacriticalMarks}|\\p{InCombiningDiacriticalMarksForSymbols}|\\p{InCombiningDiacriticalMarksSupplement})+", "");
    }
}
