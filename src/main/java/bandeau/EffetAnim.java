package bandeau;

import bandeau.Bandeau;

import java.util.Random;

public abstract class EffetAnim {

    public EffetAnim() {
    }

    public abstract void afficheEffetBandeau(Bandeau bandeau, String str);
    public abstract void afficheEffetBandeau(Bandeau bandeau);

}