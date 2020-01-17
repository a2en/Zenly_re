package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.Place.Field;
import java.util.ArrayList;
import java.util.List;

public final class zzcd {
    private static final zzha<Field, String> zza = new zzgz().zza(Field.ADDRESS, "formatted_address").zza(Field.ADDRESS_COMPONENTS, "address_components").zza(Field.ID, "place_id").zza(Field.LAT_LNG, "geometry/location").zza(Field.NAME, "name").zza(Field.OPENING_HOURS, "opening_hours").zza(Field.PHONE_NUMBER, "international_phone_number").zza(Field.PHOTO_METADATAS, "photos").zza(Field.PLUS_CODE, "plus_code").zza(Field.PRICE_LEVEL, "price_level").zza(Field.RATING, "rating").zza(Field.TYPES, "types").zza(Field.USER_RATINGS_TOTAL, "user_ratings_total").zza(Field.UTC_OFFSET, "utc_offset").zza(Field.VIEWPORT, "geometry/viewport").zza(Field.WEBSITE_URI, "website").zza();

    public static List<String> zza(List<Field> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Field field : list) {
            arrayList.add((String) zza.get(field));
        }
        return arrayList;
    }

    public static String zzb(List<Field> list) {
        StringBuilder sb = new StringBuilder();
        for (Field field : list) {
            String str = (String) zza.get(field);
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
