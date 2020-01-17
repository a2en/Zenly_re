package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place.Type;
import java.util.List;

abstract class zzr extends Place {
    private final String zza;
    private final AddressComponents zzb;
    private final List<String> zzc;
    private final String zzd;
    private final LatLng zze;
    private final String zzf;
    private final OpeningHours zzg;
    private final String zzh;
    private final List<PhotoMetadata> zzi;
    private final PlusCode zzj;
    private final Integer zzk;
    private final Double zzl;
    private final List<Type> zzm;
    private final Integer zzn;
    private final Integer zzo;
    private final LatLngBounds zzp;
    private final Uri zzq;

    zzr(String str, AddressComponents addressComponents, List<String> list, String str2, LatLng latLng, String str3, OpeningHours openingHours, String str4, List<PhotoMetadata> list2, PlusCode plusCode, Integer num, Double d, List<Type> list3, Integer num2, Integer num3, LatLngBounds latLngBounds, Uri uri) {
        this.zza = str;
        this.zzb = addressComponents;
        this.zzc = list;
        this.zzd = str2;
        this.zze = latLng;
        this.zzf = str3;
        this.zzg = openingHours;
        this.zzh = str4;
        this.zzi = list2;
        this.zzj = plusCode;
        this.zzk = num;
        this.zzl = d;
        this.zzm = list3;
        this.zzn = num2;
        this.zzo = num3;
        this.zzp = latLngBounds;
        this.zzq = uri;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            String str = this.zza;
            if (str != null ? str.equals(place.getAddress()) : place.getAddress() == null) {
                AddressComponents addressComponents = this.zzb;
                if (addressComponents != null ? addressComponents.equals(place.getAddressComponents()) : place.getAddressComponents() == null) {
                    List<String> list = this.zzc;
                    if (list != null ? list.equals(place.getAttributions()) : place.getAttributions() == null) {
                        String str2 = this.zzd;
                        if (str2 != null ? str2.equals(place.getId()) : place.getId() == null) {
                            LatLng latLng = this.zze;
                            if (latLng != null ? latLng.equals(place.getLatLng()) : place.getLatLng() == null) {
                                String str3 = this.zzf;
                                if (str3 != null ? str3.equals(place.getName()) : place.getName() == null) {
                                    OpeningHours openingHours = this.zzg;
                                    if (openingHours != null ? openingHours.equals(place.getOpeningHours()) : place.getOpeningHours() == null) {
                                        String str4 = this.zzh;
                                        if (str4 != null ? str4.equals(place.getPhoneNumber()) : place.getPhoneNumber() == null) {
                                            List<PhotoMetadata> list2 = this.zzi;
                                            if (list2 != null ? list2.equals(place.getPhotoMetadatas()) : place.getPhotoMetadatas() == null) {
                                                PlusCode plusCode = this.zzj;
                                                if (plusCode != null ? plusCode.equals(place.getPlusCode()) : place.getPlusCode() == null) {
                                                    Integer num = this.zzk;
                                                    if (num != null ? num.equals(place.getPriceLevel()) : place.getPriceLevel() == null) {
                                                        Double d = this.zzl;
                                                        if (d != null ? d.equals(place.getRating()) : place.getRating() == null) {
                                                            List<Type> list3 = this.zzm;
                                                            if (list3 != null ? list3.equals(place.getTypes()) : place.getTypes() == null) {
                                                                Integer num2 = this.zzn;
                                                                if (num2 != null ? num2.equals(place.getUserRatingsTotal()) : place.getUserRatingsTotal() == null) {
                                                                    Integer num3 = this.zzo;
                                                                    if (num3 != null ? num3.equals(place.getUtcOffsetMinutes()) : place.getUtcOffsetMinutes() == null) {
                                                                        LatLngBounds latLngBounds = this.zzp;
                                                                        if (latLngBounds != null ? latLngBounds.equals(place.getViewport()) : place.getViewport() == null) {
                                                                            Uri uri = this.zzq;
                                                                            return uri != null ? uri.equals(place.getWebsiteUri()) : place.getWebsiteUri() == null;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String getAddress() {
        return this.zza;
    }

    public AddressComponents getAddressComponents() {
        return this.zzb;
    }

    public List<String> getAttributions() {
        return this.zzc;
    }

    public String getId() {
        return this.zzd;
    }

    public LatLng getLatLng() {
        return this.zze;
    }

    public String getName() {
        return this.zzf;
    }

    public OpeningHours getOpeningHours() {
        return this.zzg;
    }

    public String getPhoneNumber() {
        return this.zzh;
    }

    public List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzi;
    }

    public PlusCode getPlusCode() {
        return this.zzj;
    }

    public Integer getPriceLevel() {
        return this.zzk;
    }

    public Double getRating() {
        return this.zzl;
    }

    public List<Type> getTypes() {
        return this.zzm;
    }

    public Integer getUserRatingsTotal() {
        return this.zzn;
    }

    public Integer getUtcOffsetMinutes() {
        return this.zzo;
    }

    public LatLngBounds getViewport() {
        return this.zzp;
    }

    public Uri getWebsiteUri() {
        return this.zzq;
    }

    public int hashCode() {
        String str = this.zza;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        AddressComponents addressComponents = this.zzb;
        int hashCode2 = (hashCode ^ (addressComponents == null ? 0 : addressComponents.hashCode())) * 1000003;
        List<String> list = this.zzc;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str2 = this.zzd;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        LatLng latLng = this.zze;
        int hashCode5 = (hashCode4 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        String str3 = this.zzf;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        OpeningHours openingHours = this.zzg;
        int hashCode7 = (hashCode6 ^ (openingHours == null ? 0 : openingHours.hashCode())) * 1000003;
        String str4 = this.zzh;
        int hashCode8 = (hashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        List<PhotoMetadata> list2 = this.zzi;
        int hashCode9 = (hashCode8 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PlusCode plusCode = this.zzj;
        int hashCode10 = (hashCode9 ^ (plusCode == null ? 0 : plusCode.hashCode())) * 1000003;
        Integer num = this.zzk;
        int hashCode11 = (hashCode10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Double d = this.zzl;
        int hashCode12 = (hashCode11 ^ (d == null ? 0 : d.hashCode())) * 1000003;
        List<Type> list3 = this.zzm;
        int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        Integer num2 = this.zzn;
        int hashCode14 = (hashCode13 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.zzo;
        int hashCode15 = (hashCode14 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        LatLngBounds latLngBounds = this.zzp;
        int hashCode16 = (hashCode15 ^ (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 1000003;
        Uri uri = this.zzq;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode16 ^ i;
    }

    public String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String str2 = this.zzd;
        String valueOf3 = String.valueOf(this.zze);
        String str3 = this.zzf;
        String valueOf4 = String.valueOf(this.zzg);
        String str4 = this.zzh;
        String valueOf5 = String.valueOf(this.zzi);
        String valueOf6 = String.valueOf(this.zzj);
        String valueOf7 = String.valueOf(this.zzk);
        String valueOf8 = String.valueOf(this.zzl);
        String valueOf9 = String.valueOf(this.zzm);
        String valueOf10 = String.valueOf(this.zzn);
        String valueOf11 = String.valueOf(this.zzo);
        String valueOf12 = String.valueOf(this.zzp);
        String valueOf13 = String.valueOf(this.zzq);
        String str5 = valueOf13;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 220 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(str2).length() + String.valueOf(valueOf3).length() + String.valueOf(str3).length() + String.valueOf(valueOf4).length() + String.valueOf(str4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length() + String.valueOf(valueOf13).length());
        sb.append("Place{address=");
        sb.append(str);
        sb.append(", addressComponents=");
        sb.append(valueOf);
        sb.append(", attributions=");
        sb.append(valueOf2);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", latLng=");
        sb.append(valueOf3);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", openingHours=");
        sb.append(valueOf4);
        sb.append(", phoneNumber=");
        sb.append(str4);
        sb.append(", photoMetadatas=");
        sb.append(valueOf5);
        sb.append(", plusCode=");
        sb.append(valueOf6);
        sb.append(", priceLevel=");
        sb.append(valueOf7);
        sb.append(", rating=");
        sb.append(valueOf8);
        sb.append(", types=");
        sb.append(valueOf9);
        sb.append(", userRatingsTotal=");
        sb.append(valueOf10);
        sb.append(", utcOffsetMinutes=");
        sb.append(valueOf11);
        sb.append(", viewport=");
        sb.append(valueOf12);
        sb.append(", websiteUri=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}
