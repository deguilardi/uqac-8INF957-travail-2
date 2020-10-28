package ca.uqac.warp.warp;

public class EmpereurDieu extends WarpEntity implements EmpereurDieuInterface {

    EmpereurDieu(){
        super("EMPEREUR DIEU", "ADVICE");
    }

    @Override
    public void adviceWithoutParticularReason() {
        Warp.getInstance().respond(this, null, "pray harder");
    }

    @Override
    public void adviceOnDemand(String reason) {
        Warp.getInstance().respond(this, reason, "stop being lazy");
    }
}
