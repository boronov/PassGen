package boronov;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

class Until {
    private SecureRandom srand;
    private ArrayList validch;

    Until() {
        srand = new SecureRandom();
        validch = new ArrayList();

        for (int i = 65; i < 91; i++) {
            validch.add((char) i); //A-Z
            validch.add((char) (i + 32)); //a-z
        }
        for (int i = 48; i < 58; i++) {
            validch.add((char) i);
        }
        for (int i = 35; i < 39; i++) {
            validch.add((char) i);
        }
        validch.add((char) 64);
        Collections.shuffle(validch);
    }

    char randChar() {
        return (char) this.validch.get(srand.nextInt(this.validch.size()));
    }
}
