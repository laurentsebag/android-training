package com.example.laurent.search;

import com.example.laurent.search.catalogue.CatalogueFragment;
import com.example.laurent.search.catalogue.CatalogueModule;
import com.example.laurent.search.catalogue.CataloguePresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CatalogueModule.class})
public interface AppComponent {
    void inject(CatalogueFragment view);

    void inject(CataloguePresenter cataloguePresenter);
}
