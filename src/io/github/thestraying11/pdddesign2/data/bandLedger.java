package io.github.thestraying11.pdddesign2.data;

import io.github.thestraying11.pdddesign2.headBand;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class bandLedger {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy kk:mm:ss z");
    private final client bogusClient;
    private ArrayList<headBand> bandList;

    public bandLedger(int availableBands) {
        this.bandList = new ArrayList<>();
        this.bogusClient = new client.clientBuilder(
                "", "", "", "",
                ZonedDateTime.parse("25/01/01 07:00:00 UTC", formatter), false, false,
        new questionnaire("", 0, "", "")).build();
        
        for (int i = 0; i < availableBands; i++) {
            bandList.add(new headBand(75, false, ZonedDateTime.now(), false, this.bogusClient));
        }
    }

    public void setBandList(ArrayList<headBand> bandList) {
        this.bandList = bandList;
    }

    public ArrayList<headBand> getBandList() {
        return bandList;
    }

    public headBand getHeadBand(int id) {
        return this.bandList.get(id);
    }

    public void setHeadBand(int id, headBand headBand) {
        this.bandList.set(id, headBand);
    }
    
    public void addHeadbands(int num) {
        for (int i = 0; i < num; i++) {
            this.bandList.add(new headBand(75, false, ZonedDateTime.now(), false, this.bogusClient));
        }
    }
}
