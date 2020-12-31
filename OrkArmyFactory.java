package sample;

public class OrkArmyFactory extends Army{

    public Warlord warlord(){
        return new  OrkWarlord();
    }


    public General general(){
        return new OrkGeneral();
    }


    public Soldiery soldiery(){
        return new OrkSoldiery();
    }
}
