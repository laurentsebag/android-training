package com.example.laurent.search;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Inject;

public class FeatureManager {

    private static final String PREFERENCE_KEY_USE_GITHUB_SEARCH = "use_github_search";
    private SharedPreferences sharedPreferences;

    @Inject
    public FeatureManager(SharedPreferences sharedPreferences) {
        SearchApplication.getComponent().inject(this);
        this.sharedPreferences = sharedPreferences;
    }

    public boolean useGithubSearch() {
        sharedPreferences.getBoolean(PREFERENCE_KEY_USE_GITHUB_SEARCH, false);
        return false;
    }
}
