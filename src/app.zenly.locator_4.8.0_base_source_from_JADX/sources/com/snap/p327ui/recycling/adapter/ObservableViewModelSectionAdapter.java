package com.snap.p327ui.recycling.adapter;

import com.snap.p327ui.recycling.ObservableSectionController;
import p389io.reactivex.disposables.Disposable;

@Deprecated
/* renamed from: com.snap.ui.recycling.adapter.ObservableViewModelSectionAdapter */
public class ObservableViewModelSectionAdapter implements ViewModelAdapter, Disposable {

    /* renamed from: com.snap.ui.recycling.adapter.ObservableViewModelSectionAdapter$SectionErrorHandler */
    public interface SectionErrorHandler {
        void onError(ObservableViewModelSectionAdapter observableViewModelSectionAdapter, ObservableSectionController observableSectionController, Throwable th);
    }
}
