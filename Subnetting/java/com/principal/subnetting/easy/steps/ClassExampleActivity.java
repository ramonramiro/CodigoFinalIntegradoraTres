package com.principal.subnetting.easy.steps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import com.principal.subnetting.easy.R;


public class ClassExampleActivity extends AppCompatActivity {

    private EditText edtEnterData;
    private Button btSubmitData;
    private TextView tvFedback;


    String address1;
    String address2;
    String address3; // 255.255.255.192
    String address4; // 255.255.240.0
    String address5;

    int acco;
    int index = 5;
    Random rand = new Random();
    ArrayList<String> addresses = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);


        address1= getString(R.string.add_one); //254 privada
        address2 = getString(R.string.add_two); //	16,777,214  privada
        address3= getString(R.string.add_three); //65,534 privada
        address4= getString(R.string.add_four); //16,777,214 privada
        address5= getString(R.string.add_five);// 	4,194,302  publica, experimental D

        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        addresses.add(address4);
        addresses.add(address5);


        acco = 5;
        index = 0;

        //Vincular vistas

//        showAddress  = findViewById(R.id.showAddress);
        edtEnterData = findViewById(R.id.edt_enter_data);
        tvFedback = findViewById(R.id.tv_fedback);
        btSubmitData = findViewById(R.id.bt_submit_network);

        final EditText showStart = findViewById(R.id.edt_show_address);
        final TextView showFedback = findViewById(R.id.tv_fedback);
        final ImageView imgBack = findViewById(R.id.image_back);

        index = rand.nextInt(5);

        showStart.setText(addresses.get(index));
        showStart.setEnabled(false);

        showFedback.setText(R.string.fedback);


        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        btSubmitData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String edtSubmint1 = edtEnterData.getText().toString().trim();

                if (TextUtils.isEmpty(edtSubmint1)) {

                    Toast.makeText(ClassExampleActivity.this, R.string.fill_field, Toast.LENGTH_LONG).show();

                    return;
                }

                int enteredAddress = Integer.valueOf(edtSubmint1);

             //   Log.d("QUIZ ", "Muestra indice  " + index);

                if (addresses.size() >=1 ) {

                    switch (index) {
                        case 0:
                            if (enteredAddress <=245  ) {

                                tvFedback.setText(R.string.answer1);
                                Toast.makeText(ClassExampleActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");

                            } else {

                                tvFedback.setText(R.string.answer2);
                                Toast.makeText(ClassExampleActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");
                                // return;

                            }
                            break;

                        case 1:
                            if (enteredAddress <=245) {

                                tvFedback.setText(R.string.answer3);
                                Toast.makeText(ClassExampleActivity.this, R.string.error1, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");
                                //return;
                            } else if (enteredAddress >= 255 && enteredAddress <=2500) {
                                // tvFedback.setText(addresses.get(index));
                                tvFedback.setText(R.string.answer4);
                                Toast.makeText(ClassExampleActivity.this, R.string.error2, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");
                            } else {


                                tvFedback.setText(R.string.answer5);
                                Toast.makeText(ClassExampleActivity.this, R.string.answer6, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");


                            }
                            break;
                        case 2:
                            if (enteredAddress <=245) {

                                tvFedback.setText(R.string.answer7);
                                Toast.makeText(ClassExampleActivity.this, R.string.error4, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");
                                //return;
                            } else  if (enteredAddress >=255 && enteredAddress <=2500 ){

                                tvFedback.setText(R.string.answer8);
                                Toast.makeText(ClassExampleActivity.this, R.string.error6, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");
                            } else  {

                                tvFedback.setText(R.string.answer9);
                                Toast.makeText(ClassExampleActivity.this, R.string.error5, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");

                            }
                            break;
                        case 3:
                            if (enteredAddress <=245) {

                                tvFedback.setText(R.string.answer10);
                                Toast.makeText(ClassExampleActivity.this, R.string.answer12, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");
                                //return;

                            } else if (enteredAddress >= 255 && enteredAddress <=2500){
                                Toast.makeText(ClassExampleActivity.this, R.string.error7, Toast.LENGTH_LONG).show();

                                tvFedback.setText(R.string.answer13);
                                edtEnterData.setText("");

                            } else {

                                tvFedback.setText(R.string.answer14);
                                Toast.makeText(ClassExampleActivity.this, R.string.error9, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");
                            }

                            break;
                        case 4:
                            if (enteredAddress >=1) {

                                tvFedback.setText(R.string.answer16);
                                Toast.makeText(ClassExampleActivity.this, R.string.error8, Toast.LENGTH_LONG).show();
                                edtEnterData.setText("");
                                // return;
                            }
                            break;
                        default:

                            //Lg.d("mostrar retroalimentacion", "hh" + index);
                            tvFedback.setText(R.string.finaliz);
                            Toast.makeText(ClassExampleActivity.this, R.string.finaliz, Toast.LENGTH_LONG).show();

                            //   fileList();

                    }

                    if (addresses.size() >=1) {
                  //      Log.d("QUIZ ", "Removiendo indice  " + index);
                        addresses.remove(index);


                        if (addresses.size() == 0) {
                            Toast.makeText(ClassExampleActivity.this, R.string.finaliz, Toast.LENGTH_LONG).show();
                            return;
                        }
                        if (tvFedback.getTextSize() ==0) {
                            Toast.makeText(ClassExampleActivity.this, R.string.finaliz, Toast.LENGTH_LONG).show();
                            return;
                        }



                        index = rand.nextInt(addresses.size());
                        showStart.setText(addresses.get(index));

                    }




                }


            }
        });


    }

}
