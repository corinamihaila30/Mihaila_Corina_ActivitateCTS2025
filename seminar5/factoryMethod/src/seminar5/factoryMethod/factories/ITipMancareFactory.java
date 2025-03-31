package seminar5.factoryMethod.factories;

public interface ITipMancareFactory {
    FelDeMancare preparaMancare(ITipMancareFactory tipMancareFactory, Float pret, Integer nrCalorii);
}
