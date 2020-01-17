package com.mapbox.mapboxsdk.style.light;

import androidx.annotation.Keep;

public class Position {
    @Keep
    private float azimuthalAngle;
    @Keep
    private float polarAngle;
    @Keep
    private float radialCoordinate;

    public Position(float f, float f2, float f3) {
        this.radialCoordinate = f;
        this.azimuthalAngle = f2;
        this.polarAngle = f3;
    }

    @Keep
    public static Position fromPosition(float f, float f2, float f3) {
        return new Position(f, f2, f3);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Position.class != obj.getClass()) {
            return false;
        }
        Position position = (Position) obj;
        if (Float.compare(position.radialCoordinate, this.radialCoordinate) != 0 || Float.compare(position.azimuthalAngle, this.azimuthalAngle) != 0) {
            return false;
        }
        if (Float.compare(position.polarAngle, this.polarAngle) != 0) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        float f = this.radialCoordinate;
        int i = 0;
        int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.azimuthalAngle;
        int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.polarAngle;
        if (f3 != 0.0f) {
            i = Float.floatToIntBits(f3);
        }
        return floatToIntBits2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Position{radialCoordinate=");
        sb.append(this.radialCoordinate);
        sb.append(", azimuthalAngle=");
        sb.append(this.azimuthalAngle);
        sb.append(", polarAngle=");
        sb.append(this.polarAngle);
        sb.append('}');
        return sb.toString();
    }
}
