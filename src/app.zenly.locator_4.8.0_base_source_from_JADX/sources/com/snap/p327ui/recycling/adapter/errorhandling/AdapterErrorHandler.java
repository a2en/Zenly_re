package com.snap.p327ui.recycling.adapter.errorhandling;

import android.content.Context;
import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.factory.C11730d;
import com.snap.p327ui.recycling.p328d.C11722a;

/* renamed from: com.snap.ui.recycling.adapter.errorhandling.AdapterErrorHandler */
public interface AdapterErrorHandler {
    C11722a getErrorAdapterViewModel();

    AdapterViewType getErrorAdapterViewType();

    int getErrorViewType();

    long getItemId();

    C11730d getViewModelViewHolder(Context context);

    void onError(Exception exc, C11718a aVar);
}
