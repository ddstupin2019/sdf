package com.example.gsonprod;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.w3c.dom.Text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView text;
Button but;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        text=findViewById(R.id.text1);
        but=findViewById(R.id.button);
        but.setOnClickListener(this);


    }

    @Override
    public void onClick(View V) {
        switch (V.getId()){
            case R.id.button:
                GsonParser parser = new GsonParser();
                Root root = parser.parce();
                text.setText(root.getData());
        }
    }
}