package Polybius;


import java.io.*;
import java.util.Scanner;

public class Main {
    static final String filePathWriteWord= "StartWord.txt";
    static final String filePathEncryption = "Encryption.txt";
    static final String filePathDescription = "Description.txt";



    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.createFile();

        boolean choice = true;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        System.out.print("Choice language English(1) or Ukraine(2) : ");
        int ch = in.nextInt();

        while (choice){
            System.out.print("Enter word : ");
            String tempS = reader.readLine();
            if(tempS.equals("exit")){
                choice = false;
            }else {
                main.WriteWord(filePathWriteWord , tempS);

                if (ch == 1){
                    System.out.print("Encryption : ");
                    EncryptionL encl = new EncryptionL(tempS);
                    System.out.println("");
                    System.out.println("Encryption number : " + encl.getEncryptionText());
                    main.WriteEncryption(filePathEncryption ,encl.getEncryptionText() );

                    DescriptionL desc = new DescriptionL(encl.getEncryptionText());
                    System.out.println("Description : " + desc.getDescriptionText());
                    main.WriteDescription(filePathDescription ,desc.getDescriptionText() );
                    System.out.println("");
                }else {
                    System.out.print("Encryption : ");
                    EncryptionK enck = new EncryptionK(tempS);
                    System.out.println("");
                    System.out.println("Encryption number : " + enck.getEncryptionText());
                    main.WriteEncryption(filePathEncryption ,enck.getEncryptionText() );

                    DescriptionL desck = new DescriptionL(enck.getEncryptionText());
                    System.out.println("Description : " + desck.getDescriptionText());
                    main.WriteDescription(filePathDescription ,desck.getDescriptionText() );
                    System.out.println("");
                }
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