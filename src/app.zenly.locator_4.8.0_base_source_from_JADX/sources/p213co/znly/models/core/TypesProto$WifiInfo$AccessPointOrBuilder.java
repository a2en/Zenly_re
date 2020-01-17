package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.core.C7230u2.C7231a;

/* renamed from: co.znly.models.core.TypesProto$WifiInfo$AccessPointOrBuilder */
public interface TypesProto$WifiInfo$AccessPointOrBuilder extends MessageLiteOrBuilder {
    String getBSSID();

    ByteString getBSSIDBytes();

    C7231a getBand();

    int getBandValue();

    boolean getIsConnected();

    int getRssi();

    String getSSID();

    ByteString getSSIDBytes();
}
