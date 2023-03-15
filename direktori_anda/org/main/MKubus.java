package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+ kubus.hitungLuasAlas());
        System.out.println("volume kubus dengan panjang sisis 4 satuan : "+ kubus.hitungVolume());
    } 
}