package com.company;

public class CountryPopulation {
    private String NationID;
    public String getNationID() { return  this.NationID; }
    public void setNationID(String NationID) { this.NationID = NationID;}

    private String Nation;
    public String getNation() { return  this.Nation; }
    public void setNation(String Nation) { this.Nation = Nation;}

    private Integer YearID;
    public Integer getYearID() { return  this.YearID; }
    public void setYearID(Integer YearID) { this.YearID = YearID;}

    private Integer Year;
    public Integer getYear() { return  this.Year; }
    public void setYear(Integer Year) { this.Year = Year;}

    private Integer Population;
    public Integer getPopulation() { return  this.Population; }
    public void setPopulation(Integer Population) { this.Population = Population;}

    private String SlugNation;
    public String getSlugNation() { return  this.SlugNation; }
    public void setSlugNation(String SlugNation) { this.SlugNation = SlugNation;}

    public CountryPopulation(String nationID, String nation, Integer yearID, Integer year, Integer population, String slugNation) {
        NationID = nationID;
        Nation = nation;
        YearID = yearID;
        Year = year;
        Population = population;
        SlugNation = slugNation;
    }

    @Override
    public String toString() {
        return "CountryPopulation{" +
                "NationID=" + NationID +
                ", Nation='" + Nation + '\'' +
                ", YearID=" + YearID +
                ", Year=" + Year +
                ", Population=" + Population +
                ", SlugNation='" + SlugNation + '\'' +
                '}';
    }
}
