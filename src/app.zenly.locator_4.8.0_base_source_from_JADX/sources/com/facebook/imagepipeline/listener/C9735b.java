package com.facebook.imagepipeline.listener;

import com.facebook.common.logging.C9543a;
import com.facebook.imagepipeline.request.C9884a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.listener.b */
public class C9735b implements RequestListener {

    /* renamed from: a */
    private final List<RequestListener> f25577a;

    public C9735b(Set<RequestListener> set) {
        this.f25577a = new ArrayList(set.size());
        for (RequestListener requestListener : set) {
            if (requestListener != null) {
                this.f25577a.add(requestListener);
            }
        }
    }

    /* renamed from: a */
    public void mo26449a(RequestListener requestListener) {
        this.f25577a.add(requestListener);
    }

    public void onProducerEvent(String str, String str2, String str3) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onProducerEvent(str, str2, str3);
            } catch (Exception e) {
                m24100a("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e) {
                m24100a("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    public void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onProducerFinishWithFailure(str, str2, th, map);
            } catch (Exception e) {
                m24100a("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e) {
                m24100a("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public void onProducerStart(String str, String str2) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onProducerStart(str, str2);
            } catch (Exception e) {
                m24100a("InternalListener exception in onProducerStart", e);
            }
        }
    }

    public void onRequestCancellation(String str) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onRequestCancellation(str);
            } catch (Exception e) {
                m24100a("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public void onRequestFailure(C9884a aVar, String str, Throwable th, boolean z) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onRequestFailure(aVar, str, th, z);
            } catch (Exception e) {
                m24100a("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    public void onRequestStart(C9884a aVar, Object obj, String str, boolean z) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onRequestStart(aVar, obj, str, z);
            } catch (Exception e) {
                m24100a("InternalListener exception in onRequestStart", e);
            }
        }
    }

    public void onRequestSuccess(C9884a aVar, String str, boolean z) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onRequestSuccess(aVar, str, z);
            } catch (Exception e) {
                m24100a("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    public void onUltimateProducerReached(String str, String str2, boolean z) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f25577a.get(i)).onUltimateProducerReached(str, str2, z);
            } catch (Exception e) {
                m24100a("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public boolean requiresExtraMap(String str) {
        int size = this.f25577a.size();
        for (int i = 0; i < size; i++) {
            if (((RequestListener) this.f25577a.get(i)).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m24100a(String str, Throwable th) {
        C9543a.m23318b("ForwardingRequestListener", str, th);
    }

    public C9735b(RequestListener... requestListenerArr) {
        this.f25577a = new ArrayList(requestListenerArr.length);
        for (RequestListener requestListener : requestListenerArr) {
            if (requestListener != null) {
                this.f25577a.add(requestListener);
            }
        }
    }
}
