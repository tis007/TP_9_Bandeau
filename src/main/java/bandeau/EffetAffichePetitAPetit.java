package bandeau;

public class EffetAffichePetitAPetit extends EffetAnim {

    public EffetAffichePetitAPetit() {
    }

    @Override
    public void afficheEffetBandeau(Bandeau bandeau, String str) {
        String affichage = "";
        for (int i = 0; i < str.length(); i++) {
            affichage += str.charAt(i);
            bandeau.setMessage(affichage);
            bandeau.sleep(50);
        }
    }

    @Override
    public void afficheEffetBandeau(Bandeau bandeau) {
        afficheEffetBandeau(bandeau, "Petit à Petit");
    }
}
