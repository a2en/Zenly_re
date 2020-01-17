package com.snap.p327ui.recycling.factory;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView.C1077o;
import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.BindingAdapterViewType;
import com.snap.p327ui.recycling.BindingContext;
import com.snap.p327ui.recycling.C11702a;
import com.snap.p327ui.recycling.C11721c;
import com.snap.p327ui.recycling.ViewCreatingBindingAdapterViewType;
import com.snap.p327ui.recycling.prefetch.ViewHolderPrefetcher;
import com.snap.p327ui.recycling.prefetch.ViewPrefetcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p333g.p378f.p379a.C12118a;

/* renamed from: com.snap.ui.recycling.factory.c */
public class C11727c {

    /* renamed from: a */
    private final List<AdapterViewType[]> f30393a;

    /* renamed from: b */
    private final List<Class<? extends AdapterViewType>> f30394b;

    /* renamed from: c */
    private ViewPrefetcher f30395c;

    /* renamed from: d */
    private ViewHolderPrefetcher f30396d;

    /* renamed from: e */
    private WeakReference<LayoutInflater> f30397e;

    /* renamed from: f */
    private final BindingContext f30398f;

    /* renamed from: com.snap.ui.recycling.factory.c$b */
    private static class C11729b implements BindingContext {
        private C11729b() {
        }
    }

    public C11727c(Collection<Class<? extends AdapterViewType>> collection) {
        this(new C11729b(), collection);
    }

    /* renamed from: a */
    public void mo34543a(ViewHolderPrefetcher viewHolderPrefetcher) {
        this.f30396d = viewHolderPrefetcher;
    }

    public C11727c(BindingContext bindingContext, Collection<Class<? extends AdapterViewType>> collection) {
        this.f30393a = new ArrayList();
        this.f30394b = new ArrayList();
        this.f30397e = new WeakReference<>(null);
        new C1077o();
        this.f30398f = bindingContext;
        mo34544a(collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo34544a(Collection<Class<? extends AdapterViewType>> collection) {
        if (!collection.isEmpty()) {
            this.f30393a.clear();
            this.f30394b.clear();
            for (Class cls : collection) {
                C12118a.m31986b("addViewTypes");
                m30825a(cls);
                C12118a.m31984a();
            }
        } else {
            throw new RuntimeException("viewTypes must not be empty");
        }
    }

    /* renamed from: a */
    private void m30825a(Class<? extends AdapterViewType> cls) {
        this.f30393a.add((AdapterViewType[]) cls.getEnumConstants());
        this.f30394b.add(cls);
    }

    /* renamed from: a */
    public int mo34540a(AdapterViewType adapterViewType) {
        int size = this.f30394b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (adapterViewType.getClass().isAssignableFrom((Class) this.f30394b.get(i2))) {
                int i3 = i;
                for (AdapterViewType adapterViewType2 : (AdapterViewType[]) this.f30393a.get(i2)) {
                    if (adapterViewType == adapterViewType2) {
                        return i3;
                    }
                    i3++;
                }
                i = i3;
            }
            i += ((AdapterViewType[]) this.f30393a.get(i2)).length;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AdapterViewType not registered: ");
        sb.append(adapterViewType.getClass());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private AdapterViewType m30820a(int i) {
        int size = this.f30394b.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int length = ((AdapterViewType[]) this.f30393a.get(i3)).length;
            int i4 = i - i2;
            if (i4 < length) {
                return ((AdapterViewType[]) this.f30393a.get(i3))[i4];
            }
            i2 += length;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid viewType index ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public C11730d mo34542a(Context context, int i, ViewGroup viewGroup) {
        try {
            AdapterViewType a = m30820a(i);
            StringBuilder sb = new StringBuilder();
            sb.append("RC:create: ");
            sb.append(a);
            C12118a.m31985a(sb.toString());
            if (this.f30396d != null) {
                C11730d prefetchedViewHolder = this.f30396d.getPrefetchedViewHolder(a);
                if (prefetchedViewHolder != null) {
                    return prefetchedViewHolder;
                }
            }
            C11730d a2 = m30821a(this, a, mo34541a(context, a, viewGroup));
            C12118a.m31984a();
            return a2;
        } finally {
            C12118a.m31984a();
        }
    }

    /* renamed from: a */
    public static C11730d m30821a(C11727c cVar, AdapterViewType adapterViewType, View view) {
        if (!(adapterViewType instanceof BindingAdapterViewType)) {
            return new C11730d(view);
        }
        try {
            Class viewBindingClass = ((BindingAdapterViewType) adapterViewType).getViewBindingClass();
            if (viewBindingClass == null) {
                return new C11730d(view);
            }
            if (C11702a.class.isAssignableFrom(viewBindingClass)) {
                C11702a aVar = (C11702a) viewBindingClass.newInstance();
                aVar.mo34452a(cVar.f30398f, cVar, view);
                return new BindingViewHolder(view, aVar);
            }
            C11721c cVar2 = (C11721c) viewBindingClass.newInstance();
            cVar2.mo34451a(view);
            return new BindingViewHolder(view, cVar2);
        } catch (Exception e) {
            String a = m30822a(view);
            StringBuilder sb = new StringBuilder();
            sb.append("View hierarchy: ");
            sb.append(a);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public View mo34541a(Context context, AdapterViewType adapterViewType, ViewGroup viewGroup) {
        int layoutId = adapterViewType.getLayoutId();
        ViewPrefetcher viewPrefetcher = this.f30395c;
        if (viewPrefetcher != null) {
            View prefetchedView = viewPrefetcher.getPrefetchedView(layoutId);
            if (prefetchedView != null) {
                return prefetchedView;
            }
        }
        return m30819a(context, adapterViewType, viewGroup, m30818a(context));
    }

    /* renamed from: a */
    public static View m30819a(Context context, AdapterViewType adapterViewType, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (adapterViewType instanceof ViewCreatingBindingAdapterViewType) {
            return ((ViewCreatingBindingAdapterViewType) adapterViewType).createView(viewGroup, layoutInflater);
        }
        int layoutId = adapterViewType.getLayoutId();
        if (layoutId == 0) {
            return new FrameLayout(context);
        }
        try {
            return layoutInflater.inflate(layoutId, viewGroup, false);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create view for type: ");
            sb.append(adapterViewType);
            sb.append(" On Layout ");
            sb.append(layoutId);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private LayoutInflater m30818a(Context context) {
        if (this.f30397e.get() == null) {
            this.f30397e = new WeakReference<>(LayoutInflater.from(context));
        }
        return (LayoutInflater) this.f30397e.get();
    }

    /* renamed from: a */
    private static String m30822a(View view) {
        StringBuilder sb = new StringBuilder();
        m30824a(view, sb, 0);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m30824a(View view, StringBuilder sb, int i) {
        sb.append(m30823a(view, i));
        if (view instanceof ViewGroup) {
            int i2 = i + 1;
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m30824a(viewGroup.getChildAt(i3), sb, i2);
            }
        }
    }

    /* renamed from: a */
    private static String m30823a(View view, int i) {
        String replace = new String(new char[i]).replace("\u0000", "  ");
        try {
            String str = view.getResources() != null ? view.getId() > 0 ? view.getResources().getResourceName(view.getId()) : "no_id" : "no_resources";
            StringBuilder sb = new StringBuilder();
            sb.append(replace);
            sb.append('[');
            sb.append(view.getClass().getSimpleName());
            sb.append("] ");
            sb.append(str);
            sb.append(10);
            return sb.toString();
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(replace);
            sb2.append('[');
            sb2.append(view.getClass().getSimpleName());
            sb2.append("] name_not_found\n");
            return sb2.toString();
        }
    }
}
