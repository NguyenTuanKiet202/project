package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

//KHAI BAO CAC VIEW TREN GIAO DIEN
    EditText txtNhapA, txtNhapB;
    TextView lblKetQua;
    Button btnTong, btnHieu, btnTich, btnThuong, btnUSCLN, btnThoat ;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addView();
        addEvents();

    }

    private void addEvents() {
    btnHieu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //BUOC1: LAY DU LIEU TU FORM
            double a = Double.parseDouble(txtNhapA.getText().toString().strip());
            double b = Double.parseDouble(txtNhapB.getText().toString().strip());

            //BUOC2: TINH TONG VA HIEN KQ
            lblKetQua.setText("Kết quả: " + (a - b));
        }

        });

    btnTich.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //BUOC1: LAY DU LIEU TU FORM
            double a = Double.parseDouble(txtNhapA.getText().toString().strip());
            double b = Double.parseDouble(txtNhapB.getText().toString().strip());

            //BUOC2: TINH TONG VA HIEN KQ
            lblKetQua.setText("Kết quả: " + (a * b));
        }
    });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //BUOC1: LAY DU LIEU TU FORM
                double a = Double.parseDouble(txtNhapA.getText().toString().strip());
                double b = Double.parseDouble(txtNhapB.getText().toString().strip());

                //BUOC2: TINH TONG VA HIEN KQ
                lblKetQua.setText("Kết quả: " + (a / b));
            }
        });
        btnUSCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //BUOC1: LAY DU LIEU TU FORM
                int a = Integer.parseInt(txtNhapA.getText().toString().strip());
                int b = Integer.parseInt(txtNhapB.getText().toString().strip());

                for (int i=1; i<a; i++)
                {
                    if (a % i==0);

                }

                //BUOC2: TINH TONG VA HIEN KQ
                lblKetQua.setText("Kết quả: " + (a / b));
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void addView() {
        txtNhapA=(EditText) findViewById(R.id.txtNhapA);
        txtNhapB=(EditText) findViewById(R.id.txtNhapB);
        lblKetQua=(TextView) findViewById(R.id.lblKetQua);
        btnTong=(Button) findViewById(R.id.btnTong);
        btnHieu=(Button) findViewById(R.id.btnHieu);
        btnTich=(Button) findViewById(R.id.btnTich);
        btnThuong=(Button) findViewById(R.id.btnThuong);
        btnUSCLN=(Button) findViewById(R.id.btnUSCLN);
        btnThoat=(Button) findViewById(R.id.btnThoat);

    }

    public void tinhTong(View view) {
    //BUOC1: LAY DU LIEU TU FORM
        double a = Double.parseDouble(txtNhapA.getText().toString().strip());
        double b = Double.parseDouble(txtNhapB.getText().toString().strip());

        //BUOC2: TINH TONG VA HIEN KQ
        lblKetQua.setText("Kết quả: " + (a + b));
    }

}
