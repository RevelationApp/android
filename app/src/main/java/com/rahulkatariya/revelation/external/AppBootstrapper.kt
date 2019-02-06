package com.rahulkatariya.revelation.external

import java.util.concurrent.locks.ReentrantLock

public interface BootstrapService {
    fun bootstrap()
}

public class AppBootstrapper(
    private val service: BootstrapService
) {
    private var setupCompleted = false
    private val lock = ReentrantLock()

    public fun bootstrap(): Boolean {
        lock.lock()
        var coldLaunch = false
        if (!setupCompleted) {
            service.bootstrap()
            setupCompleted = true
            coldLaunch = true
        }
        lock.unlock()
        return coldLaunch
    }
}
