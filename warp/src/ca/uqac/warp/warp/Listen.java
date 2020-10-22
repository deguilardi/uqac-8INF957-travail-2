package ca.uqac.warp.warp;

public class Listen extends WarpService implements ListenInterface{

    Listen(){
        super("LISTEN");
    }

    @Override
    public void needsWithoutResponding(String[] needs) {
        StringBuilder sb = new StringBuilder();
        appendNeedsToOutput(sb, needs);
        Warp.getInstance().respond(this, sb.toString(), null);
    }

    @Override
    public void needsRespondingWithAdvice(String[] needs) {
        StringBuilder sb = new StringBuilder();
        appendNeedsToOutput(sb, needs);
        Warp.getInstance().respond(this, sb.toString(), "an advice ...");
        Warp.getInstance().getAdvice().onDemand(sb.toString());
    }

    @Override
    public void needsRespondingWithMiracle(String[] needs) {
        StringBuilder sb = new StringBuilder();
        appendNeedsToOutput(sb, needs);
        Warp.getInstance().respond(this, sb.toString(), "miracle ...");
        Warp.getInstance().getMiracle().makeLameToWalk();
    }

    /**
     * Aux method, append needs to output
     *
     * @param sb: The output
     * @param needs: Needs array
     */
    private void appendNeedsToOutput(StringBuilder sb, String[] needs){
        for(String need : needs){
            sb.append(" \"");
            sb.append(need);
            sb.append("\" ");
        }
    }
}
