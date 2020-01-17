package p213co.znly.models.places;

import com.android.volley.toolbox.C8733j;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.places.d */
public enum C7875d implements EnumLite {
    UNKNOWN(0),
    DINING_NIGHTLIFE_RESTAURANTS_AMERICANCUISINE(6006),
    DINING_NIGHTLIFE_RESTAURANTS_CASUALDININGRESTAURANTS(6007),
    DINING_NIGHTLIFE_JUICE_SMOOTHIESHOPS(6004),
    DINING_NIGHTLIFE_RESTAURANTS(6005),
    DINING_NIGHTLIFE_CAFES_COFFEESHOPS(6002),
    DINING_NIGHTLIFE_DONUTSHOPS(6003),
    DINING_NIGHTLIFE(6000),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS(6001),
    DINING_NIGHTLIFE_RESTAURANTS_CHINESECUISINE(6008),
    DINING_NIGHTLIFE_RESTAURANTS_FASTFOODRESTAURANTS(6009),
    RESIDENTIAL(13000),
    SPORT_RECREATION_SPORTSTADIUMS_ARENAS_BASKETBALLARENAS(15006),
    DINING_NIGHTLIFE_RESTAURANTS_FRENCHCUISINE(6011),
    DINING_NIGHTLIFE_RESTAURANTS_FINEDININGRESTAURANTS(6010),
    DINING_NIGHTLIFE_RESTAURANTS_ITALIANCUISINE(6013),
    DINING_NIGHTLIFE_RESTAURANTS_INDIANCUISINE(6012),
    DINING_NIGHTLIFE_RESTAURANTS_KOREANCUISINE(6015),
    DINING_NIGHTLIFE_RESTAURANTS_JAPANESECUISINE(6014),
    DINING_NIGHTLIFE_RESTAURANTS_PIZZARESTAURANTS(6017),
    DINING_NIGHTLIFE_RESTAURANTS_MEXICANCUISINE(6016),
    DINING_NIGHTLIFE_RESTAURANTS_VIETNAMESECUISINE(6019),
    DINING_NIGHTLIFE_RESTAURANTS_THAICUISINE(6018),
    SPORT_RECREATION_SPORTSTADIUMS_ARENAS_BASEBALLSTADIUMS(15005),
    SPORT_RECREATION_SPORTSTADIUMS_ARENAS(15004),
    SPORT_RECREATION_SPORTINGGOODSSTORES(15003),
    SPORT_RECREATION_GYMS_FITNESSCENTERS(15002),
    SPORT_RECREATION_GOLFCOURSES(15001),
    SPORT_RECREATION(15000),
    GROCERY_HOUSEHOLD_CANDY_CHOCOLATESTORES(PlacesStatusCodes.OVER_QUERY_LIMIT),
    GROCERY_HOUSEHOLD_HEALTH_DIETFOODSTORES(PlacesStatusCodes.REQUEST_DENIED),
    TRAVEL_HOTELS_ACCOMMODATIONS(16005),
    COMMUNITY_GOVT_PLACESOFWORSHIP(5003),
    COMMUNITY_GOVT_LIBRARIES(5002),
    COMMUNITY_GOVT_GOVERNMENTBUILDINGS(5001),
    COMMUNITY_GOVT(5000),
    COMMUNITY_GOVT_CHARITY_NON_PROFITORGANIZATIONS(5007),
    COMMUNITY_GOVT_MILITARYBASES(5006),
    COMMUNITY_GOVT_POSTOFFICES(5005),
    COMMUNITY_GOVT_POLICE_EMERGENCYSERVICES(5004),
    GROCERY_HOUSEHOLD_MEAT_SEAFOODSTORES(9005),
    GROCERY_HOUSEHOLD_GROCERYSTORES_SUPERMARKETS(9004),
    GROCERY_HOUSEHOLD_FARMERSMARKETS(9003),
    GROCERY_HOUSEHOLD_BEER_WINE_SPIRITS(9002),
    GROCERY_HOUSEHOLD_BAKERIES(9001),
    GROCERY_HOUSEHOLD(9000),
    LOCALSERVICES_PET_ANIMALSERVICES(11003),
    LOCALSERVICES_PARTY_EVENTPLANNING(11002),
    LOCALSERVICES_FLORISTS(11001),
    LOCALSERVICES(11000),
    LOCALSERVICES_LEGALSERVICES(11007),
    LOCALSERVICES_GASSTATIONS(11006),
    LOCALSERVICES_REALESTATESERVICES(11005),
    LOCALSERVICES_PHOTOSERVICES(11004),
    PUBLICPLACES_ZOOS_AQUARIUMS(12006),
    PUBLICPLACES_CONVENTIONCENTERS(12007),
    BEAUTY_PERSONALCARE_PIERCINGSALONS(3010),
    LOCALSERVICES_HOMEIMPROVEMENTSERVICES(11008),
    PUBLICPLACES_CAMPING_RECREATIONALAREAS(12002),
    PUBLICPLACES_LAKES_RIVERS(12003),
    PUBLICPLACES(12000),
    PUBLICPLACES_BEACHES(12001),
    TRAVEL_TRAVELAGENTS_TOUROPERATIONS(16011),
    TRAVEL_PARKINGLOTS_FACILITIES(16010),
    TRAVEL_WINERIES_VINEYARDS(16012),
    ARTS_ENTERTAINMENT_BOWLINGALLEYS(1009),
    ARTS_ENTERTAINMENT_GAMINGARCADES(1008),
    ARTS_ENTERTAINMENT_COUNTRYCLUBS(1007),
    ARTS_ENTERTAINMENT_CASINOS(1006),
    ARTS_ENTERTAINMENT_PERFORMINGARTSVENUES(1005),
    ARTS_ENTERTAINMENT_MUSICVENUES(1004),
    ARTS_ENTERTAINMENT_MOVIETHEATERS(1003),
    ARTS_ENTERTAINMENT_GALLERIES_MUSEUMS(1002),
    ARTS_ENTERTAINMENT_COMEDYCLUBS(1001),
    ARTS_ENTERTAINMENT(C8733j.DEFAULT_IMAGE_TIMEOUT_MS),
    SHOPPING_PETSUPPLYSTORES(14031),
    SHOPPING_LIQUORSTORES(14030),
    SHOPPING_HOUSEWARESSTORES(14033),
    SHOPPING_HOMEAPPLIANCESTORES(14032),
    SHOPPING_MUSIC_VIDEOSTORES(14035),
    SHOPPING_ART_DESIGNSTORES(14034),
    BEAUTY_PERSONALCARE_NAILSALONS(3005),
    BEAUTY_PERSONALCARE_HAIRSALONS(3004),
    BEAUTY_PERSONALCARE_SPA_MASSAGE(3007),
    BEAUTY_PERSONALCARE_PERFUMES_FRAGRANCE(3006),
    BEAUTY_PERSONALCARE_BARBERS(3001),
    BEAUTY_PERSONALCARE(3000),
    BEAUTY_PERSONALCARE_HAIRREMOVALCENTERS(3003),
    BEAUTY_PERSONALCARE_COSMETICS_BEAUTYSUPPLY(3002),
    BEAUTY_PERSONALCARE_TATTOOPARLORS(3009),
    BEAUTY_PERSONALCARE_TANNINGFACILITIES(3008),
    SPORT_RECREATION_SPORTSTADIUMS_ARENAS_SOCCERSTADIUMS(15009),
    SPORT_RECREATION_SPORTSTADIUMS_ARENAS_FOOTBALLSTADIUMS(15008),
    SHOPPING_DISCOUNTSTORES(14019),
    SHOPPING_DEPARTMENTSTORES(14018),
    LOCALSERVICES_STORAGESERVICES(11010),
    TRAVEL_BUSTRANSIT(16002),
    TRAVEL_CARRENTAL(16003),
    TRAVEL(16000),
    TRAVEL_AIRPORTS(16001),
    TRAVEL_PORTS_MARINAS(16006),
    TRAVEL_RAILTRANSIT(16007),
    TRAVEL_CRUISESHIPS(16004),
    SHOPPING_CONSUMERELECTRONICSSTORES(14016),
    TRAVEL_TAXI_CARSERVICES(16008),
    TRAVEL_THEMEPARKS(16009),
    SPORT_RECREATION_SPORTSTADIUMS_ARENAS_HOCKEYARENAS(15007),
    SHOPPING_MALLS_SHOPPINGCENTERS(14022),
    SHOPPING_OFFICESUPPLYSTORES(14023),
    SHOPPING_FURNITURESTORES(14020),
    SHOPPING_HOME_GARDENSTORES(14021),
    SHOPPING_VIDEOGAMESTORES(14026),
    SHOPPING_TOYSTORES(14027),
    SHOPPING_PARTYSUPPLYSTORES(14024),
    SHOPPING_PHARMACIES(14025),
    SHOPPING_BIGBOX_SUPERSTORES(14013),
    SHOPPING_WAREHOUSESTORES(14028),
    SHOPPING_WEDDING_BRIDALSTORES(14029),
    SPORT_RECREATION_SKIAREAS_RESORTS(15010),
    SPORT_RECREATION_YOGA_PILATESSTUDIOS(15011),
    EDUCATION_COLLEGES_UNIVERSITIES(7001),
    EDUCATION(7000),
    EDUCATION_DAYCARE_PRESCHOOLS(7003),
    EDUCATION_HIGHSCHOOLS(7002),
    EDUCATION_PRIMARYSCHOOLS(7005),
    EDUCATION_VOCATIONALSCHOOLS(7004),
    EDUCATION_MIDDLESCHOOLS(7006),
    PUBLICPLACES_PARKS_DOGPARKS(12008),
    PUBLICPLACES_SWIMMINGPOOLS(12009),
    LOCALSERVICES_PET_ANIMALSERVICES_VETERINARIANOFFICES(11009),
    HEALTH_MEDICAL_HOSPITALS_TREATMENTCENTERS(10004),
    HEALTH_MEDICAL_REHABCENTERS(10005),
    HEALTH_MEDICAL_VISIONSERVICES(10006),
    HEALTH_MEDICAL_WEIGHTLOSSCENTERS(10007),
    HEALTH_MEDICAL(10000),
    HEALTH_MEDICAL_COSMETICSURGEONS(10001),
    HEALTH_MEDICAL_DENTIST_SOFFICES(10002),
    HEALTH_MEDICAL_DOCTOR_SOFFICES(10003),
    SHOPPING_CONVENIENCESTORES(14017),
    PUBLICPLACES_LANDMARKS_MONUMENTS(12004),
    SHOPPING_CELLPHONESTORES(14015),
    SHOPPING_BOOKSTORES(14014),
    HEALTH_MEDICAL_ALTERNATIVEMEDICINEPRACTICES(10008),
    SHOPPING_BABYSTORES(14012),
    SHOPPING_APPARELSTORES_WOMEN_SAPPAREL(14011),
    SHOPPING_APPARELSTORES_MEN_SAPPAREL(14010),
    PUBLICPLACES_PARKS(12005),
    BUSINESS_OFFICE(4000),
    DINING_NIGHTLIFE_RESTAURANTS_MIDDLEEASTERNCUISINE(6028),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_KARAOKEVENUES(6029),
    DINING_NIGHTLIFE_SWEET_DESSERTSHOPS(6020),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS(6021),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_NIGHTCLUBS(6022),
    DINING_NIGHTLIFE_BREWERIES(6023),
    DINING_NIGHTLIFE_RESTAURANTS_BBQRESTAURANTS(6024),
    DINING_NIGHTLIFE_RESTAURANTS_DELIS(6025),
    DINING_NIGHTLIFE_RESTAURANTS_VEGETARIAN_VEGANCUISINES(6026),
    DINING_NIGHTLIFE_RESTAURANTS_SEAFOODRESTAURANTS(6027),
    SHOPPING_APPARELSTORES_LINGERIE_UNDERGARMENTS(14008),
    SHOPPING_APPARELSTORES_LUXURYAPPAREL(14009),
    SHOPPING(14000),
    SHOPPING_APPARELSTORES(14001),
    SHOPPING_APPARELSTORES_ATHLETICAPPAREL(14002),
    SHOPPING_APPARELSTORES_CHILDREN_SAPPAREL(14003),
    SHOPPING_APPARELSTORES_EYEWEAR(14004),
    SHOPPING_APPARELSTORES_FASHIONACCESSORIES(14005),
    SHOPPING_APPARELSTORES_FOOTWEAR(14006),
    SHOPPING_APPARELSTORES_JEWELRY_WATCHES(14007),
    FINANCIALSERVICES_INSURANCECOMPANIES(8004),
    FINANCIALSERVICES_INVESTMENTSERVICES(8005),
    FINANCIALSERVICES_TAXSERVICES(8006),
    FINANCIALSERVICES(8000),
    FINANCIALSERVICES_ATMS(8001),
    FINANCIALSERVICES_BANKS_CREDITUNIONS(8002),
    FINANCIALSERVICES_CHECKCASHING_PAYDAYLOANS(8003),
    AUTOS_VEHICLES_CARDEALERS(2002),
    AUTOS_VEHICLES_CARREPAIR(2003),
    AUTOS_VEHICLES(2000),
    AUTOS_VEHICLES_BICYCLESHOPS(2001),
    AUTOS_VEHICLES_MOTORCYCLEDEALERS(2004),
    AUTOS_VEHICLES_CARPARTS_ACCESSORIES(2005),
    DINING_NIGHTLIFE_SWEET_DESSERTSHOPS_ICECREAMSHOPS(6032),
    DINING_NIGHTLIFE_RESTAURANTS_BURGERRESTAURANTS(6031),
    DINING_NIGHTLIFE_RESTAURANTS_STEAKHOUSES(6030),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_BEACHBAR(6101),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_BEERBAR(6102),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_BEERGARDEN(6103),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_CHAMPAGNEBAR(6104),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_COCKTAILBAR(6105),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_DIVEBAR(6106),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_GAYBAR(6107),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_HOOKAHBAR(6108),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_HOTELBAR(6109),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_KARAOKEBAR(6110),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_PUB(6111),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_SAKEBAR(6112),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_SPEAKEASY(6113),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_SPORTSBAR(6114),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_TIKIBAR(6115),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_WHISKYBAR(6116),
    DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_WINEBAR(6117),
    ARTS_ENTERTAINMENT_PERFORMINGARTSVENUES_OPERAHOUSE(1101),
    ARTS_ENTERTAINMENT_PERFORMINGARTSVENUES_THEATER(1102),
    ARTS_ENTERTAINMENT_PERFORMINGARTSVENUES_INDIETHEATER(1103),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f19925e;

    /* renamed from: co.znly.models.places.d$a */
    class C7876a implements EnumLiteMap<C7875d> {
        C7876a() {
        }

        public C7875d findValueByNumber(int i) {
            return C7875d.m18941a(i);
        }
    }

    static {
        new C7876a();
    }

    private C7875d(int i) {
        this.f19925e = i;
    }

    /* renamed from: a */
    public static C7875d m18941a(int i) {
        if (i != 0) {
            switch (i) {
                case 0:
                    break;
                case 4000:
                    return BUSINESS_OFFICE;
                case 6000:
                    return DINING_NIGHTLIFE;
                case 6001:
                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS;
                case 6002:
                    return DINING_NIGHTLIFE_CAFES_COFFEESHOPS;
                case 6003:
                    return DINING_NIGHTLIFE_DONUTSHOPS;
                case 6004:
                    return DINING_NIGHTLIFE_JUICE_SMOOTHIESHOPS;
                case 6005:
                    return DINING_NIGHTLIFE_RESTAURANTS;
                case 6006:
                    return DINING_NIGHTLIFE_RESTAURANTS_AMERICANCUISINE;
                case 6007:
                    return DINING_NIGHTLIFE_RESTAURANTS_CASUALDININGRESTAURANTS;
                case 6008:
                    return DINING_NIGHTLIFE_RESTAURANTS_CHINESECUISINE;
                case 6009:
                    return DINING_NIGHTLIFE_RESTAURANTS_FASTFOODRESTAURANTS;
                case 6010:
                    return DINING_NIGHTLIFE_RESTAURANTS_FINEDININGRESTAURANTS;
                case 6011:
                    return DINING_NIGHTLIFE_RESTAURANTS_FRENCHCUISINE;
                case 6012:
                    return DINING_NIGHTLIFE_RESTAURANTS_INDIANCUISINE;
                case 6013:
                    return DINING_NIGHTLIFE_RESTAURANTS_ITALIANCUISINE;
                case 6014:
                    return DINING_NIGHTLIFE_RESTAURANTS_JAPANESECUISINE;
                case 6015:
                    return DINING_NIGHTLIFE_RESTAURANTS_KOREANCUISINE;
                case 6016:
                    return DINING_NIGHTLIFE_RESTAURANTS_MEXICANCUISINE;
                case 6017:
                    return DINING_NIGHTLIFE_RESTAURANTS_PIZZARESTAURANTS;
                case 6018:
                    return DINING_NIGHTLIFE_RESTAURANTS_THAICUISINE;
                case 6019:
                    return DINING_NIGHTLIFE_RESTAURANTS_VIETNAMESECUISINE;
                case 6020:
                    return DINING_NIGHTLIFE_SWEET_DESSERTSHOPS;
                case 6021:
                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS;
                case 6022:
                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_NIGHTCLUBS;
                case 6023:
                    return DINING_NIGHTLIFE_BREWERIES;
                case 6024:
                    return DINING_NIGHTLIFE_RESTAURANTS_BBQRESTAURANTS;
                case 6025:
                    return DINING_NIGHTLIFE_RESTAURANTS_DELIS;
                case 6026:
                    return DINING_NIGHTLIFE_RESTAURANTS_VEGETARIAN_VEGANCUISINES;
                case 6027:
                    return DINING_NIGHTLIFE_RESTAURANTS_SEAFOODRESTAURANTS;
                case 6028:
                    return DINING_NIGHTLIFE_RESTAURANTS_MIDDLEEASTERNCUISINE;
                case 6029:
                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_KARAOKEVENUES;
                case 6030:
                    return DINING_NIGHTLIFE_RESTAURANTS_STEAKHOUSES;
                case 6031:
                    return DINING_NIGHTLIFE_RESTAURANTS_BURGERRESTAURANTS;
                case 6032:
                    return DINING_NIGHTLIFE_SWEET_DESSERTSHOPS_ICECREAMSHOPS;
                case PlacesStatusCodes.OVER_QUERY_LIMIT /*9010*/:
                    return GROCERY_HOUSEHOLD_CANDY_CHOCOLATESTORES;
                case PlacesStatusCodes.REQUEST_DENIED /*9011*/:
                    return GROCERY_HOUSEHOLD_HEALTH_DIETFOODSTORES;
                case 10000:
                    return HEALTH_MEDICAL;
                case 10001:
                    return HEALTH_MEDICAL_COSMETICSURGEONS;
                case 10002:
                    return HEALTH_MEDICAL_DENTIST_SOFFICES;
                case 10003:
                    return HEALTH_MEDICAL_DOCTOR_SOFFICES;
                case 10004:
                    return HEALTH_MEDICAL_HOSPITALS_TREATMENTCENTERS;
                case 10005:
                    return HEALTH_MEDICAL_REHABCENTERS;
                case 10006:
                    return HEALTH_MEDICAL_VISIONSERVICES;
                case 10007:
                    return HEALTH_MEDICAL_WEIGHTLOSSCENTERS;
                case 10008:
                    return HEALTH_MEDICAL_ALTERNATIVEMEDICINEPRACTICES;
                case 11000:
                    return LOCALSERVICES;
                case 11001:
                    return LOCALSERVICES_FLORISTS;
                case 11002:
                    return LOCALSERVICES_PARTY_EVENTPLANNING;
                case 11003:
                    return LOCALSERVICES_PET_ANIMALSERVICES;
                case 11004:
                    return LOCALSERVICES_PHOTOSERVICES;
                case 11005:
                    return LOCALSERVICES_REALESTATESERVICES;
                case 11006:
                    return LOCALSERVICES_GASSTATIONS;
                case 11007:
                    return LOCALSERVICES_LEGALSERVICES;
                case 11008:
                    return LOCALSERVICES_HOMEIMPROVEMENTSERVICES;
                case 11009:
                    return LOCALSERVICES_PET_ANIMALSERVICES_VETERINARIANOFFICES;
                case 11010:
                    return LOCALSERVICES_STORAGESERVICES;
                case 12000:
                    return PUBLICPLACES;
                case 12001:
                    return PUBLICPLACES_BEACHES;
                case 12002:
                    return PUBLICPLACES_CAMPING_RECREATIONALAREAS;
                case 12003:
                    return PUBLICPLACES_LAKES_RIVERS;
                case 12004:
                    return PUBLICPLACES_LANDMARKS_MONUMENTS;
                case 12005:
                    return PUBLICPLACES_PARKS;
                case 12006:
                    return PUBLICPLACES_ZOOS_AQUARIUMS;
                case 12007:
                    return PUBLICPLACES_CONVENTIONCENTERS;
                case 12008:
                    return PUBLICPLACES_PARKS_DOGPARKS;
                case 12009:
                    return PUBLICPLACES_SWIMMINGPOOLS;
                case 13000:
                    return RESIDENTIAL;
                case 14000:
                    return SHOPPING;
                case 14001:
                    return SHOPPING_APPARELSTORES;
                case 14002:
                    return SHOPPING_APPARELSTORES_ATHLETICAPPAREL;
                case 14003:
                    return SHOPPING_APPARELSTORES_CHILDREN_SAPPAREL;
                case 14004:
                    return SHOPPING_APPARELSTORES_EYEWEAR;
                case 14005:
                    return SHOPPING_APPARELSTORES_FASHIONACCESSORIES;
                case 14006:
                    return SHOPPING_APPARELSTORES_FOOTWEAR;
                case 14007:
                    return SHOPPING_APPARELSTORES_JEWELRY_WATCHES;
                case 14008:
                    return SHOPPING_APPARELSTORES_LINGERIE_UNDERGARMENTS;
                case 14009:
                    return SHOPPING_APPARELSTORES_LUXURYAPPAREL;
                case 14010:
                    return SHOPPING_APPARELSTORES_MEN_SAPPAREL;
                case 14011:
                    return SHOPPING_APPARELSTORES_WOMEN_SAPPAREL;
                case 14012:
                    return SHOPPING_BABYSTORES;
                case 14013:
                    return SHOPPING_BIGBOX_SUPERSTORES;
                case 14014:
                    return SHOPPING_BOOKSTORES;
                case 14015:
                    return SHOPPING_CELLPHONESTORES;
                case 14016:
                    return SHOPPING_CONSUMERELECTRONICSSTORES;
                case 14017:
                    return SHOPPING_CONVENIENCESTORES;
                case 14018:
                    return SHOPPING_DEPARTMENTSTORES;
                case 14019:
                    return SHOPPING_DISCOUNTSTORES;
                case 14020:
                    return SHOPPING_FURNITURESTORES;
                case 14021:
                    return SHOPPING_HOME_GARDENSTORES;
                case 14022:
                    return SHOPPING_MALLS_SHOPPINGCENTERS;
                case 14023:
                    return SHOPPING_OFFICESUPPLYSTORES;
                case 14024:
                    return SHOPPING_PARTYSUPPLYSTORES;
                case 14025:
                    return SHOPPING_PHARMACIES;
                case 14026:
                    return SHOPPING_VIDEOGAMESTORES;
                case 14027:
                    return SHOPPING_TOYSTORES;
                case 14028:
                    return SHOPPING_WAREHOUSESTORES;
                case 14029:
                    return SHOPPING_WEDDING_BRIDALSTORES;
                case 14030:
                    return SHOPPING_LIQUORSTORES;
                case 14031:
                    return SHOPPING_PETSUPPLYSTORES;
                case 14032:
                    return SHOPPING_HOMEAPPLIANCESTORES;
                case 14033:
                    return SHOPPING_HOUSEWARESSTORES;
                case 14034:
                    return SHOPPING_ART_DESIGNSTORES;
                case 14035:
                    return SHOPPING_MUSIC_VIDEOSTORES;
                case 15000:
                    return SPORT_RECREATION;
                case 15001:
                    return SPORT_RECREATION_GOLFCOURSES;
                case 15002:
                    return SPORT_RECREATION_GYMS_FITNESSCENTERS;
                case 15003:
                    return SPORT_RECREATION_SPORTINGGOODSSTORES;
                case 15004:
                    return SPORT_RECREATION_SPORTSTADIUMS_ARENAS;
                case 15005:
                    return SPORT_RECREATION_SPORTSTADIUMS_ARENAS_BASEBALLSTADIUMS;
                case 15006:
                    return SPORT_RECREATION_SPORTSTADIUMS_ARENAS_BASKETBALLARENAS;
                case 15007:
                    return SPORT_RECREATION_SPORTSTADIUMS_ARENAS_HOCKEYARENAS;
                case 15008:
                    return SPORT_RECREATION_SPORTSTADIUMS_ARENAS_FOOTBALLSTADIUMS;
                case 15009:
                    return SPORT_RECREATION_SPORTSTADIUMS_ARENAS_SOCCERSTADIUMS;
                case 15010:
                    return SPORT_RECREATION_SKIAREAS_RESORTS;
                case 15011:
                    return SPORT_RECREATION_YOGA_PILATESSTUDIOS;
                case 16000:
                    return TRAVEL;
                case 16001:
                    return TRAVEL_AIRPORTS;
                case 16002:
                    return TRAVEL_BUSTRANSIT;
                case 16003:
                    return TRAVEL_CARRENTAL;
                case 16004:
                    return TRAVEL_CRUISESHIPS;
                case 16005:
                    return TRAVEL_HOTELS_ACCOMMODATIONS;
                case 16006:
                    return TRAVEL_PORTS_MARINAS;
                case 16007:
                    return TRAVEL_RAILTRANSIT;
                case 16008:
                    return TRAVEL_TAXI_CARSERVICES;
                case 16009:
                    return TRAVEL_THEMEPARKS;
                case 16010:
                    return TRAVEL_PARKINGLOTS_FACILITIES;
                case 16011:
                    return TRAVEL_TRAVELAGENTS_TOUROPERATIONS;
                case 16012:
                    return TRAVEL_WINERIES_VINEYARDS;
                default:
                    switch (i) {
                        case C8733j.DEFAULT_IMAGE_TIMEOUT_MS /*1000*/:
                            return ARTS_ENTERTAINMENT;
                        case 1001:
                            return ARTS_ENTERTAINMENT_COMEDYCLUBS;
                        case 1002:
                            return ARTS_ENTERTAINMENT_GALLERIES_MUSEUMS;
                        case 1003:
                            return ARTS_ENTERTAINMENT_MOVIETHEATERS;
                        case 1004:
                            return ARTS_ENTERTAINMENT_MUSICVENUES;
                        case 1005:
                            return ARTS_ENTERTAINMENT_PERFORMINGARTSVENUES;
                        case 1006:
                            return ARTS_ENTERTAINMENT_CASINOS;
                        case 1007:
                            return ARTS_ENTERTAINMENT_COUNTRYCLUBS;
                        case 1008:
                            return ARTS_ENTERTAINMENT_GAMINGARCADES;
                        case 1009:
                            return ARTS_ENTERTAINMENT_BOWLINGALLEYS;
                        default:
                            switch (i) {
                                case 1101:
                                    return ARTS_ENTERTAINMENT_PERFORMINGARTSVENUES_OPERAHOUSE;
                                case 1102:
                                    return ARTS_ENTERTAINMENT_PERFORMINGARTSVENUES_THEATER;
                                case 1103:
                                    return ARTS_ENTERTAINMENT_PERFORMINGARTSVENUES_INDIETHEATER;
                                default:
                                    switch (i) {
                                        case 2000:
                                            return AUTOS_VEHICLES;
                                        case 2001:
                                            return AUTOS_VEHICLES_BICYCLESHOPS;
                                        case 2002:
                                            return AUTOS_VEHICLES_CARDEALERS;
                                        case 2003:
                                            return AUTOS_VEHICLES_CARREPAIR;
                                        case 2004:
                                            return AUTOS_VEHICLES_MOTORCYCLEDEALERS;
                                        case 2005:
                                            return AUTOS_VEHICLES_CARPARTS_ACCESSORIES;
                                        default:
                                            switch (i) {
                                                case 3000:
                                                    return BEAUTY_PERSONALCARE;
                                                case 3001:
                                                    return BEAUTY_PERSONALCARE_BARBERS;
                                                case 3002:
                                                    return BEAUTY_PERSONALCARE_COSMETICS_BEAUTYSUPPLY;
                                                case 3003:
                                                    return BEAUTY_PERSONALCARE_HAIRREMOVALCENTERS;
                                                case 3004:
                                                    return BEAUTY_PERSONALCARE_HAIRSALONS;
                                                case 3005:
                                                    return BEAUTY_PERSONALCARE_NAILSALONS;
                                                case 3006:
                                                    return BEAUTY_PERSONALCARE_PERFUMES_FRAGRANCE;
                                                case 3007:
                                                    return BEAUTY_PERSONALCARE_SPA_MASSAGE;
                                                case 3008:
                                                    return BEAUTY_PERSONALCARE_TANNINGFACILITIES;
                                                case 3009:
                                                    return BEAUTY_PERSONALCARE_TATTOOPARLORS;
                                                case 3010:
                                                    return BEAUTY_PERSONALCARE_PIERCINGSALONS;
                                                default:
                                                    switch (i) {
                                                        case 5000:
                                                            return COMMUNITY_GOVT;
                                                        case 5001:
                                                            return COMMUNITY_GOVT_GOVERNMENTBUILDINGS;
                                                        case 5002:
                                                            return COMMUNITY_GOVT_LIBRARIES;
                                                        case 5003:
                                                            return COMMUNITY_GOVT_PLACESOFWORSHIP;
                                                        case 5004:
                                                            return COMMUNITY_GOVT_POLICE_EMERGENCYSERVICES;
                                                        case 5005:
                                                            return COMMUNITY_GOVT_POSTOFFICES;
                                                        case 5006:
                                                            return COMMUNITY_GOVT_MILITARYBASES;
                                                        case 5007:
                                                            return COMMUNITY_GOVT_CHARITY_NON_PROFITORGANIZATIONS;
                                                        default:
                                                            switch (i) {
                                                                case 6101:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_BEACHBAR;
                                                                case 6102:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_BEERBAR;
                                                                case 6103:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_BEERGARDEN;
                                                                case 6104:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_CHAMPAGNEBAR;
                                                                case 6105:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_COCKTAILBAR;
                                                                case 6106:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_DIVEBAR;
                                                                case 6107:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_GAYBAR;
                                                                case 6108:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_HOOKAHBAR;
                                                                case 6109:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_HOTELBAR;
                                                                case 6110:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_KARAOKEBAR;
                                                                case 6111:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_PUB;
                                                                case 6112:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_SAKEBAR;
                                                                case 6113:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_SPEAKEASY;
                                                                case 6114:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_SPORTSBAR;
                                                                case 6115:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_TIKIBAR;
                                                                case 6116:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_WHISKYBAR;
                                                                case 6117:
                                                                    return DINING_NIGHTLIFE_BARS_NIGHTCLUBS_BARS_WINEBAR;
                                                                default:
                                                                    switch (i) {
                                                                        case 7000:
                                                                            return EDUCATION;
                                                                        case 7001:
                                                                            return EDUCATION_COLLEGES_UNIVERSITIES;
                                                                        case 7002:
                                                                            return EDUCATION_HIGHSCHOOLS;
                                                                        case 7003:
                                                                            return EDUCATION_DAYCARE_PRESCHOOLS;
                                                                        case 7004:
                                                                            return EDUCATION_VOCATIONALSCHOOLS;
                                                                        case 7005:
                                                                            return EDUCATION_PRIMARYSCHOOLS;
                                                                        case 7006:
                                                                            return EDUCATION_MIDDLESCHOOLS;
                                                                        default:
                                                                            switch (i) {
                                                                                case 8000:
                                                                                    return FINANCIALSERVICES;
                                                                                case 8001:
                                                                                    return FINANCIALSERVICES_ATMS;
                                                                                case 8002:
                                                                                    return FINANCIALSERVICES_BANKS_CREDITUNIONS;
                                                                                case 8003:
                                                                                    return FINANCIALSERVICES_CHECKCASHING_PAYDAYLOANS;
                                                                                case 8004:
                                                                                    return FINANCIALSERVICES_INSURANCECOMPANIES;
                                                                                case 8005:
                                                                                    return FINANCIALSERVICES_INVESTMENTSERVICES;
                                                                                case 8006:
                                                                                    return FINANCIALSERVICES_TAXSERVICES;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 9000:
                                                                                            return GROCERY_HOUSEHOLD;
                                                                                        case 9001:
                                                                                            return GROCERY_HOUSEHOLD_BAKERIES;
                                                                                        case 9002:
                                                                                            return GROCERY_HOUSEHOLD_BEER_WINE_SPIRITS;
                                                                                        case 9003:
                                                                                            return GROCERY_HOUSEHOLD_FARMERSMARKETS;
                                                                                        case 9004:
                                                                                            return GROCERY_HOUSEHOLD_GROCERYSTORES_SUPERMARKETS;
                                                                                        case 9005:
                                                                                            return GROCERY_HOUSEHOLD_MEAT_SEAFOODSTORES;
                                                                                        default:
                                                                                            return null;
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
        return UNKNOWN;
    }

    public final int getNumber() {
        return this.f19925e;
    }
}
