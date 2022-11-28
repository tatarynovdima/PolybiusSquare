package blockSingle;

import java.io.IOException;

public class Description {

    public String descriptionText;

    public String getDescriptionText() {
        return descriptionText;
    }

    public String Description(String str) throws IOException {
        String result = "";

        for (int i = 0; i < str.length(); i += Encryption.key.length) {
            char[]transposition = new char[Encryption.key.length];

            for (int j = 0; j < Encryption.key.length; j++) {
                transposition[j] = str.charAt(i+ Encryption.key[j] - 1);
            }
            for (int j = 0; j < Encryption.key.length; j++) {
                result += transposition[j];
            }
        }
        return result;
    }
}