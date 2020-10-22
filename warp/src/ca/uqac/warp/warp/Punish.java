package ca.uqac.warp.warp;

public class Punish extends WarpService implements PunishInterface{

    Punish(){
        super("PUNISH");
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
