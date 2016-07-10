package com.example.laurent.search.catalogue;

import android.util.Log;

public class CatalogueRepositoryImpl implements CatalogueRepository {

    private static final String TAG = CatalogueRepositoryImpl.class.getSimpleName();

    public CatalogueRepositoryImpl() {
        Log.d(TAG, "constructor");
    }

    @Override
    public void getCatalogue(GetCatalogueCallback callback) {

    }
}
