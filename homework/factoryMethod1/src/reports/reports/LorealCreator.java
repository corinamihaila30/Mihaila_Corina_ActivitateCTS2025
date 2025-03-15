package reports.reports;

import reports.companies.Company;
import reports.companies.Loreal;

public class LorealCreator extends GenerateTrustScore{
    @Override
    public Company createCompany() {
        return new Loreal();
    }
}
