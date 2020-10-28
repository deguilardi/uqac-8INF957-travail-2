package ca.uqac.warp.breeds;

import ca.uqac.warp.warp.EmpereurDieuInterface;
import ca.uqac.warp.warp.Warp;

public class Psykers {
    private EmpereurDieuInterface entity = Warp.getInstance().getEmpereurDieuInterface();

    public EmpereurDieuInterface getEntity() {
        return entity;
    }
}
