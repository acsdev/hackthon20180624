/*
 * This file is generated by jOOQ.
 */
package br.hackthon.drugstore.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Drug implements Serializable {

    private static final long serialVersionUID = 417996561;

    private Long   idDrug;
    private String dsName;
    private String dsDescription;

    public Drug() {}

    public Drug(Drug value) {
        this.idDrug = value.idDrug;
        this.dsName = value.dsName;
        this.dsDescription = value.dsDescription;
    }

    public Drug(
        Long   idDrug,
        String dsName,
        String dsDescription
    ) {
        this.idDrug = idDrug;
        this.dsName = dsName;
        this.dsDescription = dsDescription;
    }

    public Long getIdDrug() {
        return this.idDrug;
    }

    public void setIdDrug(Long idDrug) {
        this.idDrug = idDrug;
    }

    public String getDsName() {
        return this.dsName;
    }

    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    public String getDsDescription() {
        return this.dsDescription;
    }

    public void setDsDescription(String dsDescription) {
        this.dsDescription = dsDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Drug (");

        sb.append(idDrug);
        sb.append(", ").append(dsName);
        sb.append(", ").append(dsDescription);

        sb.append(")");
        return sb.toString();
    }
}