package my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();

        for (Field field : type.getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                Object fieldObject = ObjectFactory.getInstance().createObject(field.getType());
                field.setAccessible(true);
                field.set(t, fieldObject);
                field.setAccessible(false);
            }
        }
    }
}
