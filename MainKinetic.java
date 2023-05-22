/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Belajar1;

/**
 *
 * @author Erwan
* 22104410039
* Teknik Informatika
 */
import java.util.Scanner;

public class MainKinetic {
    double massa, kecepatan;

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getMassa() {
        return massa;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainKinetic kinetik = new MainKinetic();

        System.out.print("Masukkan massa sepeda (kg): ");
        kinetik.setMassa(scanner.nextDouble());

        System.out.print("Masukkan kecepatan sepeda (m/s): ");
        kinetik.setKecepatan(scanner.nextDouble());

        double energiKinetik = kinetik.hitungEnergiKinetik();
        System.out.println("Energi kinetik sepeda: " + energiKinetik + " Joule");

        scanner.close();
    }
}


//Rumus MTK Golek ko Internet
//KE = 0.5 * massa * kecepatan^2
//Dalam hal ini, massa sepeda Andika adalah 20 kg dan kecepatannya adalah 2 m/s. Mari kita masukkan nilainya ke dalam rumus:
//KE = 0.5 * 20 kg * (2 m/s)^2
//= 0.5 * 20 kg * 4 m^2/s^2
//= 0.5 * 20 kg * 4
//= 0.5 * 80
//= 40 joule
