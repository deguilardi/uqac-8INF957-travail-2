package ca.uqac.warp.breeds;

import ca.uqac.warp.warp.GorkEtMorkInterface;
import ca.uqac.warp.warp.Warp;

public class Orks {
    private GorkEtMorkInterface entity = Warp.getGorkEtMorkInterface();

    public GorkEtMorkInterface getEntity() {
        return entity;
    }
}
