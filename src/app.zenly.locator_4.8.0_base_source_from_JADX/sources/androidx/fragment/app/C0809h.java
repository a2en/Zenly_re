package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import p214e.p243k.C7641c;

/* renamed from: androidx.fragment.app.h */
class C0809h implements Factory2 {

    /* renamed from: e */
    private final FragmentManager f3284e;

    C0809h(FragmentManager fragmentManager) {
        this.f3284e = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3284e);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7641c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C7641c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C7641c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(C7641c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0807f.m3786b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(attributeValue);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment = this.f3284e.mo4058a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3284e.mo4083b(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f3284e.mo4058a(id);
        }
        if (FragmentManager.m3606d(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(attributeValue);
            sb2.append(" existing=");
            sb2.append(fragment);
            Log.v("FragmentManager", sb2.toString());
        }
        if (fragment == null) {
            fragment = this.f3284e.mo4120p().mo4142a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id;
            fragment.mContainerId = id;
            fragment.mTag = string;
            fragment.mInLayout = true;
            FragmentManager fragmentManager = this.f3284e;
            fragment.mFragmentManager = fragmentManager;
            C0808g<?> gVar = fragmentManager.f3197p;
            fragment.mHost = gVar;
            fragment.onInflate(gVar.mo4249c(), attributeSet, fragment.mSavedFragmentState);
            this.f3284e.mo4067a(fragment);
            this.f3284e.mo4109j(fragment);
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            C0808g<?> gVar2 = this.f3284e.f3197p;
            fragment.mHost = gVar2;
            fragment.onInflate(gVar2.mo4249c(), attributeSet, fragment.mSavedFragmentState);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Duplicate id 0x");
            sb3.append(Integer.toHexString(resourceId));
            sb3.append(", tag ");
            sb3.append(string);
            sb3.append(", or parent id 0x");
            sb3.append(Integer.toHexString(id));
            sb3.append(" with another fragment for ");
            sb3.append(attributeValue);
            throw new IllegalArgumentException(sb3.toString());
        }
        FragmentManager fragmentManager2 = this.f3284e;
        if (fragmentManager2.f3196o >= 1 || !fragment.mFromLayout) {
            this.f3284e.mo4109j(fragment);
        } else {
            fragmentManager2.mo4068a(fragment, 1);
        }
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            return fragment.mView;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(attributeValue);
        sb4.append(" did not create a view.");
        throw new IllegalStateException(sb4.toString());
    }
}
