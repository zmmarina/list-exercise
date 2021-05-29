package com.zmonteiro;

import com.zmonteiro.entities.Temperature;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Temperature> temperatures = new ArrayList<>();

        System.out.println("Please, enter the temperatures of the last six months:");

        for(int i = 0; i < 6; i++){
            Double temperature = sc.nextDouble();
            temperatures.add(new Temperature(temperature, i + 1));
        }

        Iterator<Temperature> iteratorSum = temperatures.iterator();
        Double sum = 0.0;
        while(iteratorSum.hasNext()){
            Double next = iteratorSum.next().getValue();
            sum += next;
        }

        Double avgTemp = sum / temperatures.size();

        List<Temperature> higherTemps = new ArrayList<>(temperatures);

        for(Temperature tempBelowAvg : temperatures){
            if(tempBelowAvg.getValue() < avgTemp){
               higherTemps.remove(tempBelowAvg);
            }
        }

        Temperature.printTemperatures(higherTemps);

        sc.close();

        }

    }

