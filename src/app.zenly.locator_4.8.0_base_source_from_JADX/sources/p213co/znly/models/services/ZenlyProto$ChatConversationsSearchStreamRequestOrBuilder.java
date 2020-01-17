package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationsSearchStreamRequestOrBuilder */
public interface ZenlyProto$ChatConversationsSearchStreamRequestOrBuilder extends MessageLiteOrBuilder {
    int getLimit();

    int getOffset();

    String getSearch();

    ByteString getSearchBytes();
}
