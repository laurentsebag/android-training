package com.example.laurent.search.catalogue;

import java.util.List;

public interface CatalogueContract {

    interface CatalogueView {
        void setLoadingSpinner(boolean loading);

        void displayCatalogue(List<String> catalogue);

        void startSearchActivity();

        void showLoadError();
    }

    interface CatalogueActionsListener {
        void requestCatalogue();

        void cancelRequests();

        void openSearch();
    }
}
