package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZendeskProto$ZendeskCategoryOrBuilder */
public interface ZendeskProto$ZendeskCategoryOrBuilder extends MessageLiteOrBuilder {
    String getComposerPlaceholder();

    ByteString getComposerPlaceholderBytes();

    String getComposerSubtitle();

    ByteString getComposerSubtitleBytes();

    String getId();

    ByteString getIdBytes();

    C8363x getSubcategories(int i);

    int getSubcategoriesCount();

    List<C8363x> getSubcategoriesList();

    String getSubtitle();

    ByteString getSubtitleBytes();

    String getTitle();

    ByteString getTitleBytes();
}
