package reports.reports;

import reports.companies.Company;
import reports.companies.Yves;

public class YvesCreator extends GenerateTrustScore{
    @Override
    public Company createCompany() {
        return new Yves();
    }
}
