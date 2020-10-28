package ca.uqac.warp.breeds;

import ca.uqac.warp.warp.LespiritDeLaRucheInterface;
import ca.uqac.warp.warp.Warp;

public class Tyranids {
    private LespiritDeLaRucheInterface entity = Warp.getInstance().getLespiritDeLaRucheInterface();

    public LespiritDeLaRucheInterface getEntity() {
        return entity;
    }
}
