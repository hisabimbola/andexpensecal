package com.google.ads.mediation;

import com.google.android.gms.internal.ly;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public abstract class MediationServerParameters {

    public final class MappingException extends Exception {
        public MappingException(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameter {
        String name();

        boolean required() default true;
    }

    protected void m4813a() {
    }

    public void load(Map<String, String> map) {
        Map hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            Parameter parameter = (Parameter) field.getAnnotation(Parameter.class);
            if (parameter != null) {
                hashMap.put(parameter.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            ly.m6074e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    ly.m6074e("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    ly.m6074e("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Bad Type");
                }
            } else {
                ly.m6065a("Unexpected server option: " + ((String) entry.getKey()) + " = \"" + ((String) entry.getValue()) + "\"");
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Field field22 : hashMap.values()) {
            if (((Parameter) field22.getAnnotation(Parameter.class)).required()) {
                ly.m6074e("Required server option missing: " + ((Parameter) field22.getAnnotation(Parameter.class)).name());
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(((Parameter) field22.getAnnotation(Parameter.class)).name());
            }
        }
        if (stringBuilder.length() > 0) {
            throw new MappingException("Required server option(s) missing: " + stringBuilder.toString());
        }
        m4813a();
    }
}
