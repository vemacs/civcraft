package com.avrgaming.civcraft.nocheat;

import com.avrgaming.civcraft.config.CivSettings;
import com.avrgaming.civcraft.exception.InvalidConfiguration;
import fr.neatmonster.nocheatplus.checks.CheckType;
import fr.neatmonster.nocheatplus.checks.access.IViolationInfo;
import fr.neatmonster.nocheatplus.hooks.AbstractNCPHook;
import fr.neatmonster.nocheatplus.hooks.NCPHookManager;
import org.bukkit.entity.Player;

public class NoCheatPlusSurvivalFlyHandler extends AbstractNCPHook {

    /**
     * Initializes this {@link AbstractNCPHook} and adds it to the {@link NCPHookManager}.
     */
    public static void init() {
        NCPHookManager.addHook(CheckType.MOVING_SURVIVALFLY, new NoCheatPlusSurvivalFlyHandler());
    }

    @Override
    public String getHookName() {
        return "CivCraft:" + this.getClass().getSimpleName();
    }

    @Override
    public String getHookVersion() {
        return "1.0";
    }

    @Override
    public boolean onCheckFailure(final CheckType checkType, final Player player, final IViolationInfo info) {
        double violationGrace;
        try {
            violationGrace =
                    CivSettings.getDouble(CivSettings.nocheatConfig, "nocheatplus.survivalfly.violation_grace");
        } catch (InvalidConfiguration e) {
            e.printStackTrace();
            return false;
        }
        return info.getAddedVl() < violationGrace;
    }
}
