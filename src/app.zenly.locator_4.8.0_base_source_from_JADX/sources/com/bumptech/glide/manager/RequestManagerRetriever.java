package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C8867j;
import com.bumptech.glide.Glide;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.p301o.C9217k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p214e.p228e.C7571a;

public class RequestManagerRetriever implements Callback {

    /* renamed from: i */
    private static final RequestManagerFactory f23821i = new C9180a();

    /* renamed from: a */
    private volatile C8867j f23822a;

    /* renamed from: b */
    final Map<FragmentManager, C9188g> f23823b = new HashMap();

    /* renamed from: c */
    final Map<androidx.fragment.app.FragmentManager, C9191i> f23824c = new HashMap();

    /* renamed from: d */
    private final Handler f23825d;

    /* renamed from: e */
    private final RequestManagerFactory f23826e;

    /* renamed from: f */
    private final C7571a<View, Fragment> f23827f = new C7571a<>();

    /* renamed from: g */
    private final C7571a<View, android.app.Fragment> f23828g = new C7571a<>();

    /* renamed from: h */
    private final Bundle f23829h = new Bundle();

    public interface RequestManagerFactory {
        C8867j build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context);
    }

    /* renamed from: com.bumptech.glide.manager.RequestManagerRetriever$a */
    class C9180a implements RequestManagerFactory {
        C9180a() {
        }

        public C8867j build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
            return new C8867j(glide, lifecycle, requestManagerTreeNode, context);
        }
    }

    public RequestManagerRetriever(RequestManagerFactory requestManagerFactory) {
        if (requestManagerFactory == null) {
            requestManagerFactory = f23821i;
        }
        this.f23826e = requestManagerFactory;
        this.f23825d = new Handler(Looper.getMainLooper(), this);
    }

    @Deprecated
    /* renamed from: b */
    private void m21987b(FragmentManager fragmentManager, C7571a<View, android.app.Fragment> aVar) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            String str = "key";
            this.f23829h.putInt(str, i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f23829h, str);
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    if (VERSION.SDK_INT >= 17) {
                        m21984a(fragment.getChildFragmentManager(), aVar);
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private C8867j m21988c(Context context) {
        if (this.f23822a == null) {
            synchronized (this) {
                if (this.f23822a == null) {
                    this.f23822a = this.f23826e.build(Glide.m21128a(context.getApplicationContext()), new C9182b(), new C9186e(), context.getApplicationContext());
                }
            }
        }
        return this.f23822a;
    }

    /* renamed from: d */
    private static boolean m21990d(Context context) {
        Activity b = m21986b(context);
        return b == null || !b.isFinishing();
    }

    /* renamed from: a */
    public C8867j mo24747a(Context context) {
        if (context != null) {
            if (C9217k.m22108d() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo24750a((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo24745a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo24747a(contextWrapper.getBaseContext());
                    }
                }
            }
            return m21988c(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public boolean handleMessage(Message message) {
        Object obj;
        int i = message.what;
        Object obj2 = null;
        boolean z = true;
        if (i == 1) {
            obj2 = (FragmentManager) message.obj;
            obj = this.f23823b.remove(obj2);
        } else if (i != 2) {
            z = false;
            obj = null;
        } else {
            obj2 = (androidx.fragment.app.FragmentManager) message.obj;
            obj = this.f23824c.remove(obj2);
        }
        if (z && obj == null) {
            String str = "RMRetriever";
            if (Log.isLoggable(str, 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to remove expected request manager fragment, manager: ");
                sb.append(obj2);
                Log.w(str, sb.toString());
            }
        }
        return z;
    }

    /* renamed from: b */
    private static Activity m21986b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m21986b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(17)
    /* renamed from: c */
    private static void m21989c(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: a */
    public C8867j mo24750a(FragmentActivity fragmentActivity) {
        if (C9217k.m22106c()) {
            return mo24747a(fragmentActivity.getApplicationContext());
        }
        m21989c((Activity) fragmentActivity);
        return m21981a((Context) fragmentActivity, fragmentActivity.getSupportFragmentManager(), (Fragment) null, m21990d(fragmentActivity));
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: b */
    public C9188g mo24752b(Activity activity) {
        return m21982a(activity.getFragmentManager(), (android.app.Fragment) null, m21990d(activity));
    }

    /* renamed from: a */
    public C8867j mo24749a(Fragment fragment) {
        C9216j.m22084a(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C9217k.m22106c()) {
            return mo24747a(fragment.getContext().getApplicationContext());
        }
        return m21981a(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: a */
    public C8867j mo24745a(Activity activity) {
        if (C9217k.m22106c()) {
            return mo24747a(activity.getApplicationContext());
        }
        m21989c(activity);
        return m21980a((Context) activity, activity.getFragmentManager(), (android.app.Fragment) null, m21990d(activity));
    }

    /* renamed from: a */
    public C8867j mo24748a(View view) {
        if (C9217k.m22106c()) {
            return mo24747a(view.getContext().getApplicationContext());
        }
        C9216j.m22083a(view);
        C9216j.m22084a(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity b = m21986b(view.getContext());
        if (b == null) {
            return mo24747a(view.getContext().getApplicationContext());
        }
        if (b instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) b;
            Fragment a = m21979a(view, fragmentActivity);
            return a != null ? mo24749a(a) : mo24750a(fragmentActivity);
        }
        android.app.Fragment a2 = m21978a(view, b);
        if (a2 == null) {
            return mo24745a(b);
        }
        return mo24746a(a2);
    }

    /* renamed from: a */
    private static void m21985a(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment fragment : collection) {
                if (!(fragment == null || fragment.getView() == null)) {
                    map.put(fragment.getView(), fragment);
                    m21985a((Collection<Fragment>) fragment.getChildFragmentManager().mo4122q(), map);
                }
            }
        }
    }

    /* renamed from: a */
    private Fragment m21979a(View view, FragmentActivity fragmentActivity) {
        this.f23827f.clear();
        m21985a((Collection<Fragment>) fragmentActivity.getSupportFragmentManager().mo4122q(), (Map<View, Fragment>) this.f23827f);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById)) {
            fragment = (Fragment) this.f23827f.get(view);
            if (fragment != null || !(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
        }
        this.f23827f.clear();
        return fragment;
    }

    @Deprecated
    /* renamed from: a */
    private android.app.Fragment m21978a(View view, Activity activity) {
        this.f23828g.clear();
        m21984a(activity.getFragmentManager(), this.f23828g);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById)) {
            fragment = (android.app.Fragment) this.f23828g.get(view);
            if (fragment != null || !(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
        }
        this.f23828g.clear();
        return fragment;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: a */
    private void m21984a(FragmentManager fragmentManager, C7571a<View, android.app.Fragment> aVar) {
        if (VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    m21984a(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        m21987b(fragmentManager, aVar);
    }

    @TargetApi(17)
    @Deprecated
    /* renamed from: a */
    public C8867j mo24746a(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C9217k.m22106c() || VERSION.SDK_INT < 17) {
            return mo24747a(fragment.getActivity().getApplicationContext());
        } else {
            return m21980a((Context) fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    /* renamed from: a */
    private C9188g m21982a(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        String str = "com.bumptech.glide.manager";
        C9188g gVar = (C9188g) fragmentManager.findFragmentByTag(str);
        if (gVar == null) {
            gVar = (C9188g) this.f23823b.get(fragmentManager);
            if (gVar == null) {
                gVar = new C9188g();
                gVar.mo24761a(fragment);
                if (z) {
                    gVar.mo24763b().mo24756b();
                }
                this.f23823b.put(fragmentManager, gVar);
                fragmentManager.beginTransaction().add(gVar, str).commitAllowingStateLoss();
                this.f23825d.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return gVar;
    }

    @Deprecated
    /* renamed from: a */
    private C8867j m21980a(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        C9188g a = m21982a(fragmentManager, fragment, z);
        C8867j c = a.mo24764c();
        if (c != null) {
            return c;
        }
        C8867j build = this.f23826e.build(Glide.m21128a(context), a.mo24763b(), a.mo24765d(), context);
        a.mo24762a(build);
        return build;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9191i mo24751a(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return m21983a(fragmentManager, (Fragment) null, m21990d(context));
    }

    /* renamed from: a */
    private C9191i m21983a(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        String str = "com.bumptech.glide.manager";
        C9191i iVar = (C9191i) fragmentManager.mo4083b(str);
        if (iVar == null) {
            iVar = (C9191i) this.f23824c.get(fragmentManager);
            if (iVar == null) {
                iVar = new C9191i();
                iVar.mo24782a(fragment);
                if (z) {
                    iVar.mo24784b().mo24756b();
                }
                this.f23824c.put(fragmentManager, iVar);
                C0819o b = fragmentManager.mo4084b();
                b.mo4316a((Fragment) iVar, str);
                b.mo4185b();
                this.f23825d.obtainMessage(2, fragmentManager).sendToTarget();
            }
        }
        return iVar;
    }

    /* renamed from: a */
    private C8867j m21981a(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C9191i a = m21983a(fragmentManager, fragment, z);
        C8867j c = a.mo24785c();
        if (c != null) {
            return c;
        }
        C8867j build = this.f23826e.build(Glide.m21128a(context), a.mo24784b(), a.mo24786d(), context);
        a.mo24783a(build);
        return build;
    }
}
