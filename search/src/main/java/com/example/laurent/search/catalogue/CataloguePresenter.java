package com.example.laurent.search.catalogue;

import android.util.Log;

import com.example.laurent.search.SearchApplication;

import javax.inject.Inject;

public class CataloguePresenter implements CatalogueContract.CatalogueActionsListener {
    private static final String TAG = CataloguePresenter.class.getSimpleName();

    @Inject
    CatalogueRepository repository;

    private CatalogueContract.CatalogueView catalogueView;

    public CataloguePresenter() {
        SearchApplication.getComponent().inject(this);
        Log.d(TAG, "constructor " + repository);
    }

    public void init(CatalogueContract.CatalogueView catalogueView) {
        this.catalogueView = catalogueView;
    }

    @Override
    public void requestCatalogue() {

    }

    @Override
    public void cancelRequests() {

    }

    @Override
    public void openSearch() {

    }
}
