package com.google.android.libraries.places.api.model;

abstract class zzw extends TimeOfWeek {
    private final DayOfWeek zza;
    private final LocalTime zzb;

    zzw(DayOfWeek dayOfWeek, LocalTime localTime) {
        if (dayOfWeek != null) {
            this.zza = dayOfWeek;
            if (localTime != null) {
                this.zzb = localTime;
                return;
            }
            throw new NullPointerException("Null time");
        }
        throw new NullPointerException("Null day");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeOfWeek) {
            TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
            return this.zza.equals(timeOfWeek.getDay()) && this.zzb.equals(timeOfWeek.getTime());
        }
    }

    public DayOfWeek getDay() {
        return this.zza;
    }

    public LocalTime getTime() {
        return this.zzb;
    }

    public int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length());
        sb.append("TimeOfWeek{day=");
        sb.append(valueOf);
        sb.append(", time=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
