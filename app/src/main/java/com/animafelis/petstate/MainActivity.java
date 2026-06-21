package com.animafelis.petstate;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Pet pet;

    private TextView tvPetEmoji;
    private TextView tvPetState;
    private ProgressBar pbHunger;
    private ProgressBar pbHappiness;
    private ProgressBar pbEnergy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pet = new Pet();

        tvPetEmoji = findViewById(R.id.tvPetEmoji);
        tvPetState = findViewById(R.id.tvPetState);
        pbHunger = findViewById(R.id.pbHunger);
        pbHappiness = findViewById(R.id.pbHappiness);
        pbEnergy = findViewById(R.id.pbEnergy);

        Button btnFeed = findViewById(R.id.btnFeed);
        Button btnPlay = findViewById(R.id.btnPlay);
        Button btnRest = findViewById(R.id.btnRest);
        Button btnIgnore = findViewById(R.id.btnIgnore);

        btnFeed.setOnClickListener(v -> {
            pet.feed();
            updateUI();
        });

        btnPlay.setOnClickListener(v -> {
            pet.play();
            updateUI();
        });

        btnRest.setOnClickListener(v -> {
            pet.rest();
            updateUI();
        });

        btnIgnore.setOnClickListener(v -> {
            pet.ignore();
            updateUI();
        });

        updateUI();
    }

    private void updateUI() {
        pbHunger.setProgress(pet.getHunger());
        pbHappiness.setProgress(pet.getHappiness());
        pbEnergy.setProgress(pet.getEnergy());

        PetState state = pet.getState();
        tvPetState.setText(state.toString());

        switch (state) {
            case HAPPY:
                tvPetEmoji.setText("😺");
                break;
            case SAD:
                tvPetEmoji.setText("😿");
                break;
            case HUNGRY:
                tvPetEmoji.setText("🐱");
                break;
            case TIRED:
                tvPetEmoji.setText("😾");
                break;
            case NEGLECTED:
                tvPetEmoji.setText("🙀");
                break;
        }
    }
}