package ca.uqac.warp.warp;

public class GorkEtMork extends WarpEntity implements GorkEtMorkInterface {

    GorkEtMork(){
        super("GORK ET MORK", "MIRACLE");
    }

    @Override
    public void makeLameToWalk() {
        Warp.getInstance().respond(this, null, "made a lame to walk.");
    }

    @Override
    public void giveSightToBlind() {
        Warp.getInstance().respond(this, null, "gave sight to a blind.");
    }

    @Override
    public void multiplyBreadAndFish(Integer rate) {
        Warp.getInstance().respond(this, null, "multiplied 5 breads and 2 fish. New total is " + (5*rate) + " and " +(2*rate) + ".");
    }
}
