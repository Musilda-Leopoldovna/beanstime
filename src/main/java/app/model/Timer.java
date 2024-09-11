package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Timer {

    private final Long time = System.nanoTime();

    public Long getTime() {
        return time;
    }
}
