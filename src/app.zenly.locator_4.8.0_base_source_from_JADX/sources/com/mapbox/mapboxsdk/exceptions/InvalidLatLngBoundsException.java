package com.mapbox.mapboxsdk.exceptions;

public class InvalidLatLngBoundsException extends RuntimeException {
    public InvalidLatLngBoundsException(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot create a LatLngBounds from ");
        sb.append(i);
        sb.append(" items");
        super(sb.toString());
    }
}
