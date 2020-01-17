package p416me.everything.android.p417ui.overscroll.adapters;

import android.view.View;

/* renamed from: me.everything.android.ui.overscroll.adapters.IOverScrollDecoratorAdapter */
public interface IOverScrollDecoratorAdapter {
    View getView();

    boolean isInAbsoluteEnd();

    boolean isInAbsoluteStart();
}
