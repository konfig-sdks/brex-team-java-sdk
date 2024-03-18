package com.konfigthis.client;

import com.konfigthis.client.api.CardsApi;
import com.konfigthis.client.api.CompaniesApi;
import com.konfigthis.client.api.DepartmentsApi;
import com.konfigthis.client.api.LocationsApi;
import com.konfigthis.client.api.TitlesApi;
import com.konfigthis.client.api.UsersApi;

public class BrexTeam {
    private ApiClient apiClient;
    public final CardsApi cards;
    public final CompaniesApi companies;
    public final DepartmentsApi departments;
    public final LocationsApi locations;
    public final TitlesApi titles;
    public final UsersApi users;

    public BrexTeam() {
        this(null);
    }

    public BrexTeam(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.cards = new CardsApi(this.apiClient);
        this.companies = new CompaniesApi(this.apiClient);
        this.departments = new DepartmentsApi(this.apiClient);
        this.locations = new LocationsApi(this.apiClient);
        this.titles = new TitlesApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
    }

}
