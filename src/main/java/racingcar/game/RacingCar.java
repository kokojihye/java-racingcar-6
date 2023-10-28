package racingcar.game;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {
    private String carName;
    public int setRandomNumber(){
        return Randoms.pickNumberInRange(0,9);
    }

    public void setCarName(String carName){
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
