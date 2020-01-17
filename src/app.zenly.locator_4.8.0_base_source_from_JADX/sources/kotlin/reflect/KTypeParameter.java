package kotlin.reflect;

import java.util.List;

public interface KTypeParameter extends KClassifier {
    String getName();

    List<KType> getUpperBounds();

    C12975a getVariance();

    boolean isReified();
}
