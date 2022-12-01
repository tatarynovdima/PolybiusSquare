package Polybius;

public class EncryptionK {
    private String text = "";
    private String  encryptionText = "";

    static char[][]key = {
            {'А', 'Б', 'В', 'Г', 'Ґ', 'Д', 'Є', 'Ж', 'З', 'И'},
            {'І', 'Й', 'Ї', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р'},
            {'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь'},
            {'Ю', 'Я', 'а', 'б', 'в', 'г', 'ґ', 'д', 'є', 'ж'},
            {'з', 'и', 'і', 'й', 'ї', 'к', 'л', 'м', 'н', 'о'},
            {'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш'},
            {'щ', 'ь', 'ю', 'я','$', '#', '%', '^', '&', '<'},
            {'>', '"',' ', '.', ',', ')', 'Є', 'є'},
            {'(', '?', '!', '_', '@', '1', '2', '3', '4', '5'},
            {'6', '7', '8', '9', '0', '*', '/', '+', '-', '\\'},
            };

    public EncryptionK(String text){
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
        String rezs ="";
        for(int i = 0; i < key.length; ++i){
            for(int j = 0; j < key[i].length; ++j){
                if(key[i][j] == c){
                    rez = rez + (i + "" + j + " ");

                    if (i == 9){
                        rezs += key[i-1][j];
                    }
                    if(i != 9){
                        rezs += key[i+1][j];
                    }
                }
            }
        }
        System.out.print(rezs);
        return (rez);
    }
}