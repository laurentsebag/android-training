package com.example.laurent.search.catalogue;

public interface CatalogueRepository {

    interface GetCatalogueCallback {
        void onLoad();

        void onError();
    }

    void getCatalogue(GetCatalogueCallback callback);
}
