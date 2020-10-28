package ca.uqac.warp.warp;

public class Warp {
    private static Warp instance = new Warp();
    EmpereurDieu empereurDieu;
    Cegorach cegorach;
    GorkEtMork gorkEtMork;
    LespiritDeLaRuche lespiritDeLaRuche;

    private Warp(){
        empereurDieu = new EmpereurDieu();
        cegorach = new Cegorach();
        gorkEtMork = new GorkEtMork();
        lespiritDeLaRuche = new LespiritDeLaRuche();
    }

    protected void respond(WarpEntity entity, String matter, String response){
        StringBuilder sb = new StringBuilder();
        sb.append(entity.name).append(" performed ").append(entity.action);
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

    public EmpereurDieuInterface getEmpereurDieuInterface() {
        return (EmpereurDieuInterface) empereurDieu;
    }

    public CegorachInterface getCegorachInterface() {
        return (CegorachInterface) cegorach;
    }

    public GorkEtMorkInterface getGorkEtMorkInterface() {
        return (GorkEtMork) gorkEtMork;
    }

    public LespiritDeLaRucheInterface getLespiritDeLaRucheInterface() {
        return (LespiritDeLaRuche) lespiritDeLaRuche;
    }
}
