package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.C0794b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.C0969j;
import androidx.navigation.C0976o;
import androidx.navigation.FloatingWindow;
import androidx.navigation.Navigator;
import androidx.navigation.Navigator.C0945a;
import androidx.navigation.Navigator.Extras;

@C0945a("dialog")
public final class DialogFragmentNavigator extends Navigator<C0956a> {

    /* renamed from: a */
    private final Context f3670a;

    /* renamed from: b */
    private final FragmentManager f3671b;

    /* renamed from: c */
    private int f3672c = 0;

    /* renamed from: d */
    private LifecycleEventObserver f3673d = new LifecycleEventObserver(this) {
        public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
            if (aVar == C0863a.ON_STOP) {
                C0794b bVar = (C0794b) lifecycleOwner;
                if (!bVar.mo4209d().isShowing()) {
                    NavHostFragment.m4286a((Fragment) bVar).mo4647d();
                }
            }
        }
    };

    /* renamed from: androidx.navigation.fragment.DialogFragmentNavigator$a */
    public static class C0956a extends C0969j implements FloatingWindow {

        /* renamed from: m */
        private String f3674m;

        public C0956a(Navigator<? extends C0956a> navigator) {
            super(navigator);
        }

        /* renamed from: a */
        public void mo4664a(Context context, AttributeSet attributeSet) {
            super.mo4664a(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0962d.DialogFragmentNavigator);
            String string = obtainAttributes.getString(C0962d.DialogFragmentNavigator_android_name);
            if (string != null) {
                mo4697b(string);
            }
            obtainAttributes.recycle();
        }

        /* renamed from: b */
        public final C0956a mo4697b(String str) {
            this.f3674m = str;
            return this;
        }

        /* renamed from: h */
        public final String mo4698h() {
            String str = this.f3674m;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.f3670a = context;
        this.f3671b = fragmentManager;
    }

    /* renamed from: b */
    public Bundle mo4656b() {
        if (this.f3672c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f3672c);
        return bundle;
    }

    /* renamed from: c */
    public boolean mo4657c() {
        if (this.f3672c == 0) {
            return false;
        }
        if (this.f3671b.mo4130x()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        FragmentManager fragmentManager = this.f3671b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.f3672c - 1;
        this.f3672c = i;
        sb.append(i);
        Fragment b = fragmentManager.mo4083b(sb.toString());
        if (b != null) {
            b.getLifecycle().mo4447b(this.f3673d);
            ((C0794b) b).mo4202a();
        }
        return true;
    }

    /* renamed from: a */
    public C0956a m4277a() {
        return new C0956a(this);
    }

    /* renamed from: a */
    public C0969j mo4654a(C0956a aVar, Bundle bundle, C0976o oVar, Extras extras) {
        if (this.f3671b.mo4130x()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String h = aVar.mo4698h();
        if (h.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3670a.getPackageName());
            sb.append(h);
            h = sb.toString();
        }
        Fragment a = this.f3671b.mo4120p().mo4142a(this.f3670a.getClassLoader(), h);
        if (C0794b.class.isAssignableFrom(a.getClass())) {
            C0794b bVar = (C0794b) a;
            bVar.setArguments(bundle);
            bVar.getLifecycle().mo4446a(this.f3673d);
            FragmentManager fragmentManager = this.f3671b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("androidx-nav-fragment:navigator:dialog:");
            int i = this.f3672c;
            this.f3672c = i + 1;
            sb2.append(i);
            bVar.mo4204a(fragmentManager, sb2.toString());
            return aVar;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Dialog destination ");
        sb3.append(aVar.mo4698h());
        sb3.append(" is not an instance of DialogFragment");
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: a */
    public void mo4655a(Bundle bundle) {
        if (bundle != null) {
            int i = 0;
            this.f3672c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            while (i < this.f3672c) {
                FragmentManager fragmentManager = this.f3671b;
                StringBuilder sb = new StringBuilder();
                sb.append("androidx-nav-fragment:navigator:dialog:");
                sb.append(i);
                C0794b bVar = (C0794b) fragmentManager.mo4083b(sb.toString());
                if (bVar != null) {
                    bVar.getLifecycle().mo4446a(this.f3673d);
                    i++;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DialogFragment ");
                    sb2.append(i);
                    sb2.append(" doesn't exist in the FragmentManager");
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
    }
}
