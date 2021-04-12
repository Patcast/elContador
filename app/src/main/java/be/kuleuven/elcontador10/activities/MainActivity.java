package be.kuleuven.elcontador10.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import be.kuleuven.elcontador10.R;
import be.kuleuven.elcontador10.model.Transaction;

public class MainActivity extends AppCompatActivity {
    private Button ButtonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonSubmit = findViewById(R.id.btn_submit);
    }

    private Transaction makeTransaction(){
        EditText txtAmount = (EditText) findViewById(R.id.edTxt_Amount);
        EditText txtPerson = (EditText) findViewById(R.id.edTxt_PaidBy);
        Spinner spCategory = (Spinner) findViewById(R.id.spinner_Category);
        Spinner spSubCategory = (Spinner) findViewById(R.id.spinner_SubCategory);
       EditText txtComments = findViewById(R.id.edTxt_comments);
        Transaction newTransaction = new Transaction(
                true,
                txtAmount.getText().toString(),
                txtPerson.getText().toString(),
                spCategory.getSelectedItem().toString(),
                spSubCategory.getSelectedItem().toString(),
                txtComments.getText().toString());
        return newTransaction;
    }

}