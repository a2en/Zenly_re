package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.drawee.controller.d */
public class C9597d<INFO> implements ControllerListener<INFO> {

    /* renamed from: a */
    private final List<ControllerListener<? super INFO>> f24934a = new ArrayList(2);

    /* renamed from: a */
    public synchronized void mo25903a(ControllerListener<? super INFO> controllerListener) {
        this.f24934a.add(controllerListener);
    }

    /* renamed from: b */
    public synchronized void mo25904b(ControllerListener<? super INFO> controllerListener) {
        int indexOf = this.f24934a.indexOf(controllerListener);
        if (indexOf != -1) {
            this.f24934a.set(indexOf, null);
        }
    }

    public synchronized void onFailure(String str, Throwable th) {
        int size = this.f24934a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f24934a.get(i);
                if (controllerListener != null) {
                    controllerListener.onFailure(str, th);
                }
            } catch (Exception e) {
                m23566a("InternalListener exception in onFailure", e);
            }
        }
    }

    public synchronized void onFinalImageSet(String str, INFO info, Animatable animatable) {
        int size = this.f24934a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f24934a.get(i);
                if (controllerListener != null) {
                    controllerListener.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception e) {
                m23566a("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
        int size = this.f24934a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f24934a.get(i);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageFailed(str, th);
                }
            } catch (Exception e) {
                m23566a("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    public void onIntermediateImageSet(String str, INFO info) {
        int size = this.f24934a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f24934a.get(i);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageSet(str, info);
                }
            } catch (Exception e) {
                m23566a("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    public synchronized void onRelease(String str) {
        int size = this.f24934a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f24934a.get(i);
                if (controllerListener != null) {
                    controllerListener.onRelease(str);
                }
            } catch (Exception e) {
                m23566a("InternalListener exception in onRelease", e);
            }
        }
    }

    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f24934a.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener controllerListener = (ControllerListener) this.f24934a.get(i);
                if (controllerListener != null) {
                    controllerListener.onSubmit(str, obj);
                }
            } catch (Exception e) {
                m23566a("InternalListener exception in onSubmit", e);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo25902a() {
        this.f24934a.clear();
    }

    /* renamed from: a */
    private synchronized void m23566a(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }
}
