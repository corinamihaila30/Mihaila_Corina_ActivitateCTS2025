package reports.reports;

import reports.companies.Atlas;
import reports.companies.Company;

public abstract class GenerateTrustScore {

    public abstract Company createCompany();

    public float generateTrustScore(){
        Company company = createCompany();
        float result = company.expertiseYears/company.amountOfLoses;
        System.out.println(result);
        return result;
    }
}
