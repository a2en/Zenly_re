package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.internal.zzgg;
import com.google.android.libraries.places.internal.zzgl;
import com.google.android.libraries.places.internal.zzgv;
import com.google.android.libraries.places.internal.zzhb;
import java.util.Collection;
import java.util.List;

public abstract class Place implements Parcelable {
    public static final int PRICE_LEVEL_MAX_VALUE = 4;
    public static final int PRICE_LEVEL_MIN_VALUE = 0;
    public static final double RATING_MAX_VALUE = 5.0d;
    public static final double RATING_MIN_VALUE = 1.0d;

    public static abstract class Builder {
        public Place build() {
            Place zza = zza();
            List<String> attributions = zza.getAttributions();
            if (attributions != null) {
                for (String isEmpty : attributions) {
                    zzgg.zzb(!TextUtils.isEmpty(isEmpty), (Object) "Attributions must not contain null or empty values.");
                }
            }
            Integer priceLevel = zza.getPriceLevel();
            if (priceLevel != null) {
                zzgg.zza(zzhb.zza(Integer.valueOf(0), Integer.valueOf(4)).zzb(priceLevel), "Price Level must not be out-of-range: %s to %s, but was: %s.", Integer.valueOf(0), Integer.valueOf(4), priceLevel);
            }
            Double rating = zza.getRating();
            if (rating != null) {
                zzgg.zza(zzhb.zza(Double.valueOf(1.0d), Double.valueOf(5.0d)).zzb(rating), "Rating must not be out-of-range: %s to %s, but was: %s.", Double.valueOf(1.0d), Double.valueOf(5.0d), rating);
            }
            Integer userRatingsTotal = zza.getUserRatingsTotal();
            if (userRatingsTotal == null || zzhb.zza(Integer.valueOf(0)).zzb(userRatingsTotal)) {
                if (attributions != null) {
                    setAttributions(zzgv.zza((Collection<? extends E>) attributions));
                }
                List photoMetadatas = zza.getPhotoMetadatas();
                if (photoMetadatas != null) {
                    setPhotoMetadatas(zzgv.zza((Collection<? extends E>) photoMetadatas));
                }
                List types = zza.getTypes();
                if (types != null) {
                    setTypes(zzgv.zza((Collection<? extends E>) types));
                }
                return zza();
            }
            throw new IllegalStateException(zzgl.zza("User Ratings Total must not be < 0, but was: %s.", userRatingsTotal));
        }

        public abstract Builder setAddress(String str);

        public abstract Builder setAddressComponents(AddressComponents addressComponents);

        public abstract Builder setAttributions(List<String> list);

        public abstract Builder setId(String str);

        public abstract Builder setLatLng(LatLng latLng);

        public abstract Builder setName(String str);

        public abstract Builder setOpeningHours(OpeningHours openingHours);

        public abstract Builder setPhoneNumber(String str);

        public abstract Builder setPhotoMetadatas(List<PhotoMetadata> list);

        public abstract Builder setPlusCode(PlusCode plusCode);

        public abstract Builder setPriceLevel(Integer num);

        public abstract Builder setRating(Double d);

        public abstract Builder setTypes(List<Type> list);

        public abstract Builder setUserRatingsTotal(Integer num);

        public abstract Builder setUtcOffsetMinutes(Integer num);

        public abstract Builder setViewport(LatLngBounds latLngBounds);

        public abstract Builder setWebsiteUri(Uri uri);

        /* access modifiers changed from: 0000 */
        public abstract Place zza();
    }

    public enum Field implements Parcelable {
        ADDRESS,
        ADDRESS_COMPONENTS,
        ID,
        LAT_LNG,
        NAME,
        OPENING_HOURS,
        PHONE_NUMBER,
        PHOTO_METADATAS,
        PLUS_CODE,
        PRICE_LEVEL,
        RATING,
        TYPES,
        USER_RATINGS_TOTAL,
        UTC_OFFSET,
        VIEWPORT,
        WEBSITE_URI;
        
        public static final Creator<Field> CREATOR = null;

        static {
            CREATOR = new zzbc();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public enum Type implements Parcelable {
        OTHER,
        ACCOUNTING,
        ADMINISTRATIVE_AREA_LEVEL_1,
        ADMINISTRATIVE_AREA_LEVEL_2,
        ADMINISTRATIVE_AREA_LEVEL_3,
        ADMINISTRATIVE_AREA_LEVEL_4,
        ADMINISTRATIVE_AREA_LEVEL_5,
        AIRPORT,
        AMUSEMENT_PARK,
        AQUARIUM,
        ART_GALLERY,
        ATM,
        BAKERY,
        BANK,
        BAR,
        BEAUTY_SALON,
        BICYCLE_STORE,
        BOOK_STORE,
        BOWLING_ALLEY,
        BUS_STATION,
        CAFE,
        CAMPGROUND,
        CAR_DEALER,
        CAR_RENTAL,
        CAR_REPAIR,
        CAR_WASH,
        CASINO,
        CEMETERY,
        CHURCH,
        CITY_HALL,
        CLOTHING_STORE,
        COLLOQUIAL_AREA,
        CONVENIENCE_STORE,
        COUNTRY,
        COURTHOUSE,
        DENTIST,
        DEPARTMENT_STORE,
        DOCTOR,
        ELECTRICIAN,
        ELECTRONICS_STORE,
        EMBASSY,
        ESTABLISHMENT,
        FINANCE,
        FIRE_STATION,
        FLOOR,
        FLORIST,
        FOOD,
        FUNERAL_HOME,
        FURNITURE_STORE,
        GAS_STATION,
        GENERAL_CONTRACTOR,
        GEOCODE,
        GROCERY_OR_SUPERMARKET,
        GYM,
        HAIR_CARE,
        HARDWARE_STORE,
        HEALTH,
        HINDU_TEMPLE,
        HOME_GOODS_STORE,
        HOSPITAL,
        INSURANCE_AGENCY,
        INTERSECTION,
        JEWELRY_STORE,
        LAUNDRY,
        LAWYER,
        LIBRARY,
        LIQUOR_STORE,
        LOCAL_GOVERNMENT_OFFICE,
        LOCALITY,
        LOCKSMITH,
        LODGING,
        MEAL_DELIVERY,
        MEAL_TAKEAWAY,
        MOSQUE,
        MOVIE_RENTAL,
        MOVIE_THEATER,
        MOVING_COMPANY,
        MUSEUM,
        NATURAL_FEATURE,
        NEIGHBORHOOD,
        NIGHT_CLUB,
        PAINTER,
        PARK,
        PARKING,
        PET_STORE,
        PHARMACY,
        PHYSIOTHERAPIST,
        PLACE_OF_WORSHIP,
        PLUMBER,
        POINT_OF_INTEREST,
        POLICE,
        POLITICAL,
        POST_BOX,
        POST_OFFICE,
        POSTAL_CODE,
        POSTAL_CODE_PREFIX,
        POSTAL_CODE_SUFFIX,
        POSTAL_TOWN,
        PREMISE,
        REAL_ESTATE_AGENCY,
        RESTAURANT,
        ROOFING_CONTRACTOR,
        ROOM,
        ROUTE,
        RV_PARK,
        SCHOOL,
        SHOE_STORE,
        SHOPPING_MALL,
        SPA,
        STADIUM,
        STREET_ADDRESS,
        STORAGE,
        STORE,
        SUBLOCALITY,
        SUBLOCALITY_LEVEL_1,
        SUBLOCALITY_LEVEL_2,
        SUBLOCALITY_LEVEL_3,
        SUBLOCALITY_LEVEL_4,
        SUBLOCALITY_LEVEL_5,
        SUBPREMISE,
        SUBWAY_STATION,
        SUPERMARKET,
        SYNAGOGUE,
        TAXI_STAND,
        TRAIN_STATION,
        TRANSIT_STATION,
        TRAVEL_AGENCY,
        UNIVERSITY,
        VETERINARY_CARE,
        ZOO;
        
        public static final Creator<Type> CREATOR = null;

        static {
            CREATOR = new zzbd();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static Builder builder() {
        return new zzq();
    }

    public abstract String getAddress();

    public abstract AddressComponents getAddressComponents();

    public abstract List<String> getAttributions();

    public abstract String getId();

    public abstract LatLng getLatLng();

    public abstract String getName();

    public abstract OpeningHours getOpeningHours();

    public abstract String getPhoneNumber();

    public abstract List<PhotoMetadata> getPhotoMetadatas();

    public abstract PlusCode getPlusCode();

    public abstract Integer getPriceLevel();

    public abstract Double getRating();

    public abstract List<Type> getTypes();

    public abstract Integer getUserRatingsTotal();

    public abstract Integer getUtcOffsetMinutes();

    public abstract LatLngBounds getViewport();

    public abstract Uri getWebsiteUri();

    public Boolean isOpen() {
        return isOpen(System.currentTimeMillis());
    }

    public Boolean isOpen(long j) {
        return zzbb.zza(this, j);
    }
}
