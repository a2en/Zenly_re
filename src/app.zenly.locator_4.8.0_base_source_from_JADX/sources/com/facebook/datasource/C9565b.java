package com.facebook.datasource;

/* renamed from: com.facebook.datasource.b */
public abstract class C9565b<T> implements DataSubscriber<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25772a(DataSource<T> dataSource);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo25773b(DataSource<T> dataSource);

    public void onCancellation(DataSource<T> dataSource) {
    }

    public void onFailure(DataSource<T> dataSource) {
        try {
            mo25772a(dataSource);
        } finally {
            dataSource.close();
        }
    }

    public void onNewResult(DataSource<T> dataSource) {
        boolean isFinished = dataSource.isFinished();
        try {
            mo25773b(dataSource);
        } finally {
            if (isFinished) {
                dataSource.close();
            }
        }
    }
}
