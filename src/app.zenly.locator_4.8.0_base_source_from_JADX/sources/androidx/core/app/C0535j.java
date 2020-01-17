package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.core.app.j */
public final class C0535j {

    /* renamed from: androidx.core.app.j$a */
    public static class C0536a {

        /* renamed from: a */
        private Activity f2555a;

        /* renamed from: b */
        private Intent f2556b = new Intent().setAction("android.intent.action.SEND");

        /* renamed from: c */
        private CharSequence f2557c;

        /* renamed from: d */
        private ArrayList<String> f2558d;

        /* renamed from: e */
        private ArrayList<String> f2559e;

        /* renamed from: f */
        private ArrayList<String> f2560f;

        /* renamed from: g */
        private ArrayList<Uri> f2561g;

        private C0536a(Activity activity) {
            this.f2555a = activity;
            this.f2556b.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
            this.f2556b.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
            this.f2556b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", activity.getComponentName());
            this.f2556b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", activity.getComponentName());
            this.f2556b.addFlags(524288);
        }

        /* renamed from: a */
        public static C0536a m2510a(Activity activity) {
            return new C0536a(activity);
        }

        /* renamed from: b */
        public Intent mo3057b() {
            ArrayList<String> arrayList = this.f2558d;
            if (arrayList != null) {
                m2511a("android.intent.extra.EMAIL", arrayList);
                this.f2558d = null;
            }
            ArrayList<String> arrayList2 = this.f2559e;
            if (arrayList2 != null) {
                m2511a("android.intent.extra.CC", arrayList2);
                this.f2559e = null;
            }
            ArrayList<String> arrayList3 = this.f2560f;
            if (arrayList3 != null) {
                m2511a("android.intent.extra.BCC", arrayList3);
                this.f2560f = null;
            }
            ArrayList<Uri> arrayList4 = this.f2561g;
            boolean z = true;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                z = false;
            }
            String str = "android.intent.action.SEND_MULTIPLE";
            boolean equals = this.f2556b.getAction().equals(str);
            String str2 = "android.intent.extra.STREAM";
            if (!z && equals) {
                this.f2556b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f2561g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f2556b.removeExtra(str2);
                } else {
                    this.f2556b.putExtra(str2, (Parcelable) this.f2561g.get(0));
                }
                this.f2561g = null;
            }
            if (z && !equals) {
                this.f2556b.setAction(str);
                ArrayList<Uri> arrayList6 = this.f2561g;
                if (arrayList6 == null || arrayList6.isEmpty()) {
                    this.f2556b.removeExtra(str2);
                } else {
                    this.f2556b.putParcelableArrayListExtra(str2, this.f2561g);
                }
            }
            return this.f2556b;
        }

        /* renamed from: c */
        public void mo3059c() {
            this.f2555a.startActivity(mo3052a());
        }

        /* renamed from: a */
        private void m2511a(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f2556b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[(arrayList.size() + length)];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f2556b.putExtra(str, strArr);
        }

        /* renamed from: a */
        public Intent mo3052a() {
            return Intent.createChooser(mo3057b(), this.f2557c);
        }

        /* renamed from: a */
        public C0536a mo3055a(CharSequence charSequence) {
            this.f2557c = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0536a mo3053a(int i) {
            mo3055a(this.f2555a.getText(i));
            return this;
        }

        /* renamed from: a */
        public C0536a mo3056a(String str) {
            this.f2556b.setType(str);
            return this;
        }

        /* renamed from: a */
        public C0536a mo3054a(Uri uri) {
            String str = "android.intent.action.SEND";
            if (!this.f2556b.getAction().equals(str)) {
                this.f2556b.setAction(str);
            }
            this.f2561g = null;
            this.f2556b.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        /* renamed from: b */
        public C0536a mo3058b(CharSequence charSequence) {
            this.f2556b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.j$b */
    public static class C0537b {

        /* renamed from: a */
        private Intent f2562a;

        private C0537b(Activity activity) {
            this.f2562a = activity.getIntent();
            C0535j.m2509b(activity);
            C0535j.m2508a(activity);
        }

        /* renamed from: a */
        public static C0537b m2520a(Activity activity) {
            return new C0537b(activity);
        }

        /* renamed from: b */
        public CharSequence mo3061b() {
            return this.f2562a.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        /* renamed from: c */
        public boolean mo3062c() {
            String action = this.f2562a.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        /* renamed from: a */
        public Uri mo3060a() {
            return (Uri) this.f2562a.getParcelableExtra("android.intent.extra.STREAM");
        }
    }

    /* renamed from: a */
    public static ComponentName m2508a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            return callingActivity;
        }
        ComponentName componentName = (ComponentName) activity.getIntent().getParcelableExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY");
        return componentName == null ? (ComponentName) activity.getIntent().getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY") : componentName;
    }

    /* renamed from: b */
    public static String m2509b(Activity activity) {
        String callingPackage = activity.getCallingPackage();
        if (callingPackage != null) {
            return callingPackage;
        }
        String stringExtra = activity.getIntent().getStringExtra("androidx.core.app.EXTRA_CALLING_PACKAGE");
        return stringExtra == null ? activity.getIntent().getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE") : stringExtra;
    }
}
