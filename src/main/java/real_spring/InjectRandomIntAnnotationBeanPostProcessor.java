package real_spring;

import heroGame.utils.RandomUtil;
import lombok.SneakyThrows;
import my_spring.InjectRandomIntAnnotationObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {

    private InjectRandomIntAnnotationObjectConfigurator configurator = new InjectRandomIntAnnotationObjectConfigurator();

    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> type = bean.getClass();
        for (Field field : type.getDeclaredFields()) {
            InjectRandomName annotation = field.getAnnotation(InjectRandomName.class);
            if(annotation!=null){
                field.setAccessible(true);
                field.set(bean, RandomUtil.randomName());
            }
        }
        return bean;
    }
}
