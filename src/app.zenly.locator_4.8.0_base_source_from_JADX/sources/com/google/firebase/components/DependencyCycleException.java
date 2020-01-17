package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class DependencyCycleException extends DependencyException {
    public DependencyCycleException(List<C11025d<?>> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Dependency cycle detected: ");
        sb.append(Arrays.toString(list.toArray()));
        super(sb.toString());
    }
}
