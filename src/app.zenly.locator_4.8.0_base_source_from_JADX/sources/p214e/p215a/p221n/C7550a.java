package p214e.p215a.p221n;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: e.a.n.a */
public class C7550a implements TransformationMethod {

    /* renamed from: e */
    private Locale f18966e;

    public C7550a(Context context) {
        this.f18966e = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f18966e);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
