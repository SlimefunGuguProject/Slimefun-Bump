package org.slimefunguguproject.bump.api.appraise;

import org.bukkit.attribute.Attribute;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This class represents a single {@link Attribute} with range.
 *
 * @author ybw0014
 */
final class AppraiseAttribute {
    private final Attribute attribute;
    private final double min;
    private final double max;

    @ParametersAreNonnullByDefault
    public AppraiseAttribute(Attribute attribute, double min, double max) {
        this.attribute = attribute;
        this.min = min;
        this.max = max;
    }

    @Nonnull
    public Attribute getAttribute() {
        return attribute;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getPercent(double val) {
        if (val <= min) {
            return 0;
        } else if (val >= max) {
            return 100;
        } else {
            return (val - min) / (max - min) * 100.0D;
        }
    }
}
