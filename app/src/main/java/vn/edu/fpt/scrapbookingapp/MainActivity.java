package vn.edu.fpt.scrapbookingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Set up click handlers for flag images
        setupFlagClickHandlers();
    }
    
    private void setupFlagClickHandlers() {
        // Vietnam flag
        ImageView vietnamFlag = findViewById(R.id.vietnam_flag);
        setupFlagClickHandler(vietnamFlag, R.string.country_vietnam, R.string.flag_vietnam_description);
        
        // Korea flag
        ImageView koreaFlag = findViewById(R.id.korea_flag);
        setupFlagClickHandler(koreaFlag, R.string.country_korea, R.string.flag_korea_description);
        
        // Japan flag
        ImageView japanFlag = findViewById(R.id.japan_flag);
        setupFlagClickHandler(japanFlag, R.string.country_japan, R.string.flag_japan_description);
        
        // France flag
        ImageView franceFlag = findViewById(R.id.france_flag);
        setupFlagClickHandler(franceFlag, R.string.country_france, R.string.flag_france_description);
    }
    
    private void setupFlagClickHandler(ImageView flagView, int countryNameResId, int flagDescriptionResId) {
        // Set click listener for visual feedback
        flagView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countryName = getString(countryNameResId);
                String flagDescription = getString(flagDescriptionResId);
                String message = countryName + ": " + flagDescription;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}