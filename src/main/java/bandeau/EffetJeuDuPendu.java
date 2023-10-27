package bandeau;

import java.util.Random;

public class EffetJeuDuPendu extends EffetAnim {
    public EffetJeuDuPendu() {
        super();


    }

    @Override
    public void afficheEffetBandeau(Bandeau bandeau, String str) {
        Random rdm = new Random();
        StringBuilder ret = new StringBuilder();
        int cmpt = 0;
        for (int i = 0; i < str.length(); i++) {
            ret.append("_");
        }
        bandeau.setMessage(ret.toString());
        bandeau.sleep(500);

        while (cmpt < str.length()) {
            int nbrRdm = rdm.nextInt(str.length());
            if (!(str.charAt(nbrRdm) == ret.charAt(nbrRdm))) {
                ret.setCharAt(nbrRdm, str.charAt(nbrRdm));
                cmpt++;
                bandeau.setMessage(ret.toString());
                bandeau.sleep(200);
            }
        }
    }

    @Override
    public void afficheEffetBandeau(Bandeau bandeau) {
        afficheEffetBandeau(bandeau, "Jeu du pendu");
    }
}


