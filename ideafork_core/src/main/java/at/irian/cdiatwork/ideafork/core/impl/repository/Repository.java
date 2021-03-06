package at.irian.cdiatwork.ideafork.core.impl.repository;

import at.irian.cdiatwork.ideafork.core.api.monitoring.Monitored;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Stereotype;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)

@Stereotype
@ApplicationScoped
@Monitored

@Transactional
public @interface Repository {
}
