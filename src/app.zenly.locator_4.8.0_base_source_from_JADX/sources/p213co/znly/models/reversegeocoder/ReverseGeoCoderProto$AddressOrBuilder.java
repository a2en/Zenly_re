package p213co.znly.models.reversegeocoder;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$AddressOrBuilder */
public interface ReverseGeoCoderProto$AddressOrBuilder extends MessageLiteOrBuilder {
    String getAdministrativeArea();

    ByteString getAdministrativeAreaBytes();

    String getCountry();

    ByteString getCountryBytes();

    String getFormattedAddress();

    ByteString getFormattedAddressBytes();

    String getIsoCountryCode();

    ByteString getIsoCountryCodeBytes();

    String getLocality();

    ByteString getLocalityBytes();

    String getName();

    ByteString getNameBytes();

    String getNeighbourhood();

    ByteString getNeighbourhoodBytes();

    String getPostalCode();

    ByteString getPostalCodeBytes();

    String getStreet();

    ByteString getStreetBytes();

    String getStreetNumber();

    ByteString getStreetNumberBytes();

    String getSubAdministrativeArea();

    ByteString getSubAdministrativeAreaBytes();
}
