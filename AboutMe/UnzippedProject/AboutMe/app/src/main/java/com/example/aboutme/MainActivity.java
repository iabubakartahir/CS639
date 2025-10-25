package com.example.aboutme;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import com.example.aboutme.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private boolean isOnHomePage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Set up the toolbar
        setSupportActionBar(binding.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(false); // Initially no back button
        }

        // Set up floating action button
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, getString(R.string.fab_message), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Load the home fragment by default
        if (savedInstanceState == null) {
            loadFragment(new BiographyFragment());
            setTitle(getString(R.string.biography_title));
            isOnHomePage = true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        
        if (id == android.R.id.home) {
            // Handle back button click
            navigateToHome();
            return true;
        } else if (id == R.id.action_settings) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_about) {
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Method to load fragments
    public void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    // Method to navigate to hobbies fragment
    public void navigateToHobbies() {
        loadFragment(new HobbiesFragment());
        setTitle(getString(R.string.hobbies_title));
        showBackButton();
        isOnHomePage = false;
    }

    // Method to navigate to contact fragment  
    public void navigateToContact() {
        Toast.makeText(this, getString(R.string.contact_toast_message), Toast.LENGTH_SHORT).show();
        loadFragment(new FragmentThird());
        setTitle(getString(R.string.contact_title));
        showBackButton();
        isOnHomePage = false;
    }

    // Method to navigate back to home
    public void navigateToHome() {
        loadFragment(new BiographyFragment());
        setTitle(getString(R.string.biography_title));
        hideBackButton();
        isOnHomePage = true;
    }

    // Show back button in toolbar
    private void showBackButton() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    // Hide back button in toolbar
    private void hideBackButton() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(false);
        }
    }

    @Override
    public void onBackPressed() {
        if (!isOnHomePage) {
            navigateToHome();
        } else {
            super.onBackPressed();
        }
    }
}
