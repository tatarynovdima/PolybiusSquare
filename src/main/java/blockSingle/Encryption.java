package blockSingle;

import java.io.IOException;

public class Encryption {
    private String text = "";
    private String  encryptionText = "";

    public Encryption() {
        this.text = text;
    }

    public String getEncryptionText() {
        return this.encryptionText;
    }

    protected static int[]key = { 2 , 4 , 1 , 3};

    public String addLine(String tempS) throws IOException {
        if (tempS != null){
            if(tempS.length() % 4 == 1){
                return tempS + "XYZ";

            }else if(tempS.length() % 4 == 2){
                return tempS + "YZ";

            }else if(tempS.length() % 4 == 3){
                return tempS + "X";

            }else{
                return tempS;
            }
        }else {
            return null;
        }
    }

    public String Encrypt(String str) throws IOException {
        String result = "";
        String tempS = addLine(str);

        for (int i = 0; i < tempS.length(); i += key.length) {
            char[]transposition = new char[key.length];

            for (int j = 0; j < key.length; j++) {
                transposition[key[j]-1] = tempS.charAt(i+ j);
            }
            for (int j = 0; j < key.length; j++) {
                result += transposition[j];
            }
        }
        return result;
    }
}