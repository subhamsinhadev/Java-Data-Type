package subham.sinha.dev.datatypes;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import subham.sinha.dev.datatypes.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private MaterialButton summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showSummary();
        summary=findViewById(R.id.summary);
        summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Java Data Types");

                View view = getLayoutInflater().inflate(R.layout.datatypes, null);
                builder.setView(view);

                builder.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });




        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i=new Intent().setAction(Intent.ACTION_VIEW).setData(Uri.parse("https://github.com/subhamsinhadev/Java-Data-Type"));
           startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showSummary() {
        // ========= Primitive Data Types =========
        byte age = 25;  // 1 byte
        short villagePop = 32000;  // 2 bytes
        int salary = 50000; // 4 bytes
        long aadhaar = 987654321012L; // 8 bytes
        float temp = 36.6f; // 4 bytes
        double pi = 3.1415926535; // 8 bytes
        boolean isEligible = true; // 1 bit
        char grade = 'A'; // 2 bytes

        // ========= Non-Primitive Data Types =========
        String name = "Subham";
        int marks[] = {85, 90, 78};
        Student student = new Student("Rahul", 101);  // Object of a class
        Integer num = Integer.valueOf(100); // Wrapper class
        StringBuilder sb = new StringBuilder("Java"); // Library object

        // ========= Prepare a summary =========
        StringBuilder summary = new StringBuilder();
        summary.append("byte: ").append(age).append("\n");
        summary.append("short: ").append(villagePop).append("\n");
        summary.append("int: ").append(salary).append("\n");
        summary.append("long: ").append(aadhaar).append("\n");
        summary.append("float: ").append(temp).append("\n");
        summary.append("double: ").append(pi).append("\n");
        summary.append("boolean: ").append(isEligible).append("\n");
        summary.append("char: ").append(grade).append("\n\n");

        summary.append("String: ").append(name).append("\n");
        summary.append("Array[0]: ").append(marks[0]).append("\n");
        summary.append("Object: ").append(student.getName()).append(", Roll ").append(student.getRoll()).append("\n");
        summary.append("Wrapper: ").append(num).append("\n");
        summary.append("Library Obj: ").append(sb.toString()).append("\n");

        // ========= Show result in Toast =========
        Toast.makeText(this, summary.toString(), Toast.LENGTH_LONG).show();
    }

    // Example Class
    static class Student {
        private String name;
        private int roll;

        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

        public String getName() {
            return name;
        }

        public int getRoll() {
            return roll;
        }
    }

    public void librarydemo(View v) {
        // Create a Dialog
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_librarydemo);
        dialog.setTitle("Library Object Demo");

        // Get references
        EditText input = dialog.findViewById(R.id.inputText);
        Button buildBtn = dialog.findViewById(R.id.buildBtn);
        TextView result = dialog.findViewById(R.id.resultText);

        // Button click action
        buildBtn.setOnClickListener(view -> {
            String text = input.getText().toString();
            if (text.isEmpty()) {
                result.setText("⚠ Please enter text!");
            } else {
                // Demo with StringBuilder
                StringBuilder sb = new StringBuilder(text);
                sb.reverse(); // Example operation
                result.setText("Original: " + text + "\nReversed: " + sb.toString());
            }
        });

        dialog.show();
    }

}