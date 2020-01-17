package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import com.google.android.libraries.places.api.model.Place.Type;
import com.google.android.libraries.places.internal.zzgv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AutocompletePrediction implements Parcelable {

    public static abstract class Builder {
        public AutocompletePrediction build() {
            AutocompletePrediction zza = zza();
            setPlaceTypes(zzgv.zza((Collection<? extends E>) zza.getPlaceTypes()));
            List zzd = zza.zzd();
            if (zzd != null) {
                zza((List<zza>) zzgv.zza((Collection<? extends E>) zzd));
            }
            List zze = zza.zze();
            if (zze != null) {
                zzb(zzgv.zza((Collection<? extends E>) zze));
            }
            List zzf = zza.zzf();
            if (zzf != null) {
                zzc(zzgv.zza((Collection<? extends E>) zzf));
            }
            return zza();
        }

        public abstract Builder setFullText(String str);

        public abstract Builder setPlaceTypes(List<Type> list);

        public abstract Builder setPrimaryText(String str);

        public abstract Builder setSecondaryText(String str);

        /* access modifiers changed from: 0000 */
        public abstract Builder zza(String str);

        public abstract Builder zza(List<zza> list);

        /* access modifiers changed from: 0000 */
        public abstract AutocompletePrediction zza();

        public abstract Builder zzb(List<zza> list);

        public abstract Builder zzc(List<zza> list);
    }

    public static abstract class zza implements Parcelable {

        /* renamed from: com.google.android.libraries.places.api.model.AutocompletePrediction$zza$zza reason: collision with other inner class name */
        public static abstract class C13837zza {
            public abstract C13837zza zza(int i);

            public abstract zza zza();

            public abstract C13837zza zzb(int i);
        }

        public static C13837zza zzc() {
            return new zzh();
        }

        /* access modifiers changed from: 0000 */
        public abstract int zza();

        /* access modifiers changed from: 0000 */
        public abstract int zzb();
    }

    public static Builder builder(String str) {
        Builder placeTypes = new zzf().zza(str).setPlaceTypes(new ArrayList());
        String str2 = "";
        return placeTypes.setFullText(str2).setPrimaryText(str2).setSecondaryText(str2);
    }

    private static SpannableString zza(String str, List<zza> list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (!(str.length() == 0 || characterStyle == null || list == null)) {
            for (zza zza2 : list) {
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), zza2.zza(), zza2.zza() + zza2.zzb(), 0);
            }
        }
        return spannableString;
    }

    public SpannableString getFullText(CharacterStyle characterStyle) {
        return zza(zza(), zzd(), characterStyle);
    }

    public abstract String getPlaceId();

    public abstract List<Type> getPlaceTypes();

    public SpannableString getPrimaryText(CharacterStyle characterStyle) {
        return zza(zzb(), zze(), characterStyle);
    }

    public SpannableString getSecondaryText(CharacterStyle characterStyle) {
        return zza(zzc(), zzf(), characterStyle);
    }

    /* access modifiers changed from: 0000 */
    public abstract String zza();

    /* access modifiers changed from: 0000 */
    public abstract String zzb();

    /* access modifiers changed from: 0000 */
    public abstract String zzc();

    /* access modifiers changed from: 0000 */
    public abstract List<zza> zzd();

    /* access modifiers changed from: 0000 */
    public abstract List<zza> zze();

    /* access modifiers changed from: 0000 */
    public abstract List<zza> zzf();
}
