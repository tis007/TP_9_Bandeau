package bandeau;
import java.awt.Color;
import java.util.Random;

public class EffetEpilepsie extends EffetAnim {
    public EffetEpilepsie() {
    }

    @Override
    public void afficheEffetBandeau(Bandeau bandeau, String str) {
        bandeau.setMessage(str);
        Random rdm = new Random();

        for (int i = 0;i<100;i++){
            bandeau.setForeground(new Color(rdm.nextInt(255), rdm.nextInt(255), rdm.nextInt(255)));
            bandeau.sleep(10);
        }
        bandeau.setForeground(Color.BLACK);
    }

    @Override
    public void afficheEffetBandeau(Bandeau bandeau) {
        afficheEffetBandeau(bandeau, "epilepsie");
    }
}
