package com.example.laurent.search.catalogue;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.laurent.search.R;
import com.example.laurent.search.SearchApplication;

import java.util.List;

import javax.inject.Inject;

public class CatalogueFragment extends Fragment implements CatalogueContract.CatalogueView {

    private static final String TAG = CatalogueFragment.class.getSimpleName();

    @Inject
    CatalogueContract.CatalogueActionsListener actionsListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        SearchApplication.getComponent().inject(this);
        Log.d(TAG, "onCreateView actionsListener: " + actionsListener);
        return inflater.inflate(R.layout.fragment_catalogue, container, false);
    }

    @Override
    public void setLoadingSpinner(boolean loading) {

    }

    @Override
    public void displayCatalogue(List<String> catalogue) {

    }

    @Override
    public void startSearchActivity() {

    }

    @Override
    public void showLoadError() {

    }
}
