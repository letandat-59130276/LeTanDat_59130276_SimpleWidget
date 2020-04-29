package vn.edu.ntu.letandat.letandat_59130276_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String textXN;
    EditText editName, editDateOfBirth, editOther;
    RadioGroup radggender;
    CheckBox checkFilm, checkMusic, checkCafe, checkHome, checkChicken;
    Button buttonXN;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }

    private void addView()
    {
        editName = findViewById(R.id.editName);
        editDateOfBirth = findViewById(R.id.editDateOfBirth);
        radggender = findViewById(R.id.radggender);
        checkFilm = findViewById(R.id.checkFilm);
        checkMusic = findViewById(R.id.checkMusic);
        checkCafe = findViewById(R.id.checkCafe);
        checkHome = findViewById(R.id.checkHome);
        checkChicken = findViewById(R.id.checkChicken);
        editOther = findViewById(R.id.editOther);
        buttonXN = findViewById(R.id.buttonXN);
    }

    private void addEvent()
    {
        buttonXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                xacNhan();
            }
        });
    }

    private void xacNhan()
    {
        textXN = editName.getText().toString()
                + "\n" + "Ngày sinh: " + editDateOfBirth.getText().toString()
                + "\n" + "Giới tính: ";

        if (radggender.getCheckedRadioButtonId() == R.id.radbBoy)
            textXN = textXN + "Nam" + "\n" + "Sở thích: ";
        else
            textXN = textXN + "Nữ" + "\n" + "Sở thích: ";

        if (checkFilm.isChecked())
            textXN = textXN + "Xem phim; ";
        if (checkMusic.isChecked())
            textXN = textXN + "Nghe nhạc; ";
        if (checkCafe.isChecked())
            textXN = textXN + "Đi cafe với bạn bè; ";
        if (checkHome.isChecked())
            textXN = textXN + "Ở nhà một mình; ";
        if (checkChicken.isChecked())
            textXN = textXN + "Vào bếp nấu ăn; ";

        textXN = textXN + editOther.getText().toString();
        Toast.makeText(getApplicationContext(), textXN, Toast.LENGTH_SHORT).show();
    }
}
