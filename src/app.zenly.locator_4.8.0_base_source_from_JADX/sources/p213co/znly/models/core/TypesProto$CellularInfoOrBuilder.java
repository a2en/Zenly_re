package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.TypesProto$CellularInfoOrBuilder */
public interface TypesProto$CellularInfoOrBuilder extends MessageLiteOrBuilder {
    boolean getIsRoaming();

    String getNetworkCountryIso();

    ByteString getNetworkCountryIsoBytes();

    String getNetworkOperatorCode();

    ByteString getNetworkOperatorCodeBytes();

    String getNetworkOperatorName();

    ByteString getNetworkOperatorNameBytes();

    C7266z1 getNetworkType();

    int getNetworkTypeValue();

    String getSimCountryIso();

    ByteString getSimCountryIsoBytes();

    String getSimOperatorCode();

    ByteString getSimOperatorCodeBytes();

    String getSimOperatorName();

    ByteString getSimOperatorNameBytes();
}
