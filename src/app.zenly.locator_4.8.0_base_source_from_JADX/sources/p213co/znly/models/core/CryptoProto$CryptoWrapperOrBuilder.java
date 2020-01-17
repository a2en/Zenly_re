package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.CryptoProto$CryptoWrapperOrBuilder */
public interface CryptoProto$CryptoWrapperOrBuilder extends MessageLiteOrBuilder {
    ByteString getCiphertext();

    ByteString getNonce();

    ByteString getSalt();

    C7251x0 getVersion();

    int getVersionValue();
}
