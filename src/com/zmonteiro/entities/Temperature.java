package com.zmonteiro.entities;

import java.util.List;

public class Temperature {
    private Double value;
    private Integer name;

    public Temperature(){}

    public Temperature(Double value, Integer name) {
        this.value = value;
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public static void printTemperatures (List<Temperature> temperaturesList) {
        for (Temperature higherTemperatures : temperaturesList) {
            int month = higherTemperatures.getName();
            switch (month) {
                case 1:
                    System.out.println(
                            "Temperature: " + higherTemperatures.getValue()
                                    + " Month: " + higherTemperatures.getName() + " - January");
                    break;
                case 2:
                    System.out.println(
                            "Temperature: " + higherTemperatures.getValue()
                                    + " Month: " + higherTemperatures.getName() + " - February");
                    break;
                case 3:
                    System.out.println(
                            "Temperature: " + higherTemperatures.getValue()
                                    + " Month: " + higherTemperatures.getName() + " - March");
                    break;
                case 4:
                    System.out.println(
                            "Temperature: " + higherTemperatures.getValue()
                                    + " Month: " + higherTemperatures.getName() + " - April");
                    break;
                case 5:
                    System.out.println(
                            "Temperature: " + higherTemperatures.getValue()
                                    + " Month: " + higherTemperatures.getName() + " - May");
                    break;
                case 6:
                    System.out.println(
                            "Temperature: " + higherTemperatures.getValue()
                                    + " Month: " + higherTemperatures.getName() + " - June");
                    break;

                default:
                    System.out.println("Sorry... Please, try again.");
            }
        }
    }
}
