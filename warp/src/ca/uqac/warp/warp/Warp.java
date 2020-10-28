package ca.uqac.warp.warp;

public class Warp {
    private static Warp instance = new Warp();
    EmpereurDieu empereurDieu;
    Cegorach cegorach;
    GorkEtMork gorkEtMork;
    LespiritDeLaRuche lespiritDeLaRuche;

    Warp(){
        empereurDieu = new EmpereurDieu();
        cegorach = new Cegorach();
        gorkEtMork = new GorkEtMork();
        lespiritDeLaRuche = new LespiritDeLaRuche();
    }

    void respond(WarpEntity entity, String matter, String response){
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

    static Warp getInstance(){
        return instance;
    }

    public static EmpereurDieuInterface getEmpereurDieuInterface() {
        return (EmpereurDieuInterface) instance.empereurDieu;
    }

    public static CegorachInterface getCegorachInterface() {
        return (CegorachInterface) instance.cegorach;
    }

    public static GorkEtMorkInterface getGorkEtMorkInterface() {
        return (GorkEtMork) instance.gorkEtMork;
    }

    public static LespiritDeLaRucheInterface getLespiritDeLaRucheInterface() {
        return (LespiritDeLaRuche) instance.lespiritDeLaRuche;
    }
}
