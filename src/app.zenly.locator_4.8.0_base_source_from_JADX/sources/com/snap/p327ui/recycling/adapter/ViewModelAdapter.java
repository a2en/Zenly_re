package com.snap.p327ui.recycling.adapter;

import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.p328d.C11722a;

/* renamed from: com.snap.ui.recycling.adapter.ViewModelAdapter */
public interface ViewModelAdapter {
    AdapterViewType getItemAdapterViewType(int i);

    int getItemCount();

    C11722a getItemViewModel(int i);
}
