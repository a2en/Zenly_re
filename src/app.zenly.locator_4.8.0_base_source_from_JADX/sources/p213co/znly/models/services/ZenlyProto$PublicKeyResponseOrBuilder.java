package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import zenly.protobuf.protomodels.C13835a;

/* renamed from: co.znly.models.services.ZenlyProto$PublicKeyResponseOrBuilder */
public interface ZenlyProto$PublicKeyResponseOrBuilder extends MessageLiteOrBuilder {
    C13835a getCipher();

    int getCipherValue();

    ByteString getPublicKey();
}
