package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZendeskProto$ZendeskGetProblemCategoriesResponseOrBuilder */
public interface ZendeskProto$ZendeskGetProblemCategoriesResponseOrBuilder extends MessageLiteOrBuilder {
    C8363x getCategories(int i);

    int getCategoriesCount();

    List<C8363x> getCategoriesList();

    C8056f0 getError();

    boolean hasError();
}
