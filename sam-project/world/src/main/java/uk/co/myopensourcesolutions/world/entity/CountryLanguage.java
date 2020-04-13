package uk.co.myopensourcesolutions.world.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "CountryLanguage")
public class CountryLanguage {
    @EmbeddedId
    private CountryLanguageIdentity countryLanguageIdentity;
    @Column(name = "IsOfficial")
    private String isOfficial;
    @Column(name = "Percentage")
    private BigDecimal percentage;

    public CountryLanguageIdentity getCountryLanguageIdentity() {
        return countryLanguageIdentity;
    }

    public void setCountryLanguageIdentity(CountryLanguageIdentity countryLanguageIdentity) {
        this.countryLanguageIdentity = countryLanguageIdentity;
    }

    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
}
