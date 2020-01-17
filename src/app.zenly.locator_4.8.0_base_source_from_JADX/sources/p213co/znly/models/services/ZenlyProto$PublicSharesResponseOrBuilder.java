package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PublicShareProto$PublicShare;

/* renamed from: co.znly.models.services.ZenlyProto$PublicSharesResponseOrBuilder */
public interface ZenlyProto$PublicSharesResponseOrBuilder extends MessageLiteOrBuilder {
    int getLimit();

    int getOffset();

    PublicShareProto$PublicShare getPublicShares(int i);

    int getPublicSharesCount();

    List<PublicShareProto$PublicShare> getPublicSharesList();

    int getTotal();
}
