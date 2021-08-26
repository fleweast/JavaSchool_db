package my_spring;

import lombok.Getter;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObjectFactory {
    @Getter
    private static ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaConfig();
    private Reflections scanner = new Reflections("my_spring");
    private List<ObjectConfigurator> configurators = new ArrayList<>();

    @SneakyThrows
    private ObjectFactory(){
        for (Class<? extends ObjectConfigurator> a : scanner.getSubTypesOf(ObjectConfigurator.class)){
            configurators.add(a.getDeclaredConstructor().newInstance());
        }
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImple(type);

        T t = type.getDeclaredConstructor().newInstance();
        configureObject(t);
        return t;
    }

    private <T> Class<T> resolveImple(Class<T> type) {
        if (type.isInterface()) {
            Class<T> implClass = config.getImplClass(type);
            if (implClass == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new IllegalStateException(type + " has 0 or more than one impl was found, please update your config");
                }
                implClass = (Class<T>) classes.iterator().next();
            }
            type = implClass;
        }
        return type;
    }

    private   <T> void configureObject(T t){
        for (ObjectConfigurator configurator: configurators){
            configurator.configure(t);
        }
    }
}
