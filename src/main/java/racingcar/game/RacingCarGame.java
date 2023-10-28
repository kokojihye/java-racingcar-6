package racingcar.game;

import racingcar.constant.MessageConst;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class RacingCarGame {
    public List<String> getCarName() {

        System.out.println(MessageConst.GET_CAR_NAME_MSG);
        String carNames = readLine();

        String[] carNameArray = carNames.split(",");
        List<String> carNameList = new ArrayList<>();

        for (String carName : carNameArray) {
            carNameList.add(carName.trim());
        }
        return carNameList;
    }

    public List<RacingCar> setRacingCar(){
        List<String> carNames = getCarName();
        List<RacingCar> racingCars =  new ArrayList<>();

        for(String carName : carNames){
            RacingCar racingCar = new RacingCar();
            racingCar.setCarName(carName);
            racingCars.add(racingCar);
        }
        return racingCars;
    }

    public int getGameCount(){
        System.out.println(MessageConst.GET_ATTEMPT_COUNT_MSG);
        return Integer.parseInt(readLine());
    }

    public void playGame(){
        List<RacingCar> racingCars = setRacingCar();
        int gameCount = getGameCount();

        System.out.println(MessageConst.REPORT_RESULT_MSG);
        for(int i=0; i<gameCount; i++){
            for (RacingCar racingCar : racingCars) {
                System.out.println(racingCar.getCarName()+": ");
            }
            System.out.println();
        }

    }
}
