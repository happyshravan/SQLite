package abcd.shravankr.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView shravansText;
    EditText shravansInput;
    MyDBHandler dbHandler;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText shravansInput=(EditText)findViewById(R.id.shravansInput);
        TextView shravansText= (TextView)findViewById(R.id.shravansText);

        dbHandler=new MyDBHandler(this,null,null,1);
        printDatabase();
    }
    public void addButtonClicked(View view){
        try{
            Toast.makeText(getApplicationContext(),"Shravan",Toast.LENGTH_LONG).show();
            Products product = new Products(shravansInput.getText().toString());
            dbHandler.addProduct(product);
            printDatabase();}catch (Exception e){}

    }
    public void deleteButtonClicked (View view){
        String inputText=shravansInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }
    public void printDatabase(){
        String dbString=dbHandler.databaseToString();

        //shravansText.setText(dbString);
        //shravansInput.setText("");
    }
}
