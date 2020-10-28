package ca.uqac.warp.warp;

public class Cegorach extends WarpEntity implements CegorachInterface {

    Cegorach(){
        super("CEGORACH", "LISTEN");
    }

    @Override
    public void listenToNeedsWithoutResponding(String[] needs) {
        StringBuilder sb = new StringBuilder();
        appendNeedsToResponse(sb, needs);
        Warp.getInstance().respond(this, sb.toString(), null);
    }

    @Override
    public void listenToNeedsRespondingWithAdvice(String[] needs) {
        StringBuilder sb = new StringBuilder();
        appendNeedsToResponse(sb, needs);
        Warp.getInstance().respond(this, sb.toString(), "an advice ...");
        Warp.getInstance().empereurDieu.adviceOnDemand(sb.toString());
    }

    @Override
    public void listenToNeedsRespondingWithMiracle(String[] needs) {
        StringBuilder sb = new StringBuilder();
        appendNeedsToResponse(sb, needs);
        Warp.getInstance().respond(this, sb.toString(), "miracle ...");
        Warp.getInstance().gorkEtMork.makeLameToWalk();
    }

    /**
     * Aux method, append needs to output
     *
     * @param sb: The output
     * @param needs: Needs array
     */
    private void appendNeedsToResponse(StringBuilder sb, String[] needs){
        for(String need : needs){
            sb.append(" \"");
            sb.append(need);
            sb.append("\" ");
        }
    }
}
