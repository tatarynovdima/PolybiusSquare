package Polybius;


import java.io.*;

public class Main {
    static final String filePathWriteWord= "StartWord.txt";
    static final String filePathEncryption = "Encryption.txt";
    static final String filePathDescription = "Description.txt";



    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.createFile();

        boolean choice = true;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        while (choice){
            System.out.print("Enter word : ");


            String tempS = reader.readLine();

            if(tempS.equals("exit")){
                choice = false;
            }else {
                main.WriteWord(filePathWriteWord , tempS);

                Encryption enc = new Encryption(tempS);
                System.out.println("Encryption : " + enc.getEncryptionText());
                main.WriteEncryption(filePathEncryption ,enc.getEncryptionText() );

                Description desc = new Description(enc.getEncryptionText());
                System.out.println("Description : " + desc.getDescriptionText());
                main.WriteDescription(filePathDescription ,desc.getDescriptionText() );
                System.out.println("");
            }
        }
        reader.close();
    }

    public void createFile(){
        try{
            FileWriter writer = new FileWriter(filePathWriteWord);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("");

            bufferWriter.close();
            writer.close();
        }catch (Exception e){
            System.err.println("Error if file cleaning :" + e.getMessage() + " " + filePathWriteWord);
        }

        try{
            FileWriter writer = new FileWriter(filePathEncryption);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("");

            bufferWriter.close();
            writer.close();
        }catch (Exception e){
            System.err.println("Error if file cleaning :" + e.getMessage() + " " + filePathEncryption);
        }

        try{
            FileWriter writer = new FileWriter(filePathDescription);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("");

            bufferWriter.close();
            writer.close();
        }catch (Exception e){
            System.err.println("Error if file cleaning :" + e.getMessage() + " " + filePathDescription);
        }
    }

    public void WriteWord(String path , String str){
        try{
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(str + "\n");

            bufferWriter.close();
            writer.close();
        }catch (IOException e){
            System.out.println("Error : " + e);
        }
    }

    public void WriteEncryption(String path , String str){
        try{
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(str + "\n");

            bufferWriter.close();
            writer.close();
        }catch (IOException e){
            System.out.println("Error : " + e);
        }
    }
    public void WriteDescription(String path , String str){
        try{
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(str + "\n");

            bufferWriter.close();
            writer.close();
        }catch (IOException e){
            System.out.println("Error : " + e);
        }
    }
}