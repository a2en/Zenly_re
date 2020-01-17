package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.LocalTime;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.Place.Builder;
import com.google.android.libraries.places.api.model.Place.Type;
import com.google.android.libraries.places.api.model.PlusCode;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class zzbz {
    private static final zzha<String, Type> zza;

    static {
        String str = "administrative_area_level_1";
        String str2 = "administrative_area_level_2";
        String str3 = "administrative_area_level_3";
        String str4 = "administrative_area_level_4";
        String str5 = "administrative_area_level_5";
        String str6 = "airport";
        String str7 = "amusement_park";
        String str8 = "aquarium";
        String str9 = "art_gallery";
        String str10 = "atm";
        String str11 = "bakery";
        String str12 = "bank";
        String str13 = "bar";
        String str14 = "beauty_salon";
        String str15 = "bicycle_store";
        String str16 = "book_store";
        String str17 = "bowling_alley";
        String str18 = "bus_station";
        String str19 = "cafe";
        String str20 = "campground";
        String str21 = "car_dealer";
        String str22 = "car_rental";
        String str23 = "car_repair";
        String str24 = "car_wash";
        String str25 = "casino";
        String str26 = "cemetery";
        String str27 = "church";
        String str28 = "city_hall";
        String str29 = "clothing_store";
        String str30 = "colloquial_area";
        String str31 = "convenience_store";
        String str32 = "country";
        String str33 = "courthouse";
        String str34 = "dentist";
        String str35 = "department_store";
        String str36 = "doctor";
        String str37 = "electrician";
        String str38 = "electronics_store";
        String str39 = "embassy";
        String str40 = "establishment";
        String str41 = "finance";
        String str42 = "fire_station";
        String str43 = "floor";
        String str44 = "florist";
        String str45 = "food";
        String str46 = "funeral_home";
        String str47 = "furniture_store";
        String str48 = "gas_station";
        String str49 = "general_contractor";
        String str50 = "geocode";
        String str51 = "grocery_or_supermarket";
        String str52 = "gym";
        String str53 = "hair_care";
        String str54 = "hardware_store";
        String str55 = "health";
        String str56 = "hindu_temple";
        String str57 = "home_goods_store";
        String str58 = "hospital";
        String str59 = "insurance_agency";
        String str60 = "intersection";
        String str61 = "jewelry_store";
        String str62 = "laundry";
        String str63 = "lawyer";
        String str64 = "library";
        String str65 = "liquor_store";
        String str66 = "local_government_office";
        String str67 = "locality";
        String str68 = "locksmith";
        String str69 = "lodging";
        String str70 = "meal_delivery";
        String str71 = "meal_takeaway";
        String str72 = "mosque";
        String str73 = "movie_rental";
        String str74 = "movie_theater";
        String str75 = "moving_company";
        String str76 = "museum";
        String str77 = "natural_feature";
        String str78 = "neighborhood";
        String str79 = "night_club";
        String str80 = "painter";
        String str81 = "park";
        String str82 = "parking";
        String str83 = "pet_store";
        String str84 = "pharmacy";
        String str85 = "physiotherapist";
        String str86 = "place_of_worship";
        String str87 = "plumber";
        String str88 = "point_of_interest";
        String str89 = "police";
        String str90 = "political";
        String str91 = "post_box";
        String str92 = "post_office";
        String str93 = "postal_code";
        String str94 = "postal_code_prefix";
        String str95 = "postal_code_suffix";
        String str96 = "postal_town";
        String str97 = "premise";
        String str98 = "real_estate_agency";
        String str99 = "restaurant";
        String str100 = "roofing_contractor";
        String str101 = "room";
        String str102 = "route";
        String str103 = "rv_park";
        String str104 = "school";
        String str105 = "shoe_store";
        String str106 = "shopping_mall";
        String str107 = "spa";
        String str108 = "stadium";
        String str109 = "street_address";
        String str110 = "storage";
        String str111 = "store";
        String str112 = "sublocality";
        String str113 = "sublocality_level_1";
        String str114 = "sublocality_level_2";
        String str115 = "sublocality_level_3";
        String str116 = "sublocality_level_4";
        String str117 = "sublocality_level_5";
        String str118 = "subpremise";
        String str119 = "subway_station";
        String str120 = "supermarket";
        String str121 = "synagogue";
        String str122 = "taxi_stand";
        String str123 = "train_station";
        String str124 = "transit_station";
        String str125 = "travel_agency";
        String str126 = "university";
        String str127 = "veterinary_care";
        String str128 = "zoo";
        zza = new zzgz().zza("accounting", Type.ACCOUNTING).zza(str, Type.ADMINISTRATIVE_AREA_LEVEL_1).zza(str2, Type.ADMINISTRATIVE_AREA_LEVEL_2).zza(str3, Type.ADMINISTRATIVE_AREA_LEVEL_3).zza(str4, Type.ADMINISTRATIVE_AREA_LEVEL_4).zza(str5, Type.ADMINISTRATIVE_AREA_LEVEL_5).zza(str6, Type.AIRPORT).zza(str7, Type.AMUSEMENT_PARK).zza(str8, Type.AQUARIUM).zza(str9, Type.ART_GALLERY).zza(str10, Type.ATM).zza(str11, Type.BAKERY).zza(str12, Type.BANK).zza(str13, Type.BAR).zza(str14, Type.BEAUTY_SALON).zza(str15, Type.BICYCLE_STORE).zza(str16, Type.BOOK_STORE).zza(str17, Type.BOWLING_ALLEY).zza(str18, Type.BUS_STATION).zza(str19, Type.CAFE).zza(str20, Type.CAMPGROUND).zza(str21, Type.CAR_DEALER).zza(str22, Type.CAR_RENTAL).zza(str23, Type.CAR_REPAIR).zza(str24, Type.CAR_WASH).zza(str25, Type.CASINO).zza(str26, Type.CEMETERY).zza(str27, Type.CHURCH).zza(str28, Type.CITY_HALL).zza(str29, Type.CLOTHING_STORE).zza(str30, Type.COLLOQUIAL_AREA).zza(str31, Type.CONVENIENCE_STORE).zza(str32, Type.COUNTRY).zza(str33, Type.COURTHOUSE).zza(str34, Type.DENTIST).zza(str35, Type.DEPARTMENT_STORE).zza(str36, Type.DOCTOR).zza(str37, Type.ELECTRICIAN).zza(str38, Type.ELECTRONICS_STORE).zza(str39, Type.EMBASSY).zza(str40, Type.ESTABLISHMENT).zza(str41, Type.FINANCE).zza(str42, Type.FIRE_STATION).zza(str43, Type.FLOOR).zza(str44, Type.FLORIST).zza(str45, Type.FOOD).zza(str46, Type.FUNERAL_HOME).zza(str47, Type.FURNITURE_STORE).zza(str48, Type.GAS_STATION).zza(str49, Type.GENERAL_CONTRACTOR).zza(str50, Type.GEOCODE).zza(str51, Type.GROCERY_OR_SUPERMARKET).zza(str52, Type.GYM).zza(str53, Type.HAIR_CARE).zza(str54, Type.HARDWARE_STORE).zza(str55, Type.HEALTH).zza(str56, Type.HINDU_TEMPLE).zza(str57, Type.HOME_GOODS_STORE).zza(str58, Type.HOSPITAL).zza(str59, Type.INSURANCE_AGENCY).zza(str60, Type.INTERSECTION).zza(str61, Type.JEWELRY_STORE).zza(str62, Type.LAUNDRY).zza(str63, Type.LAWYER).zza(str64, Type.LIBRARY).zza(str65, Type.LIQUOR_STORE).zza(str66, Type.LOCAL_GOVERNMENT_OFFICE).zza(str67, Type.LOCALITY).zza(str68, Type.LOCKSMITH).zza(str69, Type.LODGING).zza(str70, Type.MEAL_DELIVERY).zza(str71, Type.MEAL_TAKEAWAY).zza(str72, Type.MOSQUE).zza(str73, Type.MOVIE_RENTAL).zza(str74, Type.MOVIE_THEATER).zza(str75, Type.MOVING_COMPANY).zza(str76, Type.MUSEUM).zza(str77, Type.NATURAL_FEATURE).zza(str78, Type.NEIGHBORHOOD).zza(str79, Type.NIGHT_CLUB).zza(str80, Type.PAINTER).zza(str81, Type.PARK).zza(str82, Type.PARKING).zza(str83, Type.PET_STORE).zza(str84, Type.PHARMACY).zza(str85, Type.PHYSIOTHERAPIST).zza(str86, Type.PLACE_OF_WORSHIP).zza(str87, Type.PLUMBER).zza(str88, Type.POINT_OF_INTEREST).zza(str89, Type.POLICE).zza(str90, Type.POLITICAL).zza(str91, Type.POST_BOX).zza(str92, Type.POST_OFFICE).zza(str93, Type.POSTAL_CODE).zza(str94, Type.POSTAL_CODE_PREFIX).zza(str95, Type.POSTAL_CODE_SUFFIX).zza(str96, Type.POSTAL_TOWN).zza(str97, Type.PREMISE).zza(str98, Type.REAL_ESTATE_AGENCY).zza(str99, Type.RESTAURANT).zza(str100, Type.ROOFING_CONTRACTOR).zza(str101, Type.ROOM).zza(str102, Type.ROUTE).zza(str103, Type.RV_PARK).zza(str104, Type.SCHOOL).zza(str105, Type.SHOE_STORE).zza(str106, Type.SHOPPING_MALL).zza(str107, Type.SPA).zza(str108, Type.STADIUM).zza(str109, Type.STREET_ADDRESS).zza(str110, Type.STORAGE).zza(str111, Type.STORE).zza(str112, Type.SUBLOCALITY).zza(str113, Type.SUBLOCALITY_LEVEL_1).zza(str114, Type.SUBLOCALITY_LEVEL_2).zza(str115, Type.SUBLOCALITY_LEVEL_3).zza(str116, Type.SUBLOCALITY_LEVEL_4).zza(str117, Type.SUBLOCALITY_LEVEL_5).zza(str118, Type.SUBPREMISE).zza(str119, Type.SUBWAY_STATION).zza(str120, Type.SUPERMARKET).zza(str121, Type.SYNAGOGUE).zza(str122, Type.TAXI_STAND).zza(str123, Type.TRAIN_STATION).zza(str124, Type.TRANSIT_STATION).zza(str125, Type.TRAVEL_AGENCY).zza(str126, Type.UNIVERSITY).zza(str127, Type.VETERINARY_CARE).zza(str128, Type.ZOO).zza();
    }

    static Place zza(zzbx zzbx, List<String> list) throws ApiException {
        AddressComponents addressComponents;
        LatLngBounds latLngBounds;
        LatLng latLng;
        List list2;
        OpeningHours openingHours;
        List list3;
        Object obj;
        int i;
        int i2;
        Builder builder = Place.builder();
        builder.setAttributions(list);
        if (zzbx != null) {
            zzgv zza2 = zzbx.zza();
            int i3 = 0;
            PlusCode plusCode = null;
            if (zza2 == null) {
                addressComponents = null;
            } else {
                ArrayList arrayList = new ArrayList();
                int size = zza2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = zza2.get(i4);
                    i4++;
                    zza((Collection<T>) arrayList, (T) zza((zzb) obj2));
                }
                addressComponents = AddressComponents.newInstance(arrayList);
            }
            zza zzc = zzbx.zzc();
            if (zzc != null) {
                latLng = zza(zzc.zza());
                C13838zza zzb = zzc.zzb();
                if (zzb != null) {
                    LatLng zza3 = zza(zzb.zzb());
                    LatLng zza4 = zza(zzb.zza());
                    if (!(zza3 == null || zza4 == null)) {
                        latLngBounds = new LatLngBounds(zza3, zza4);
                    }
                }
                latLngBounds = null;
            } else {
                latLng = null;
                latLngBounds = null;
            }
            String zzo = zzbx.zzo();
            Uri parse = zzo != null ? Uri.parse(zzo) : null;
            Builder phoneNumber = builder.setAddress(zzbx.zzb()).setAddressComponents(addressComponents).setId(zzbx.zzh()).setLatLng(latLng).setName(zzbx.zze()).setPhoneNumber(zzbx.zzd());
            zzgv zzg = zzbx.zzg();
            if (zzg != null) {
                list2 = new ArrayList();
                int size2 = zzg.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj3 = zzg.get(i5);
                    i5++;
                    zzd zzd = (zzd) obj3;
                    if (zzd == null) {
                        obj = null;
                    } else if (!TextUtils.isEmpty(zzd.zzc())) {
                        Integer zza5 = zzd.zza();
                        Integer zzb2 = zzd.zzb();
                        PhotoMetadata.Builder builder2 = PhotoMetadata.builder(zzd.zzc());
                        zzgv zzd2 = zzd.zzd();
                        PhotoMetadata.Builder attributions = builder2.setAttributions((zzd2 == null || zzd2.isEmpty()) ? "" : zzfz.zza(", ").zza().zza((Iterable<?>) zzd2));
                        if (zza5 == null) {
                            i = 0;
                        } else {
                            i = zza5.intValue();
                        }
                        PhotoMetadata.Builder height = attributions.setHeight(i);
                        if (zzb2 == null) {
                            i2 = 0;
                        } else {
                            i2 = zzb2.intValue();
                        }
                        obj = height.setWidth(i2).build();
                    } else {
                        throw zzb("Photo reference not provided for a PhotoMetadata result.");
                    }
                    zza((Collection<T>) list2, (T) obj);
                }
            } else {
                list2 = null;
            }
            Builder photoMetadatas = phoneNumber.setPhotoMetadatas(list2);
            zzc zzf = zzbx.zzf();
            if (zzf != null) {
                OpeningHours.Builder builder3 = OpeningHours.builder();
                zzgv zza6 = zzf.zza();
                if (zza6 != null) {
                    list3 = new ArrayList();
                    int size3 = zza6.size();
                    while (i3 < size3) {
                        Object obj4 = zza6.get(i3);
                        i3++;
                        zza zza7 = (zza) obj4;
                        zza((Collection<T>) list3, (T) zza7 != null ? Period.builder().setOpen(zza(zza7.zzb())).setClose(zza(zza7.zza())).build() : null);
                    }
                } else {
                    list3 = null;
                }
                openingHours = builder3.setPeriods(zzb(list3)).setWeekdayText(zzb((List<T>) zzf.zzb())).build();
            } else {
                openingHours = null;
            }
            Builder openingHours2 = photoMetadatas.setOpeningHours(openingHours);
            zze zzi = zzbx.zzi();
            if (zzi != null) {
                plusCode = PlusCode.builder().setCompoundCode(zzi.zza()).setGlobalCode(zzi.zzb()).build();
            }
            openingHours2.setPlusCode(plusCode).setPriceLevel(zzbx.zzj()).setRating(zzbx.zzk()).setTypes(zza((List<String>) zzbx.zzl())).setUserRatingsTotal(zzbx.zzm()).setUtcOffsetMinutes(zzbx.zzn()).setViewport(latLngBounds).setWebsiteUri(parse);
        }
        return builder.build();
    }

    private static ApiException zzb(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Unexpected server error: ";
        return new ApiException(new Status(8, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)));
    }

    static <T> List<T> zzb(List<T> list) {
        return list != null ? list : new ArrayList();
    }

    private static AddressComponent zza(zzb zzb) throws ApiException {
        if (zzb == null) {
            return null;
        }
        try {
            return AddressComponent.builder(zzb.zza(), zzb.zzc()).setShortName(zzb.zzb()).build();
        } catch (IllegalStateException | NullPointerException e) {
            throw zzb(String.format("AddressComponent not properly defined (%s).", new Object[]{e.getMessage()}));
        }
    }

    private static TimeOfWeek zza(zzb zzb) {
        DayOfWeek dayOfWeek;
        if (zzb == null) {
            return null;
        }
        boolean z = true;
        zzgg.zza(zzb.zza() != null, (Object) "Unable to convert Pablo response to TimeOfWeek: The \"day\" field is missing.");
        if (zzb.zzb() == null) {
            z = false;
        }
        zzgg.zza(z, (Object) "Unable to convert Pablo response to TimeOfWeek: The \"time\" field is missing.");
        switch (zzb.zza().intValue()) {
            case 0:
                dayOfWeek = DayOfWeek.SUNDAY;
                break;
            case 1:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case 2:
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case 3:
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case 4:
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case 5:
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case 6:
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
            default:
                throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
        }
        return TimeOfWeek.newInstance(dayOfWeek, zza(zzb.zzb()));
    }

    private static LocalTime zza(String str) {
        if (str == null) {
            return null;
        }
        boolean z = true;
        String format = String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", new Object[]{str});
        if (str.length() != 4) {
            z = false;
        }
        zzgg.zza(z, (Object) format);
        try {
            return LocalTime.newInstance(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(format, e);
        }
    }

    static List<Type> zza(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str : list) {
            if (zza.containsKey(str)) {
                arrayList.add((Type) zza.get(str));
            } else {
                z = true;
            }
        }
        if (z) {
            arrayList.add(Type.OTHER);
        }
        return arrayList;
    }

    private static LatLng zza(zzb zzb) {
        if (zzb == null || zzb.zza() == null || zzb.zzb() == null) {
            return null;
        }
        return new LatLng(zzb.zza().doubleValue(), zzb.zzb().doubleValue());
    }

    private static <T> boolean zza(Collection<T> collection, T t) {
        if (t != null) {
            return collection.add(t);
        }
        return false;
    }
}
