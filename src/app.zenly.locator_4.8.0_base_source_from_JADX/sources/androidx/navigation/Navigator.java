package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.C0969j;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public abstract class Navigator<D extends C0969j> {

    public interface Extras {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.navigation.Navigator$a */
    public @interface C0945a {
        String value();
    }

    /* renamed from: a */
    public abstract D mo4653a();

    /* renamed from: a */
    public abstract C0969j mo4654a(D d, Bundle bundle, C0976o oVar, Extras extras);

    /* renamed from: a */
    public void mo4655a(Bundle bundle) {
    }

    /* renamed from: b */
    public Bundle mo4656b() {
        return null;
    }

    /* renamed from: c */
    public abstract boolean mo4657c();
}
