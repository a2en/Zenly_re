package zenly.protobuf.protomodels;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

public interface Crypto$BoxKeysOrBuilder extends MessageLiteOrBuilder {
    ByteString getPrivate();

    ByteString getPublic();
}
