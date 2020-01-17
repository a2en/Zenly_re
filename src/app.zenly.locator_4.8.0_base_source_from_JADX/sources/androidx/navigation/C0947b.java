package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.app.C0514a;
import androidx.core.content.C0540a;
import androidx.navigation.Navigator.C0945a;
import androidx.navigation.Navigator.Extras;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@C0945a("activity")
/* renamed from: androidx.navigation.b */
public class C0947b extends Navigator<C0948a> {

    /* renamed from: a */
    private Context f3648a;

    /* renamed from: b */
    private Activity f3649b;

    /* renamed from: androidx.navigation.b$a */
    public static class C0948a extends C0969j {

        /* renamed from: m */
        private Intent f3650m;

        /* renamed from: n */
        private String f3651n;

        public C0948a(Navigator<? extends C0948a> navigator) {
            super(navigator);
        }

        /* renamed from: a */
        public void mo4664a(Context context, AttributeSet attributeSet) {
            super.mo4664a(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0998t.ActivityNavigator);
            String string = obtainAttributes.getString(C0998t.ActivityNavigator_targetPackage);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            mo4668d(string);
            String string2 = obtainAttributes.getString(C0998t.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(string2);
                    string2 = sb.toString();
                }
                mo4663a(new ComponentName(context, string2));
            }
            mo4666b(obtainAttributes.getString(C0998t.ActivityNavigator_action));
            String string3 = obtainAttributes.getString(C0998t.ActivityNavigator_data);
            if (string3 != null) {
                mo4665b(Uri.parse(string3));
            }
            mo4667c(obtainAttributes.getString(C0998t.ActivityNavigator_dataPattern));
            obtainAttributes.recycle();
        }

        /* renamed from: b */
        public final C0948a mo4666b(String str) {
            if (this.f3650m == null) {
                this.f3650m = new Intent();
            }
            this.f3650m.setAction(str);
            return this;
        }

        /* renamed from: c */
        public final C0948a mo4667c(String str) {
            this.f3651n = str;
            return this;
        }

        /* renamed from: d */
        public final C0948a mo4668d(String str) {
            if (this.f3650m == null) {
                this.f3650m = new Intent();
            }
            this.f3650m.setPackage(str);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo4669g() {
            return false;
        }

        /* renamed from: h */
        public final String mo4670h() {
            Intent intent = this.f3650m;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        /* renamed from: i */
        public final ComponentName mo4671i() {
            Intent intent = this.f3650m;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        /* renamed from: j */
        public final String mo4672j() {
            return this.f3651n;
        }

        /* renamed from: k */
        public final Intent mo4673k() {
            return this.f3650m;
        }

        public String toString() {
            ComponentName i = mo4671i();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (i != null) {
                sb.append(" class=");
                sb.append(i.getClassName());
            } else {
                String h = mo4670h();
                if (h != null) {
                    sb.append(" action=");
                    sb.append(h);
                }
            }
            return sb.toString();
        }

        /* renamed from: b */
        public final C0948a mo4665b(Uri uri) {
            if (this.f3650m == null) {
                this.f3650m = new Intent();
            }
            this.f3650m.setData(uri);
            return this;
        }

        /* renamed from: a */
        public final C0948a mo4663a(ComponentName componentName) {
            if (this.f3650m == null) {
                this.f3650m = new Intent();
            }
            this.f3650m.setComponent(componentName);
            return this;
        }
    }

    /* renamed from: androidx.navigation.b$b */
    public static final class C0949b implements Extras {

        /* renamed from: a */
        private final int f3652a;

        /* renamed from: b */
        private final C0514a f3653b;

        /* renamed from: a */
        public C0514a mo4675a() {
            return this.f3653b;
        }

        /* renamed from: b */
        public int mo4676b() {
            return this.f3652a;
        }
    }

    public C0947b(Context context) {
        this.f3648a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f3649b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    /* renamed from: c */
    public boolean mo4657c() {
        Activity activity = this.f3649b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: a */
    public C0948a m4242a() {
        return new C0948a(this);
    }

    /* renamed from: a */
    public C0969j mo4654a(C0948a aVar, Bundle bundle, C0976o oVar, Extras extras) {
        if (aVar.mo4673k() != null) {
            Intent intent = new Intent(aVar.mo4673k());
            if (bundle != null) {
                intent.putExtras(bundle);
                String j = aVar.mo4672j();
                if (!TextUtils.isEmpty(j)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(j);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Could not find ");
                            sb.append(group);
                            sb.append(" in ");
                            sb.append(bundle);
                            sb.append(" to fill data pattern ");
                            sb.append(j);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z = extras instanceof C0949b;
            if (z) {
                intent.addFlags(((C0949b) extras).mo4676b());
            }
            if (!(this.f3648a instanceof Activity)) {
                intent.addFlags(268435456);
            }
            if (oVar != null && oVar.mo4759g()) {
                intent.addFlags(536870912);
            }
            Activity activity = this.f3649b;
            String str = "android-support-navigation:ActivityNavigator:current";
            if (activity != null) {
                Intent intent2 = activity.getIntent();
                if (intent2 != null) {
                    int intExtra = intent2.getIntExtra(str, 0);
                    if (intExtra != 0) {
                        intent.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
                    }
                }
            }
            intent.putExtra(str, aVar.mo4734d());
            if (oVar != null) {
                intent.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", oVar.mo4755c());
                intent.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", oVar.mo4756d());
            }
            if (z) {
                C0514a a = ((C0949b) extras).mo4675a();
                if (a != null) {
                    C0540a.m2540a(this.f3648a, intent, a.mo3028a());
                } else {
                    this.f3648a.startActivity(intent);
                }
            } else {
                this.f3648a.startActivity(intent);
            }
            if (!(oVar == null || this.f3649b == null)) {
                int a2 = oVar.mo4753a();
                int b = oVar.mo4754b();
                if (!(a2 == -1 && b == -1)) {
                    if (a2 == -1) {
                        a2 = 0;
                    }
                    if (b == -1) {
                        b = 0;
                    }
                    this.f3649b.overridePendingTransition(a2, b);
                }
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Destination ");
        sb2.append(aVar.mo4734d());
        sb2.append(" does not have an Intent set.");
        throw new IllegalStateException(sb2.toString());
    }
}
