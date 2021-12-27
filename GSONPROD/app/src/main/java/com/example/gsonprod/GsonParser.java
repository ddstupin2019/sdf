package com.example.gsonprod;


import com.google.gson.Gson;

import java.io.FileReader;

public class GsonParser {
    public Root parce(){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("C:\\Users\\topas\\Downloads\\JSon.json")){

            Root root = gson.fromJson(reader, Root.class);
            return root;

        }catch (Exception e){
            System.out.println("kjsdh");
        }



        return null;
    }

}
