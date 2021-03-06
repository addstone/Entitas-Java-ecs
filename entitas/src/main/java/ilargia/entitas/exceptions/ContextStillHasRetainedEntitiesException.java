package ilargia.entitas.exceptions;

import ilargia.entitas.Context;
import ilargia.entitas.api.entitas.EntitasException;

public class ContextStillHasRetainedEntitiesException extends EntitasException {

    public ContextStillHasRetainedEntitiesException(Context pool) {
        super("'" + pool + "' detected retained entities " +
                        "although all entities got destroyed!",
                "Did you release all entities? Try calling pool.ClearGroups() " +
                        "and system.ClearReactiveSystems() before calling " +
                        "pool.DestroyAllEntities() to avoid memory leaks.");
    }
}