package com.example.crudapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CrudOperationsActivity extends AppCompatActivity {

    private EditText idField, nameField, emailField;
    private Button createButton, readButton, updateButton, deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_operations);

        idField = findViewById(R.id.idField);
        nameField = findViewById(R.id.nameField);
        emailField = findViewById(R.id.emailField);
        createButton = findViewById(R.id.createButton);
        readButton = findViewById(R.id.readButton);
        updateButton = findViewById(R.id.updateButton);
        deleteButton = findViewById(R.id.deleteButton);

        createButton.setOnClickListener(v -> createRecord());
        readButton.setOnClickListener(v -> readRecord());
        updateButton.setOnClickListener(v -> updateRecord());
        deleteButton.setOnClickListener(v -> deleteRecord());
    }

    private void createRecord() {
        String name = nameField.getText().toString();
        String email = emailField.getText().toString();

        // Use an API or database logic to create a new record
        Toast.makeText(this, "Record created: " + name, Toast.LENGTH_SHORT).show();
    }

    private void readRecord() {
        String id = idField.getText().toString();

        // Use an API or database logic to read a record by ID
        Toast.makeText(this, "Record retrieved for ID: " + id, Toast.LENGTH_SHORT).show();
    }

    private void updateRecord() {
        String id = idField.getText().toString();
        String name = nameField.getText().toString();
        String email = emailField.getText().toString();

        // Use an API or database logic to update a record by ID
        Toast.makeText(this, "Record updated: ID " + id, Toast.LENGTH_SHORT).show();
    }

    private void deleteRecord() {
        String id = idField.getText().toString();

        // Use an API or database logic to delete a record by ID
        Toast.makeText(this, "Record deleted: ID " + id, Toast.LENGTH_SHORT).show();
    }
}
