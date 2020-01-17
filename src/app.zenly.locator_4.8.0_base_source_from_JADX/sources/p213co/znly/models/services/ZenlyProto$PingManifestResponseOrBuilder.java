package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$PingManifestResponseOrBuilder */
public interface ZenlyProto$PingManifestResponseOrBuilder extends MessageLiteOrBuilder {
    String getChecksum();

    ByteString getChecksumBytes();

    C8307u3 getDeprecated(int i);

    int getDeprecatedCount();

    List<C8307u3> getDeprecatedList();

    C8355w3 getPacks(int i);

    int getPacksCount();

    List<C8355w3> getPacksList();

    String getRootUrl();

    ByteString getRootUrlBytes();
}
