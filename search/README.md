# Search experiment

Simple search activity to experiment with:
 - [Dagger2](https://github.com/google/dagger)
 - [Gson](https://github.com/google/gson)
 - retrofit
 - constraint layout

## Work in progress...

----

## Todo list
- Make the search modular to be able to switch between different APIs to search


--

## Dependency Injection with Dagger2

### Example: Simple class member injection - CataloguePresenter

We have a presenter, `CataloguePresenter` that uses a repository class ,`CatalogueRepository`, to obtain the data from
some rest API. We inject the repository in `CataloguePresenter` and look at the generated code by Dagger2.

#### Application code

```
public class CataloguePresenter implements CatalogueContract.CatalogueActionsListener {
    private static final String TAG = CataloguePresenter.class.getSimpleName();

    @Inject
    CatalogueRepository repository;

    public CataloguePresenter() {
        Log.d(TAG, repository); // --> null
        SearchApplication.getComponent().inject(this);
        Log.d(TAG, repository); // --> instance of repository
    }
}
```

```
@Singleton
@Component(modules = {CatalogueModule.class})
public interface AppComponent {
    void inject(CataloguePresenter cataloguePresenter);
}
```

```
@Module
public class CatalogueModule {
    @Provides
    CatalogueRepository provideCatalogueRepository() {
        return new CatalogueRepositoryImpl();
    }
}
```

#### Generated code

`DaggerAppComponent` is generated from our `AppComponent` interface, it provides the inject method called in
`CataloguePresenter`'s constructor.

```
public final class DaggerAppComponent implements AppComponent {
  private MembersInjector<CataloguePresenter> cataloguePresenterMembersInjector;

  @Override
  public void inject(CataloguePresenter cataloguePresenter) {
    cataloguePresenterMembersInjector.injectMembers(cataloguePresenter);
  }
}
```

```
public final class CataloguePresenter_MembersInjector implements MembersInjector<CataloguePresenter> {
    @Override
    public void injectMembers(CataloguePresenter instance) {
      if (instance == null) {
        throw new NullPointerException("Cannot inject members into a null reference");
      }
      instance.repository = repositoryProvider.get();
    }
}
```

### Example: Singleton injection - CatalogueRepository

work in progress
