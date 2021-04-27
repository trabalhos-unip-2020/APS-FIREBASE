package com.mycompany.firebase.util;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mycompany.firebase.model.SpcModel;
import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diogo Enrico Mariana
 */


public class CsvConvert {
    
    private static final String CSV_FILE_PATH = "./data.csv";
    private final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private final DatabaseReference spcRef = database.getReference().child("bananinha");
    
//    public CsvConvert(boolean clear) {
//
//        csvConvert(clear);
//    }

    public CsvConvert(boolean clear) {
        csvConvert(clear);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void csvConvert(boolean clear) {
        try {
            String site = "http://dados.mma.gov.br/dataset/41a79b71-445f-4a6a-8c70-d46af991292a/resource/1f13b062-f3f6-4198-a4c5-3581548bebec/download/lista-de-especies-ameacas-2020.csv";
            URL objURL = new URL(site);
            BufferedReader leitorCsv = new BufferedReader(new InputStreamReader(objURL.openStream()));
            Reader leitor = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
            CSVReader csv = new CSVReader(leitorCsv, ';');

            String[] nextRecord;
            csv.readNext();

            int i = 0;
            Map<String, SpcModel> bananinha = new HashMap<>();
            while ((nextRecord = csv.readNext()) != null) {
                i++;

                Integer number_to_string = new Integer(i);

                SpcModel bananaFlex = new SpcModel();

                bananaFlex.setFauflo(nextRecord[0]);
                bananaFlex.setGrupo(nextRecord[1]);
                bananaFlex.setFamilia(nextRecord[2]);
                bananaFlex.setEspecie(nextRecord[3]);
                bananaFlex.setNome_comum(nextRecord[4]);
                bananaFlex.setCategoria(nextRecord[5]);
                bananaFlex.setBioma(nextRecord[6]);
                bananaFlex.setAmeaca(nextRecord[7]);
                bananaFlex.setEstado(nextRecord[8]);
                if (!clear) {
                    bananinha.put(number_to_string.toString(), bananaFlex);
                }

            }
            spcRef.setValueAsync(bananinha);

        } catch (IOException err) {
            System.out.println(err);
        }
    }
}
