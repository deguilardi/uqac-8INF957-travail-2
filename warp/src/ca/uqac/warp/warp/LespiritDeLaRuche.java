package ca.uqac.warp.warp;

public class LespiritDeLaRuche extends WarpEntity implements LespiritDeLaRucheInterface {

    LespiritDeLaRuche(){
        super("L'SPIRIT DE LA RUCHE", "PUNISHMENT");
    }

    @Override
    public void sendToHell() {
        Warp.getInstance().respond(this, "someone made bad decisions", "sent someone to hell.");
    }

    @Override
    public void giveSeriousDisease() {
        Warp.getInstance().respond(this, null, "gave serious disease.");
    }

    @Override
    public void instantKill() {
        Warp.getInstance().respond(this, "someone made bad actions", "killed instantly.");
    }
}
