package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place.Builder;
import com.google.android.libraries.places.api.model.Place.Type;
import java.util.List;

final class zzq extends Builder {
    private String zza;
    private AddressComponents zzb;
    private List<String> zzc;
    private String zzd;
    private LatLng zze;
    private String zzf;
    private OpeningHours zzg;
    private String zzh;
    private List<PhotoMetadata> zzi;
    private PlusCode zzj;
    private Integer zzk;
    private Double zzl;
    private List<Type> zzm;
    private Integer zzn;
    private Integer zzo;
    private LatLngBounds zzp;
    private Uri zzq;

    zzq() {
    }

    public final Builder setAddress(String str) {
        this.zza = str;
        return this;
    }

    public final Builder setAddressComponents(AddressComponents addressComponents) {
        this.zzb = addressComponents;
        return this;
    }

    public final Builder setAttributions(List<String> list) {
        this.zzc = list;
        return this;
    }

    public final Builder setId(String str) {
        this.zzd = str;
        return this;
    }

    public final Builder setLatLng(LatLng latLng) {
        this.zze = latLng;
        return this;
    }

    public final Builder setName(String str) {
        this.zzf = str;
        return this;
    }

    public final Builder setOpeningHours(OpeningHours openingHours) {
        this.zzg = openingHours;
        return this;
    }

    public final Builder setPhoneNumber(String str) {
        this.zzh = str;
        return this;
    }

    public final Builder setPhotoMetadatas(List<PhotoMetadata> list) {
        this.zzi = list;
        return this;
    }

    public final Builder setPlusCode(PlusCode plusCode) {
        this.zzj = plusCode;
        return this;
    }

    public final Builder setPriceLevel(Integer num) {
        this.zzk = num;
        return this;
    }

    public final Builder setRating(Double d) {
        this.zzl = d;
        return this;
    }

    public final Builder setTypes(List<Type> list) {
        this.zzm = list;
        return this;
    }

    public final Builder setUserRatingsTotal(Integer num) {
        this.zzn = num;
        return this;
    }

    public final Builder setUtcOffsetMinutes(Integer num) {
        this.zzo = num;
        return this;
    }

    public final Builder setViewport(LatLngBounds latLngBounds) {
        this.zzp = latLngBounds;
        return this;
    }

    public final Builder setWebsiteUri(Uri uri) {
        this.zzq = uri;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final Place zza() {
        zzap zzap = new zzap(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq);
        return zzap;
    }
}
