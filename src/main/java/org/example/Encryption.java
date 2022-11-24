package org.example;

public class Encryption {
    private String text = "";
    private String  encryptionText = "";

    protected static char[][] key = {
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'},
            {'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'},
            {'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd'},
            {'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'},
            {'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x'},
            {'y', 'z', '$', '#', '%', '^', '&', '<', '>', '"'},
            {' ', '.', ',', ')'},
            {'(', '?', '!', '_', '@', '1', '2', '3', '4', '5'},
            {'6', '7', '8', '9', '0', '*', '/', '+', '-', '\\'},


    };

    public Encryption(String text){
        this.text = text;
        findInArr(this.text);
    }

    public String getEncryptionText(){
        return this.encryptionText;
    }

    public void findInArr(String text){
        for(int i=0; i<text.length(); ++i){
            this.encryptionText += charIn(text.charAt(i));
        }
    }

    public String charIn(char c){
        String rez = "";
        for(int i = 0; i < key.length; ++i){
            for(int j = 0; j < key[i].length; ++j){
                if(key[i][j] == c){
                    rez = rez + (i + "" + j + " ");
                }
            }
        }
        return rez;
    }
}