package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;

/* renamed from: androidx.core.view.l */
public final class C0657l {

    /* renamed from: androidx.core.view.l$a */
    public static final class C0658a implements Sequence<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2828a;

        C0658a(ViewGroup viewGroup) {
            this.f2828a = viewGroup;
        }

        public Iterator<View> iterator() {
            return C0657l.m3060b(this.f2828a);
        }
    }

    /* renamed from: androidx.core.view.l$b */
    public static final class C0659b implements Iterator<View>, KMutableIterator {

        /* renamed from: e */
        private int f2829e;

        /* renamed from: f */
        final /* synthetic */ ViewGroup f2830f;

        C0659b(ViewGroup viewGroup) {
            this.f2830f = viewGroup;
        }

        public boolean hasNext() {
            return this.f2829e < this.f2830f.getChildCount();
        }

        public void remove() {
            ViewGroup viewGroup = this.f2830f;
            this.f2829e--;
            viewGroup.removeViewAt(this.f2829e);
        }

        public View next() {
            ViewGroup viewGroup = this.f2830f;
            int i = this.f2829e;
            this.f2829e = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static final View m3058a(ViewGroup viewGroup, int i) {
        C12932j.m33818b(viewGroup, "$this$get");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: b */
    public static final Iterator<View> m3060b(ViewGroup viewGroup) {
        C12932j.m33818b(viewGroup, "$this$iterator");
        return new C0659b(viewGroup);
    }

    /* renamed from: a */
    public static final Sequence<View> m3059a(ViewGroup viewGroup) {
        C12932j.m33818b(viewGroup, "$this$children");
        return new C0658a(viewGroup);
    }
}
