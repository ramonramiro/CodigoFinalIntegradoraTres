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

public class StepFourActivity extends AppCompatActivity {

    private Button btShowsNetwork, btShowsFirst, btShowsResultLast, btShowsResultFour, btSubmitNetwork, btSubmitFirst, btnSubmitLast, btSubmitBroadcast;
    private TextView tvAnswerNetwork, tvAnswerFirst, tvAnswerLast, tvAnswerBroadcast, tvSourceFormat, tvSourceFormatFourTwo, btSourceFormatThree, btSourceFormatFour, tvSourceLast;
    private EditText edtBoxNetworkTwo, edtBoxNetwork, edtBoxFirst, edtBoxFirstTwo, edtBoxFirstLast, edtBoxFirstLastTwo, edtBroadcast, edtBroadcastTwo;
    private Typeface all;
    private ImageView imageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_four);

        btShowsNetwork = findViewById(R.id.bt_shows_network);
        btSubmitNetwork = findViewById(R.id.bt_submit_network);
        edtBoxNetworkTwo = findViewById(R.id.edt_box_network2);
        edtBoxNetwork = findViewById(R.id.edt_box_network);
        tvAnswerNetwork = findViewById(R.id.tv_answer_network);

        btSubmitFirst = findViewById(R.id.bt_submit_first);
        btShowsFirst = findViewById(R.id.bt_shows_first);
        edtBoxFirst = findViewById(R.id.edt_box_first);
        edtBoxFirstTwo = findViewById(R.id.edt_box_first2);
        tvAnswerFirst = findViewById(R.id.tv_answer_first);

        btnSubmitLast = findViewById(R.id.btn_submit_last);
        btShowsResultLast = findViewById(R.id.bt_shows_result_last);
        edtBoxFirstLast = findViewById(R.id.edt_box_first_last);
        edtBoxFirstLastTwo = findViewById(R.id.edt_box_first_last2);
        tvAnswerLast = findViewById(R.id.tv_answer_last);

        btSubmitBroadcast = findViewById(R.id.bt_submit_broadcast);
        btShowsResultFour =findViewById(R.id.bt_shows_result4);
        edtBroadcast = findViewById(R.id.edt_broadcast);
        edtBroadcastTwo = findViewById(R.id.edt_broadcast2);
        tvAnswerBroadcast = findViewById(R.id.tv_answer_broadcast);
        imageBack = findViewById(R.id.image_back);

        tvSourceFormat = findViewById(R.id.tv_source_format);
        tvSourceFormatFourTwo = findViewById(R.id.tv_source_format_four2);
        btSourceFormatThree = findViewById(R.id.bt_source_format3);
        btSourceFormatFour = findViewById(R.id.bt_source_format4);
        tvSourceLast = findViewById(R.id.tv_source_last);


        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btSubmitNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String boxNetworkOne = edtBoxNetworkTwo.getText().toString().trim();
                String boxNetworkTwo = edtBoxNetwork.getText().toString().trim();

                if (TextUtils.isEmpty(boxNetworkOne) || TextUtils.isEmpty(boxNetworkTwo)) {
                    Toast.makeText(StepFourActivity.this, R.string.validation_two, Toast.LENGTH_SHORT).show();
                    return;
                }
                if (boxNetworkOne.equals(getString(R.string.box_network)) && boxNetworkTwo.equals(getString(R.string.box_network_two))) {
                    Toast.makeText(StepFourActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                    edtBoxNetworkTwo.setText("");
                    edtBoxNetwork.setText("");
                } else {
                    Toast.makeText(StepFourActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                    edtBoxNetworkTwo.setText("");
                    edtBoxNetwork.setText("");
                }

            }
        });

        btShowsNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswerNetwork.setText(R.string.network_step_four);
                Toast.makeText(StepFourActivity.this, R.string.answer, Toast.LENGTH_LONG).show();


            }
        });

        btSubmitFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String boxFirstNetworkOne = edtBoxFirst.getText().toString().trim();
                String boxFirstNetworkTwo = edtBoxFirstTwo.getText().toString().trim();

                if (TextUtils.isEmpty(boxFirstNetworkOne) || TextUtils.isEmpty(boxFirstNetworkTwo)) {
                    Toast.makeText(StepFourActivity.this, R.string.answer, Toast.LENGTH_SHORT).show();
                    return;
                }
                if (boxFirstNetworkOne.equals(getString(R.string.box_network_first_one)) && boxFirstNetworkTwo.equals(getString(R.string.box_network_first_two))) {
                    Toast.makeText(StepFourActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                    edtBoxFirst.setText("");
                    edtBoxFirstTwo.setText("");
                } else {
                    Toast.makeText(StepFourActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                    edtBoxFirst.setText("");
                    edtBoxFirstTwo.setText("");
                }
            }
        });

        btShowsFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswerFirst.setText(R.string.first_network_step_four);
                Toast.makeText(StepFourActivity.this, R.string.answer, Toast.LENGTH_LONG).show();
            }
        });

        btnSubmitLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String boxLastNetworkOne = edtBoxFirstLast.getText().toString().trim();
                String boxLastNetworkTwo = edtBoxFirstLastTwo.getText().toString().trim();

                if (TextUtils.isEmpty(boxLastNetworkOne) || TextUtils.isEmpty(boxLastNetworkTwo)) {
                    Toast.makeText(StepFourActivity.this, R.string.validation_two, Toast.LENGTH_SHORT).show();
                    return;
                }
                if (boxLastNetworkOne.equals(getString(R.string.box_network_last_one)) && boxLastNetworkTwo.equals(getString(R.string.box_network_last_two))) {
                    Toast.makeText(StepFourActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                    edtBoxFirstLast.setText("");
                    edtBoxFirstLastTwo.setText("");
                } else {
                    Toast.makeText(StepFourActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                    edtBoxFirstLast.setText("");
                    edtBoxFirstLastTwo.setText("");
                }
            }
        });

        btShowsResultLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswerLast.setText(R.string.file_network_step_four);
                Toast.makeText(StepFourActivity.this, R.string.answer, Toast.LENGTH_LONG).show();
            }
        });

        btSubmitBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String boxBroadcastOne = edtBroadcast.getText().toString().trim();
                String boxBroadcastTwo = edtBroadcastTwo.getText().toString().trim();

                if (TextUtils.isEmpty(boxBroadcastOne) || TextUtils.isEmpty(boxBroadcastTwo)) {
                    Toast.makeText(StepFourActivity.this, R.string.validation_two, Toast.LENGTH_SHORT).show();
                    return;
                }
                if (boxBroadcastOne.equals(getString(R.string.box_broadcast_one)) && boxBroadcastTwo.equals(getString(R.string.box_broadcast_two))) {
                    Toast.makeText(StepFourActivity.this, R.string.its_ok, Toast.LENGTH_LONG).show();
                    edtBroadcast.setText("");
                    edtBroadcastTwo.setText("");
                } else {
                    Toast.makeText(StepFourActivity.this, R.string.its_file, Toast.LENGTH_LONG).show();
                    edtBroadcast.setText("");
                    edtBroadcastTwo.setText("");
                }
            }
        });

        btShowsResultFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswerBroadcast.setText(R.string.broadcast_network_step_four);
                Toast.makeText(StepFourActivity.this,  R.string.answer, Toast.LENGTH_LONG).show();
            }
        });

        String font = "font/all.otf";
        this.all = Typeface.createFromAsset(getAssets(), font);
        tvSourceFormat.setTypeface(all);
        tvSourceFormatFourTwo.setTypeface(all);
        btSourceFormatThree.setTypeface(all);
        btSourceFormatFour.setTypeface(all);
        tvSourceLast.setTypeface(all);

    }

}
