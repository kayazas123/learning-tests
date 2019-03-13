package org.xstefank;

import org.jboss.logging.Logger;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessAnnotatedType;
import javax.enterprise.inject.spi.WithAnnotations;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegisterLRAParticipantExtension implements Extension {

    public static final List<Class<?>> names = new ArrayList<>();

    public void register(@Observes @WithAnnotations(RegisterLRAParticipant.class) ProcessAnnotatedType<?> type) {
        Class<?> javaClass = type.getAnnotatedType().getJavaClass();
        String name = javaClass.getName();
        Logger log = Logger.getLogger("SADFSAFDSADF");
        log.error("XXXXXXXXXXXXXXXXXXXX " + name);

        for (Method method : javaClass.getDeclaredMethods()) {
            log.error("XXXXXXXXXXx " + method.getName());    
            log.error("XXXXXXXXXXx " + Arrays.toString(method.getAnnotations()));    
        }

        names.add(javaClass);
        
    }
    
}