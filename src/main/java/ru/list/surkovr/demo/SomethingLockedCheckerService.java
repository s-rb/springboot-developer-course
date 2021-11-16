package ru.list.surkovr.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class SomethingLockedCheckerService {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    private final boolean isLocked;
    private final String version;

    @Autowired
    public SomethingLockedCheckerService(ApplicationSettings settings) {
        this.isLocked = settings.isLocked();
        this.version = settings.getVersion();
    }

    public void printIsLocked() {
        logger.info("### Version: " + version + ", isLocked: " + isLocked);
    }
}
