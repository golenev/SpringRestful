package com.golenev.spingrrestful.spingrrestful.entity;

public class Product{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public boolean isBad() {
        return isBad;
    }

    public void setBad(boolean bad) {
        isBad = bad;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getContraindications() {
        return contraindications;
    }

    public void setContraindications(String contraindications) {
        this.contraindications = contraindications;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    private int id;
    private boolean isActive;
    private int code;
    private int regionId;
    private int languageId;
    private boolean isBad;
    private String composition;
    private String contraindications;
    private String description;
    private String descriptionShort;

    public Product(int id, boolean isActive, int code, int regionId, int languageId, boolean isBad, String composition, String contraindications, String description, String descriptionShort) {
        this.id = id;
        this.isActive = isActive;
        this.code = code;
        this.regionId = regionId;
        this.languageId = languageId;
        this.isBad = isBad;
        this.composition = composition;
        this.contraindications = contraindications;
        this.description = description;
        this.descriptionShort = descriptionShort;
    }
    public Product (){

    }

}