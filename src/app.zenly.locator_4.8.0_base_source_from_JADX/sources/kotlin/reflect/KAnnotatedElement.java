package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.util.List;

public interface KAnnotatedElement {
    List<Annotation> getAnnotations();
}
