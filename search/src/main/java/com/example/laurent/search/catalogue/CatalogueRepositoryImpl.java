package com.example.laurent.search.catalogue;

import android.util.Log;

import com.example.laurent.search.FeatureManager;
import com.example.laurent.search.SearchApplication;

import javax.inject.Inject;

public class CatalogueRepositoryImpl implements CatalogueRepository {

    private static final String TAG = CatalogueRepositoryImpl.class.getSimpleName();
    private final FeatureManager featureManager;

    @Inject
    public CatalogueRepositoryImpl(FeatureManager featureManager) {
        Log.d(TAG, "constructor");
        SearchApplication.getComponent().inject(this);
        this.featureManager = featureManager;
    }

    @Override
    public void getCatalogue(GetCatalogueCallback callback) {
        if (featureManager.useGithubSearch()) {
            Log.d(TAG, "getCatalogue from github apis");
        } else {
            Log.d(TAG, "getCatalogue from other");
        }
    }
}
