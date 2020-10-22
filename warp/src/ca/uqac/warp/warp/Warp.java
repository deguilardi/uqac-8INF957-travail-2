package ca.uqac.warp.warp;

public class Warp {
    private static Warp instance = new Warp();
    private AdviceInterface advice;
    private ListenInterface listen;
    private MiracleInterface miracle;
    private PunishInterface punish;

    private Warp(){
        advice = new Advice();
        listen = new Listen();
        miracle = new Miracle();
        punish = new Punish();
    }

    public void respond(WarpService service, String matter, String response){
        StringBuilder sb = new StringBuilder();
        sb.append("Warp performed ").append(service.ACTION);
        if(matter != null) {
            sb.append(", for the matter(s) << ").append(matter).append(" >>");
        }else{
            sb.append(", for no reason");
        }
        if(response != null){
            sb.append(", with response << ").append(response).append(" >>.");
        }else{
            sb.append(", with no response.");
        }
        System.out.println(sb.toString());
    }

    public static Warp getInstance(){
        return instance;
    }

    public AdviceInterface getAdvice() {
        return advice;
    }

    public ListenInterface getListen() {
        return listen;
    }

    public MiracleInterface getMiracle() {
        return miracle;
    }

    public PunishInterface getPunish() {
        return punish;
    }
}
