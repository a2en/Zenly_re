package com.mapbox.mapboxsdk.style.layers;

import androidx.annotation.Keep;

public class TransitionOptions {
    @Keep
    private long delay;
    @Keep
    private long duration;
    @Keep
    private boolean enablePlacementTransitions;

    public TransitionOptions(long j, long j2) {
        this(j, j2, true);
    }

    @Deprecated
    @Keep
    public static TransitionOptions fromTransitionOptions(long j, long j2) {
        return new TransitionOptions(j, j2);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || TransitionOptions.class != obj.getClass()) {
            return false;
        }
        TransitionOptions transitionOptions = (TransitionOptions) obj;
        if (this.duration != transitionOptions.duration || this.delay != transitionOptions.delay) {
            return false;
        }
        if (this.enablePlacementTransitions != transitionOptions.enablePlacementTransitions) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.duration;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.delay;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.enablePlacementTransitions ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionOptions{duration=");
        sb.append(this.duration);
        sb.append(", delay=");
        sb.append(this.delay);
        sb.append(", enablePlacementTransitions=");
        sb.append(this.enablePlacementTransitions);
        sb.append('}');
        return sb.toString();
    }

    public TransitionOptions(long j, long j2, boolean z) {
        this.duration = j;
        this.delay = j2;
        this.enablePlacementTransitions = z;
    }

    @Keep
    static TransitionOptions fromTransitionOptions(long j, long j2, boolean z) {
        TransitionOptions transitionOptions = new TransitionOptions(j, j2, z);
        return transitionOptions;
    }
}
