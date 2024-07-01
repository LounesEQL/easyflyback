package ai115.formation.eql.entity.dto;

import java.time.LocalDate;

public class AircraftAddDto {


    private String immatriculation;
    private String type;
    private String model;
    private String picture;
    private int HdV;
    private LocalDate dateImmatriculation;


    public String getImmatriculation() {return immatriculation;}
    public String getType() {return type;}
    public String getModel() {return model;}
    public String getPicture() {return picture;}
    public int getHdV() {return HdV;}
    public LocalDate getDateImmatriculation() {return dateImmatriculation;}
}
