package bandeau;

public class Main {

    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        Scenario senario = new Scenario();
        EffetAffichePetitAPetit effetAffichePetitAPetit = new EffetAffichePetitAPetit();
        EffetJeuDuPendu effetJeuDuPendu = new EffetJeuDuPendu();
        EffetZoomTourne effetZoomTourne = new EffetZoomTourne();
        EffetEpilepsie effetEpilepsie = new EffetEpilepsie();

        senario.addEffectToSenario(effetEpilepsie, 1);
        senario.addEffectToSenario(effetZoomTourne, 3);
        senario.addEffectToSenario(effetAffichePetitAPetit, 2);
        senario.addEffectToSenario(effetJeuDuPendu, 1);
        senario.addEffectToSenario(effetAffichePetitAPetit, 1);
        senario.showEffects(bandeau);
    }
}
        