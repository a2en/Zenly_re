package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController.AlertParams;
import p214e.p215a.C7521a;

/* renamed from: androidx.appcompat.app.a */
public class C0122a extends C0125c implements DialogInterface {

    /* renamed from: e */
    final AlertController f361e = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0123a {

        /* renamed from: a */
        private final AlertParams f362a;

        /* renamed from: b */
        private final int f363b;

        public C0123a(Context context) {
            this(context, C0122a.m338a(context, 0));
        }

        /* renamed from: a */
        public C0123a mo534a(View view) {
            this.f362a.f214g = view;
            return this;
        }

        /* renamed from: b */
        public Context mo543b() {
            return this.f362a.f208a;
        }

        /* renamed from: c */
        public C0123a mo548c(int i) {
            AlertParams alertParams = this.f362a;
            alertParams.f213f = alertParams.f208a.getText(i);
            return this;
        }

        public C0123a(Context context, int i) {
            this.f362a = new AlertParams(new ContextThemeWrapper(context, C0122a.m338a(context, i)));
            this.f363b = i;
        }

        /* renamed from: a */
        public C0123a mo537a(CharSequence charSequence) {
            this.f362a.f215h = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0123a mo547b(CharSequence charSequence) {
            this.f362a.f213f = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0123a mo549c(int i, OnClickListener onClickListener) {
            AlertParams alertParams = this.f362a;
            alertParams.f216i = alertParams.f208a.getText(i);
            this.f362a.f218k = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0123a mo527a(int i) {
            this.f362a.f210c = i;
            return this;
        }

        /* renamed from: b */
        public C0123a mo544b(int i) {
            AlertParams alertParams = this.f362a;
            alertParams.f215h = alertParams.f208a.getText(i);
            return this;
        }

        /* renamed from: a */
        public C0123a mo533a(Drawable drawable) {
            this.f362a.f211d = drawable;
            return this;
        }

        /* renamed from: b */
        public C0123a mo545b(int i, OnClickListener onClickListener) {
            AlertParams alertParams = this.f362a;
            alertParams.f219l = alertParams.f208a.getText(i);
            this.f362a.f221n = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C0122a mo550c() {
            C0122a a = mo542a();
            a.show();
            return a;
        }

        /* renamed from: a */
        public C0123a mo538a(CharSequence charSequence, OnClickListener onClickListener) {
            AlertParams alertParams = this.f362a;
            alertParams.f216i = charSequence;
            alertParams.f218k = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0123a mo546b(View view) {
            AlertParams alertParams = this.f362a;
            alertParams.f233z = view;
            alertParams.f232y = 0;
            alertParams.f197E = false;
            return this;
        }

        /* renamed from: a */
        public C0123a mo539a(boolean z) {
            this.f362a.f225r = z;
            return this;
        }

        /* renamed from: a */
        public C0123a mo530a(OnCancelListener onCancelListener) {
            this.f362a.f226s = onCancelListener;
            return this;
        }

        /* renamed from: a */
        public C0123a mo531a(OnDismissListener onDismissListener) {
            this.f362a.f227t = onDismissListener;
            return this;
        }

        /* renamed from: a */
        public C0123a mo532a(OnKeyListener onKeyListener) {
            this.f362a.f228u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0123a mo529a(int i, OnClickListener onClickListener) {
            AlertParams alertParams = this.f362a;
            alertParams.f229v = alertParams.f208a.getResources().getTextArray(i);
            this.f362a.f231x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0123a mo541a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
            AlertParams alertParams = this.f362a;
            alertParams.f229v = charSequenceArr;
            alertParams.f231x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0123a mo536a(ListAdapter listAdapter, OnClickListener onClickListener) {
            AlertParams alertParams = this.f362a;
            alertParams.f230w = listAdapter;
            alertParams.f231x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0123a mo528a(int i, int i2, OnClickListener onClickListener) {
            AlertParams alertParams = this.f362a;
            alertParams.f229v = alertParams.f208a.getResources().getTextArray(i);
            AlertParams alertParams2 = this.f362a;
            alertParams2.f231x = onClickListener;
            alertParams2.f201I = i2;
            alertParams2.f200H = true;
            return this;
        }

        /* renamed from: a */
        public C0123a mo540a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
            AlertParams alertParams = this.f362a;
            alertParams.f229v = charSequenceArr;
            alertParams.f231x = onClickListener;
            alertParams.f201I = i;
            alertParams.f200H = true;
            return this;
        }

        /* renamed from: a */
        public C0123a mo535a(ListAdapter listAdapter, int i, OnClickListener onClickListener) {
            AlertParams alertParams = this.f362a;
            alertParams.f230w = listAdapter;
            alertParams.f231x = onClickListener;
            alertParams.f201I = i;
            alertParams.f200H = true;
            return this;
        }

        /* renamed from: a */
        public C0122a mo542a() {
            C0122a aVar = new C0122a(this.f362a.f208a, this.f363b);
            this.f362a.mo340a(aVar.f361e);
            aVar.setCancelable(this.f362a.f225r);
            if (this.f362a.f225r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f362a.f226s);
            aVar.setOnDismissListener(this.f362a.f227t);
            OnKeyListener onKeyListener = this.f362a.f228u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }
    }

    protected C0122a(Context context, int i) {
        super(context, m338a(context, i));
    }

    /* renamed from: a */
    static int m338a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7521a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f361e.mo334b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f361e.mo333a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f361e.mo338b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f361e.mo337b(charSequence);
    }

    /* renamed from: a */
    public ListView mo522a() {
        return this.f361e.mo327a();
    }
}
