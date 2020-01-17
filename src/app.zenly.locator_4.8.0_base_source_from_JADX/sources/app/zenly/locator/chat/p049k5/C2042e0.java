package app.zenly.locator.chat.p049k5;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import app.zenly.locator.R;

/* renamed from: app.zenly.locator.chat.k5.e0 */
/* compiled from: lambda */
public final /* synthetic */ class C2042e0 implements OnEditorActionListener {

    /* renamed from: e */
    private final /* synthetic */ View f6464e;

    public /* synthetic */ C2042e0(View view) {
        this.f6464e = view;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.f6464e.findViewById(R.id.done).performClick();
    }
}
