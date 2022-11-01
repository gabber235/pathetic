package xyz.ollieee.api.pathing.strategy.strategies;

import lombok.NonNull;
import xyz.ollieee.api.pathing.strategy.PathfinderStrategy;
import xyz.ollieee.api.snapshot.SnapshotManager;
import xyz.ollieee.api.wrapper.PathLocation;

/**
 * A {@link PathfinderStrategy} to find the direct path to a given endpoint
 */
public class DirectPathfinderStrategy implements PathfinderStrategy {

    @Override
    public boolean isValid(@NonNull PathLocation location, @NonNull SnapshotManager snapshotManager) {
        return snapshotManager.getBlock(location).isPassable();
    }

}
