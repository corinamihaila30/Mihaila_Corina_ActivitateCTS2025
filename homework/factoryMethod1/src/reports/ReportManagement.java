package reports;

import reports.companies.Atlas;
import reports.reports.AtlasCreator;
import reports.reports.GenerateTrustScore;
import reports.reports.LorealCreator;

public class ReportManagement {
    public static void main(String[] args) {
        //referinta trebuie sa fie de tipul clasei de baza ca sa poata fi reutilzat, D - dependency inv.
        GenerateTrustScore atlasCreator=new LorealCreator();
        atlasCreator.generateTrustScore();
    }
}
