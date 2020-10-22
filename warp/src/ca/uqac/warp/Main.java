package ca.uqac.warp;

import ca.uqac.warp.breeds.*;

public class Main {

    public static void main(String[] args){

        // Init breeds
        Psykers psykers = new Psykers();
        Harlequins harlequins = new Harlequins();
        Orks orks = new Orks();
        Tyranids tyranids = new Tyranids();
        Chaos chaos = new Chaos();

        // Perform some test interactions
        psykers.getEmpereurDieu().getAdvice().onDemand("Ran out of water");
        psykers.getEmpereurDieu().getMiracle().makeLameToWalk();
        harlequins.getCegorach().getListen().needsWithoutResponding(new String[]{"I'm tired", "I need a job", "Save my son"});
        harlequins.getCegorach().getMiracle().multiplyBreadAndFish(123);
        orks.getGorkEtMork().getAdvice().withoutParticularReason();
        orks.getGorkEtMork().getPunish().sendToHell();
        tyranids.getLespiritDeLaRuche().getPunish().giveSeriousDisease();
        tyranids.getLespiritDeLaRuche().getPunish().instantKill();
        chaos.getKhorne().getListen().needsRespondingWithAdvice(new String[]{"Need bananas", "Have no money"});
        chaos.getKhorne().getMiracle().giveSightToBlind();
    }
}
