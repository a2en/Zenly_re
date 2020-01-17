package kotlin.reflect;

import java.util.Collection;

public interface KDeclarationContainer {
    Collection<KCallable<?>> getMembers();
}
