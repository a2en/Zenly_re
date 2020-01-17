package com.mapbox.geojson.gson;

import com.google.gson.C11138i;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11265c;
import com.mapbox.geojson.CoordinateContainer;
import com.mapbox.geojson.Geometry;
import java.io.IOException;

public class GeometryTypeAdapter extends C11138i<Geometry> {
    public Geometry read(C11262a aVar) throws IOException {
        return null;
    }

    public void write(C11265c cVar, Geometry geometry) throws IOException {
        cVar.mo32598b();
        cVar.mo32599b("type").mo32603d(geometry.type());
        if (geometry.bbox() != null) {
            cVar.mo32599b("bbox").mo32674a(geometry.bbox().toJson());
        }
        if (geometry instanceof CoordinateContainer) {
            cVar.mo32599b("coordinates").mo32674a(((CoordinateContainer) geometry).coordinates().toString());
        }
        cVar.mo32602d();
    }
}
