package spor_salonu;

import java.io.*;

public class Connect {
    public static void main(String[] args) throws IOException {
        String str = "id:1,kadi:yzlm23,sifre,123456,adi:kemal,soyadi:özdemir,tc:16542385694,tel:5265428572,cinsiyet:erkek,pozisyon:antrenör,egitim durumu:yüksek öğretim,bolum:yzlmmhndslh,başlama tarihi:01.04.2020";

        File file = new File("personel.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();


        FileReader fileReader = new FileReader(file);
        String line;

        BufferedReader br = new BufferedReader(fileReader);

        while ((line = br.readLine()) != null) {

            System.out.println(line);

        }

        br.close();


    }
}


