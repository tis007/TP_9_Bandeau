package bandeau;

import java.util.LinkedList;

public class Scenario {
    LinkedList<EffetAnim> allEffects = new LinkedList<EffetAnim>();

    public Scenario() {
    }

    public void addEffectToSenario(EffetAnim effetAnim, int times) {
        for (int i = 0; i < times; i++){
            allEffects.add(effetAnim);
        }
    }

    public void showEffects(Bandeau bandeau){
        for (EffetAnim effet : allEffects) {
            effet.afficheEffetBandeau(bandeau);
        }
    }


}
