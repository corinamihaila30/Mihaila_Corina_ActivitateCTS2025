package reports.reports;

import reports.companies.Atlas;
import reports.companies.Company;

public class AtlasCreator extends GenerateTrustScore{
    @Override
    public Company createCompany() {
        return new Atlas("Atlas",100,10f,5f);
    }

    public void afiseazaCeva() {
        System.out.println("hello");
    }
}
