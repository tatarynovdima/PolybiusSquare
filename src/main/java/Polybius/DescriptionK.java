package Polybius;

public class DescriptionK {
    public String parseText;
    public String descriptionText;

    public DescriptionK(String text){
        delAllSpace(text);
        outString(this.parseText);
    }
    public String getDescriptionText(){
        return this.descriptionText;
    }

    public void delAllSpace(String s){
        this.parseText = s.replaceAll(" ", "");
    }

    public String outString(String s){
        String result = "";
        int x;
        int y;

        for(int i = 0; i < s.length(); ++i){
            if(i % 2  == 0){
                x = Integer.parseInt(String.valueOf(s.charAt(i)));
                y = Integer.parseInt(String.valueOf(s.charAt(i+1)));
                result += EncryptionL.key[x][y];
            }
        }
        this.descriptionText = result;
        return result;
    }
}