package bandeau;

import java.awt.*;

public class EffetZoomTourne extends EffetAnim {

    public EffetZoomTourne() {
        super();

    }


    @Override
    public void afficheEffetBandeau(Bandeau bandeau, String str) {
        bandeau.setMessage(str);

        double cmpt = 0;
        while (cmpt < 2 * Math.PI) {
            bandeau.setRotation(cmpt);
            bandeau.setFont(new Font("Dialog", Font.PLAIN, (int) Math.exp(cmpt)));
            bandeau.sleep(10);
            cmpt += Math.PI / 50;
        }
        bandeau.setFont(new Font("Dialog", Font.PLAIN, 15));
    }

    @Override
    public void afficheEffetBandeau(Bandeau bandeau) {
        afficheEffetBandeau(bandeau, "Ca tourne !");
    }
}
