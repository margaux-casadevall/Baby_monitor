package models;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class Patient {
    @BsonProperty("id")
    private String id;
    private String hospital;
    private Date dateAdmitted;
    private String doctor;
    private ArrayList<GlucoseLevel> glucoseLevels;
    private ArrayList<GlucoseLevel> glucoseLevelsHP;
    private ArrayList<Comment> comments;
    private double lowerThreshold;
    private double upperThreshold;

    public Patient() {
        this.glucoseLevels = new ArrayList<>();
        this.glucoseLevelsHP = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public Date getDateAdmitted() {
        return dateAdmitted;
    }

    public void setDateAdmitted(Date dateAdmitted) {
        this.dateAdmitted = dateAdmitted;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public ArrayList<GlucoseLevel> getGlucoseLevels() {return glucoseLevels;}

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setGlucoseLevels(ArrayList<GlucoseLevel> glucoseLevels) {
        this.glucoseLevels = glucoseLevels;
    }

    public ArrayList<GlucoseLevel> getGlucoseLevelsHP() {return glucoseLevelsHP;}

    public void setGlucoseLevelsHP(ArrayList<GlucoseLevel> glucoseLevels) {
        this.glucoseLevelsHP = glucoseLevels;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public double getUpperThreshold() {
        return upperThreshold;
    }

    public void setUpperThreshold(Double value) {
        this.upperThreshold = value;
    }

    public double getLowerThreshold() {
        return lowerThreshold;
    }

    public void setLowerThreshold(Double value) {
        this.lowerThreshold = value;
    }
}