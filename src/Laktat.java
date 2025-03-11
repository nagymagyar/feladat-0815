/*
* File: Laktat.java
* Author: Zsitnyák Ádám,
* Copyright: 2025, Zstinyák Ádám
* Group: Szoft N
* Date: 2025-03-11
* Github: https://github.com/nagymagyar
*/


import java.time.LocalDate;

public class Laktat {
    private String nev;
    private String varos;
    private String hazszam;
    private LocalDate szulido;


    
    {

    }
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
    public String getVaros() {
        return varos;
    }
    public void setVaros(String varos) {
        this.varos = varos;
    }
    public String getHazszam() {
        return hazszam;
    }
    public void setHazszam(String hazszam) {
        this.hazszam = hazszam;
    }
    public LocalDate getSzulido() {
        return szulido;
    }
    public void setVege(LocalDate szulido) {
        this.szulido = szulido;
    }
}
