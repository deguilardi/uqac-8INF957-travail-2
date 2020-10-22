package ca.uqac.warp.warp;

public class Advice extends WarpService implements AdviceInterface {

    Advice(){
        super("ADVICE");
    }

    @Override
    public void withoutParticularReason() {
        Warp.getInstance().respond(this, null, "pray harder");
    }

    @Override
    public void onDemand(String reason) {
        Warp.getInstance().respond(this, reason, "stop being lazy");
    }
}
