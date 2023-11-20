package com.example.googlemapspractice;

import java.util.HashMap;
import java.util.Map;


public class Data {
    Map<String, State> states = new HashMap<String, State>();

    public Data() {
        initStateData();
    }

    private void initStateData() {
        State alabama = new State("Alabama",4.0, 87.1, 98.2, 68.2,
                100.2, 88.1, 89.5, 95.2, 53050, 0.05);
        states.put("Alabama", alabama);

        State alaska = new State("Alaska",0.0, 125.5, 131.8, 120.0,
                138.4, 121.0, 151.7, 120.5, 70638, 0.00);
        states.put("Alaska", alaska);

        State arizona = new State("Arizona",5.6, 108.0,101.8,	127.2,
                99.4,101.3,92.4,	98.7, 60997, 0.045);
        states.put("Arizona", arizona);

        State arkansas = new State("Arkansas",6.5, 90.7, 92.5,	78.4,
                100.1, 89.7,	84.2,	100.6, 49747, 0.055);
        states.put("Arkansas", arkansas);

        State california = new State("California",7.25, 138.7,	112.3,	194.0,
                122.4, 124.4,	109.7,110.0, 78937, 0.133);
        states.put("California", california);

        State colorado = new State("Colorado", 2.9, 105.2,	100.8,	115.7,
                83.9,	112.2,	97.9,	104.2, 66825, 0.0455);
        states.put("Colorado", colorado);

        State connecticut = new State("Connecticut", 6.35, 115.4,	99.1,	121.5,
                127.3,	112.1,	108.1,	116.4, 75919, 0.0699);
        states.put("Connecticut", connecticut);

        State delaware = new State("Delaware", 0, 105.4,	106.4,	103.7,
                94.1,	117.5,	109.6,	106.8, 63458, 0.066);
        states.put("Delaware", delaware);

        State florida = new State("Florida", 6.0, 104.5,	106.4,	112.2,
                99.0,	97.7,	98.0,	100.2, 53972, 0.0);
        states.put("Florida", florida);

        State georgia = new State("Georgia", 4.0, 88.9,	96.4,	77.7,
                90.0,	89.4,	96.5,	94.8, 59917, 0.0575);
        states.put("Georgia", georgia);

        State hawaii = new State("Hawaii", 4.0, 186.0,	148.5,	307.0,
                134.6,	128.3,	120.3,	124.1, 59399, 0.11);
        states.put("Hawaii", hawaii);

        State idaho = new State("Idaho", 6.0, 98.9,	95.6,	102.3,
                79.2,	114.8,	93.0,	100.7, 54251, 0.06);
        states.put("Idaho", idaho);

        State illinois = new State("Illinois",6.25, 91.9,	100.5,	81.7,
                94.6,	104.3,	96.0,	92.8, 69293, 0.0495);
        states.put("Illinois", illinois);

        State indiana = new State("Indiana", 7.0, 90.2,	94.5,	76.8,
                107.6,	94.8,	97.5,	93.3, 59280, 0.0399);
        states.put("Indiana", indiana);

        State iowa = new State("Iowa", 6.0, 88.2,	98.0,	70.6,
                95.5,	95.4,	98.9,	94.9, 54747, 0.0853);
        states.put("Iowa", iowa);

        State kansas = new State("Kansas", 6.5, 87.3,	94.3,	72.0,
                98.7,	96.3,	101.1,	91.0, 58269, 0.057);
        states.put("Kansas", kansas);

        State kentucky = new State("Kentucky", 6.0, 92.8,	92.5,	75.7,
                105.4,	105.9,	77.0,	105.4, 53318, 0.05);
        states.put("Kentucky", kentucky);

        State louisiana = new State("Louisiana", 4.45, 93.5,	98.8,	85.2,
                88.3,	96.0,	100.4,	99.2, 54647, 0.0425);
        states.put("Louisiana", louisiana);

        State maine = new State("Maine", 5.5, 114.5,	103.2,	119.8,
                113.7,	111.5,	128.7,	127.4, 53998, 0.0715);
        states.put("Maine", maine);

        State maryland = new State("Maryland",6, 124.1,	112.2,	157.0,
                106.9,	103.0,	94.4,	112.4, 70171, 0.0575);
        states.put("Maryland", maryland);

        State massachusetts = new State("Massachusetts", 6.25, 149.9,	113.0,	217.3,
                121.2,	134.0,	113.8,	120.6, 79830, 0.05);
        states.put("Massachusetts", massachusetts);

        State michigan = new State("Michigan", 6.0, 91.7,	92.3,	82.1,
                98.2,	98.5,	95.8,	96.8, 58961, 0.0425);
        states.put("Michigan", michigan);

        State minnesota = new State("Minnesota", 6.875, 95.1,	97.4,	83.5,
                95.6,	100.8,	109.0,	102.2, 64901, 0.0985);
        states.put("Minnesota", minnesota);

        State mississippi = new State("Mississippi", 7.0, 84.5,	91.9,	68.5,
                88.5,	92.6,	99.5,	91.2, 45674, 0.05);
        states.put("Mississippi", mississippi);

        State missouri = new State("Missouri",4.225, 90.1,	96.8,	80.4,
                94.2,	97.8,	91.2,	92.8, 57199, 0.054);
        states.put("Missouri", missouri);

        State montana = new State("Montana", 0, 105.3,	100.8,	115.7,
                83.9,	111.2,	97.9,	104.2, 50757, 0.0675);
        states.put("Montana", montana);

        State nebraska = new State("Nebraska", 5.5, 91.1,	96.9,	81.6,
                88.8,	102.1,	99.3,	94.2, 59932, 0.0684);
        states.put("Nebraska", nebraska);

        State nevada = new State("Nevada", 6.85, 101.9,	104.6,	112.9,
                98.3,	112.2,	93.4,	89.0, 55002, 0.0);
        states.put("Nevada", nevada);

        State newHampshire = new State("New Hampshire", 0.0, 114.7,	104.6,	107.4,
                113.7,	111.5,	128.7,	127.4, 67046, 0.0);
        states.put("New Hampshire", newHampshire);

        State newJersey = new State("New Jersey", 6.625, 114.0,	107.0,	133.5,
                106.4,	111.4,	96.5,	103.7, 74249, 0.1075);
        states.put("New Jersey", newJersey);

        State newMexico = new State("New Mexico", 5.0, 93.8,	96.8,	87.3,
                88.4,	101.0,	103.0,	97.4, 53305, 0.059);
        states.put("New Mexico", newMexico);

        State newYork = new State("New York", 4.0, 135.7,	109.2,	194.1,
                100.6,	105.6,	103.1,	114.9, 80772, 0.109);
        states.put("New York", newYork);

        State northCarolina = new State("North Carolina", 4.750, 96.9,	98.4,	94.0,
                93.2,	90.4,	110.9,	99.9, 58705, 0.0499);
        states.put("North Carolina", northCarolina);

        State northDakota = new State("North Dakota", 5.0, 97.4,	103.5,	88.2,
                104.7,	101.5,	110.5,	98.2, 60165, 0.029);
        states.put("North Dakota", northDakota);

        State ohio = new State("Ohio", 5.75, 89.4,	100.8,	71.1,
                92.4,	95.6,	94.4,	98.5, 59491, 0.0399);
        states.put("Ohio", ohio);

        State oklahoma = new State("Oklahoma", 4.5, 86.7,	94.7,	72.4,
                95.0,	91.4,	91.5,	92.2, 56002, 0.0475);
        states.put("Oklahoma", oklahoma);

        State oregon = new State("Oregon", 0, 122.2,	106.4,	156.1,
                91.3,	125.1,	109.2,	108.0, 63536, 0.099);
        states.put("Oregon", oregon);

        State pennsylvania = new State("Pennsylvania", 6.0, 98.2,	102.9,	89.4,
                104.4,	106.1,	100.1,	100.1, 65216, 0.0307);
        states.put("Pennsylvania", pennsylvania);

        State rhodeIsland = new State("Rhode Island", 7.0, 111.2,	96.3,	113.8,
                123.5,	110.8,	101.6,	114.3, 61755, 0.0599);
        states.put("Rhode Island", rhodeIsland);

        State southCarolina = new State("South Carolina", 6.0, 96.3,	101.4,	89.5,
                108.6,	88.0,	96.8,	98.3, 53345, 0.07);
        states.put("South Carolina", southCarolina);

        State southDakota = new State("South Dakota", 4.5, 96.1,	100.4,	99.6,
                91.9,	89.5,	98.6,	92.6, 58870, 0.0);
        states.put("South Dakota", southDakota);

        State tennessee = new State("Tennessee", 7.0, 90.3,	94.4,	84.0,
                94.7,	91.2,	87.8,	93.3, 59520, 0.0);
        states.put("Tennessee", tennessee);

        State texas = new State("Texas", 6.25, 92.6,	91.0,	84.8,
                105.9,	91.9,	94.8,	96.8, 63881, 0.0);
        states.put("Texas", texas);

        State utah = new State("Utah", 4.85, 102.0,	99.5,	105.0,
                92.1,	110.3,	93.5,	103.0, 58683, 0.0495);
        states.put("Utah", utah);

        State vermont = new State("Vermont", 6.0, 116.4,	106.8,	129.5,
                122.0,	121.3,	109.6,	106.3, 52720, 0.0875);
        states.put("Vermont", vermont);

        State virginia = new State("Virginia", 4.3, 102.1,	96.3,	108.3,
                100.1,	94.1,	102.7,	101.4, 67249, 0.0575);
        states.put("Virginia", virginia);

        State washington = new State("Washington", 6.5, 114.0,	107.0,	133.5,
                106.4,	111.4,	96.5,	103.7, 78428, 0.0);
        states.put("Washington", washington);

        State westVirginia = new State("West Virginia", 6.0, 89.8,	96.3,	76.9,
                91.7,	104.7,	97.1,	94.0, 52066, 0.065);
        states.put("West Virginia", westVirginia);

        State wisconsin = new State("Wisconsin", 5.0, 93.9,	97.0,	84.4,
                105.6,	95.2,	110.1,	95.3, 58961, 0.0765);
        states.put("Wisconsin", wisconsin);

        State wyoming = new State("Wyoming", 4.0, 91.66,	101.4,	80.4,
                81.7,	96.4,	98.2,	98.6, 55961, 0.0);
        states.put("Wyoming", wyoming);
    }
}
