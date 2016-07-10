package com.example.laurent.search.catalogue;

import dagger.Module;
import dagger.Provides;

@Module
public class CatalogueModule {

    @Provides
    CatalogueContract.CatalogueActionsListener provideActionsListener() {
        return new CataloguePresenter();
    }

    @Provides
    CatalogueRepository provideCatalogueRepository() {
        return new CatalogueRepositoryImpl();
    }
}
