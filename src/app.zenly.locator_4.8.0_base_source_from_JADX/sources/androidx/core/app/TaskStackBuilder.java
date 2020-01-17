package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0540a;
import java.util.ArrayList;
import java.util.Iterator;

public final class TaskStackBuilder implements Iterable<Intent> {

    /* renamed from: e */
    private final ArrayList<Intent> f2492e = new ArrayList<>();

    /* renamed from: f */
    private final Context f2493f;

    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(Context context) {
        this.f2493f = context;
    }

    /* renamed from: a */
    public static TaskStackBuilder m2443a(Context context) {
        return new TaskStackBuilder(context);
    }

    /* renamed from: b */
    public TaskStackBuilder mo3026b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f2493f.getPackageManager());
        }
        if (component != null) {
            mo3022a(component);
        }
        mo3023a(intent);
        return this;
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2492e.iterator();
    }

    /* renamed from: a */
    public TaskStackBuilder mo3023a(Intent intent) {
        this.f2492e.add(intent);
        return this;
    }

    /* renamed from: a */
    public TaskStackBuilder mo3021a(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof SupportParentable ? ((SupportParentable) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0524e.m2469a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f2493f.getPackageManager());
            }
            mo3022a(component);
            mo3023a(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: a */
    public TaskStackBuilder mo3022a(ComponentName componentName) {
        int size = this.f2492e.size();
        try {
            Intent a = C0524e.m2470a(this.f2493f, componentName);
            while (a != null) {
                this.f2492e.add(size, a);
                a = C0524e.m2470a(this.f2493f, a.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public void mo3024a() {
        mo3025a((Bundle) null);
    }

    /* renamed from: a */
    public void mo3025a(Bundle bundle) {
        if (!this.f2492e.isEmpty()) {
            ArrayList<Intent> arrayList = this.f2492e;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0540a.m2541a(this.f2493f, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2493f.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
