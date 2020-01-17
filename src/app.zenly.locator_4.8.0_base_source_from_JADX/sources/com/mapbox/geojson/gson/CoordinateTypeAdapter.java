package com.mapbox.geojson.gson;

import com.google.gson.C11138i;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11265c;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import com.mapbox.geojson.utils.GeoJsonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CoordinateTypeAdapter extends C11138i<List<Double>> {
    public List<Double> read(C11262a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.mo32573a();
        while (aVar.mo32579g()) {
            arrayList.add(Double.valueOf(aVar.mo32581k()));
        }
        aVar.mo32576d();
        if (arrayList.size() > 2) {
            return CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue());
        }
        return CoordinateShifterManager.getCoordinateShifter().shiftLonLat(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue());
    }

    public void write(C11265c cVar, List<Double> list) throws IOException {
        cVar.mo32593a();
        List unshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(list);
        cVar.mo32594a(GeoJsonUtils.trim(((Double) unshiftPoint.get(0)).doubleValue()));
        cVar.mo32594a(GeoJsonUtils.trim(((Double) unshiftPoint.get(1)).doubleValue()));
        if (list.size() > 2) {
            cVar.mo32597a((Number) unshiftPoint.get(2));
        }
        cVar.mo32600c();
    }
}
