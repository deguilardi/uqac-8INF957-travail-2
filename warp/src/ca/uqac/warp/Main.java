package ca.uqac.warp;

import ca.uqac.warp.breeds.*;

public class Main {

    public static void main(String[] args){

        // Init breeds
        Psykers psykers = new Psykers();
        Harlequins harlequins = new Harlequins();
        Orks orks = new Orks();
        Tyranids tyranids = new Tyranids();

        // Perform some test interactions
        psykers.getEntity().adviceOnDemand("Ran out of water");
        psykers.getEntity().adviceWithoutParticularReason();
        harlequins.getEntity().listenToNeedsWithoutResponding(new String[]{"I'm tired", "I need a job", "Save my son"});
        harlequins.getEntity().listenToNeedsRespondingWithAdvice(new String[]{"Need bananas", "Have no money"});
        harlequins.getEntity().listenToNeedsRespondingWithMiracle(new String[]{"We're out of food", "We need jobs"});
        orks.getEntity().giveSightToBlind();
        orks.getEntity().makeLameToWalk();
        orks.getEntity().multiplyBreadAndFish(123);
        tyranids.getEntity().giveSeriousDisease();
        tyranids.getEntity().instantKill();
        tyranids.getEntity().sendToHell();
    }
}
