package com.principal.subnetting.easy.steps;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.principal.subnetting.easy.R;

import java.util.ArrayList;
import java.util.Random;

public class ActivityThreeActivity extends AppCompatActivity {

    private EditText edtDataAddress;
    private   Button btCheck;
    private   TextView tvSourceFormatFour;
    private EditText edtEntryData;
    private  Typeface allDesign;
    private ImageView imageBack;

    String adOne;
    String adTwo;
     String adThree;// 255.255.255.192
     String adFour; // 255.255.240.0
    String adFive; // 255.224.0.0

    int account;
    int index;
    Random rand = new Random();
    //creamos arreglo de tipo cadena
    ArrayList<String> binaries = new ArrayList<String>();
    ArrayList<String> decimals = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        adOne = getString(R.string.masc_bin_1); // 255.255.0.0
        adTwo = getString(R.string.mask_bin_2); //	255.128.0.0
        adThree= getString(R.string.mask_bin_3);
        adFour = getString(R.string.mask_bin_4);
       adFive = getString(R.string.mask_bin5);

        binaries.add(adOne);
        binaries.add(adTwo);
        binaries.add(adThree);
        binaries.add(adFour);
        binaries.add(adFive);

        decimals.add(getString(R.string.first));
        decimals.add(getString(R.string.second));
        decimals.add(getString(R.string.third));
        decimals.add(getString(R.string.fourth));
        decimals.add(getString(R.string.fifth));

        account = 5;
        index=0;

        //Vincular las vistas
        edtDataAddress = findViewById(R.id.edt_data_one);
        tvSourceFormatFour = findViewById(R.id.tv_source_format_four);
        final EditText classData = findViewById(R.id.edt_data_one);

        btCheck = findViewById(R.id.bt_check);
        edtEntryData =findViewById(R.id.tv_source_format_four2);

        imageBack = findViewById(R.id.image_back);

        index = rand.nextInt(5);

        classData.setText(binaries.get(index));
        classData.setEnabled(false);

        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        btCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stringData = edtEntryData.getText().toString().trim();

                if (TextUtils.isEmpty(stringData)) {

                    Toast.makeText(ActivityThreeActivity.this, R.string.fill_field, Toast.LENGTH_LONG).show();

                    return;
                }

                if(binaries.size() >= 1) {

                    switch (index) {
                        case 0: //adOne
                            if (stringData.equals(decimals.get(index))) {

                                Toast.makeText(ActivityThreeActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                                edtEntryData.setText("");
                            //    Log.d("QUIZ ", "Correcto!!");

                            } else {

                                Toast.makeText(ActivityThreeActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                                return;
                            }
                            break;

                        case 1:
                            if (stringData.equals(decimals.get(index))) {
                                Toast.makeText(ActivityThreeActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                                edtEntryData.setText("");
                           //     Log.d("QUIZ ", "Correcto!!");

                            } else {
                                Toast.makeText(ActivityThreeActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                                edtEntryData.setText("");
                                return;

                            }

                            break;
                        case 2:
                            if (stringData.equals(decimals.get(index))) {

                                Toast.makeText(ActivityThreeActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                                edtEntryData.setText("");
                                //Log.d("QUIZ ", "Correcto!!");

                            } else {
                                Toast.makeText(ActivityThreeActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                                edtEntryData.setText("");
                                return;
                            }
                            break;
                        case 3:
                            if (stringData.equals(decimals.get(index))) {

                                Toast.makeText(ActivityThreeActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                                edtEntryData.setText("");
                            //   Log.d("QUIZ ", "Correcto!!");
                            } else {
                                Toast.makeText(ActivityThreeActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                                edtEntryData.setText("");
                                return;

                            }

                            break;
                        case 4:
                            if (stringData.equals(decimals.get(index))) {
                                edtEntryData.setText("");
                                Toast.makeText(ActivityThreeActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                            //    Log.d("QUIZ ", "Correcto!!");

                            } else {
                                Toast.makeText(ActivityThreeActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                                edtEntryData.setText("");
                                return;
                            }

                            break;

                        default:

                            Toast.makeText(ActivityThreeActivity.this, R.string.end_return, Toast.LENGTH_LONG).show();

                    }

                    if (binaries.size() >= 1) {
                    //    Log.d("QUIZ ", "Removiendo " + index);
                        binaries.remove(index);
                        decimals.remove(index);

                        if (binaries.size() == 0){
                            Toast.makeText(ActivityThreeActivity.this,R.string.end_return, Toast.LENGTH_LONG).show();
                            return;

                        }
                        index = rand.nextInt(binaries.size());
                      //  Log.d("QUIZ ", "GENERADO " + index);
                        classData.setText(binaries.get(index));

                    }
                }
                }

        });

        String font = "font/all.otf";
        this.allDesign = Typeface.createFromAsset(getAssets(), font);
        tvSourceFormatFour.setTypeface(allDesign);
    }
}

