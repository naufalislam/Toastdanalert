package com.pale.toastdanalert;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class TerimaDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terima_data);

        //set dialog alert
        LayoutInflater inflater = getLayoutInflater();
        View v =
                inflater.inflate(R.layout.activity_terima_data,null);
        final EditText edtUser =
                (EditText)v.findViewById(R.id.edtUsername);
        final TextInputEditText textPsw =
                (TextInputEditText)v.findViewById(R.id.edtpassword);
        AlertDialog.Builder builder = new
                AlertDialog.Builder(TerimaDataActivity.this);
        builder.setView(v);
        builder.setPositiveButton("Ok", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int
                            i) {
                        startActivity(new Intent(TerimaDataActivity.this,
                                MainActivity.class));
                        finish();
                    }
                });
        builder.show();
        //memgambil data activity
        Intent intentterima = getIntent();
        edtUser.setText(intentterima.getStringExtra("US"));
        textPsw.setText(intentterima.getStringExtra("PW"));

    }
}
