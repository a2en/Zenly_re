package com.bumptech.glide.request;

public interface RequestCoordinator {

    /* renamed from: com.bumptech.glide.request.RequestCoordinator$a */
    public enum C9219a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: e */
        private final boolean f23896e;

        private C9219a(boolean z) {
            this.f23896e = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo24853a() {
            return this.f23896e;
        }
    }

    boolean canNotifyCleared(Request request);

    boolean canNotifyStatusChanged(Request request);

    boolean canSetImage(Request request);

    boolean isAnyResourceSet();

    void onRequestFailed(Request request);

    void onRequestSuccess(Request request);
}
