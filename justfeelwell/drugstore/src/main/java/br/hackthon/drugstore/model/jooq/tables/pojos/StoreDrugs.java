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
public class StoreDrugs implements Serializable {

    private static final long serialVersionUID = -1252992730;

    private Long idStore;
    private Long idDrug;

    public StoreDrugs() {}

    public StoreDrugs(StoreDrugs value) {
        this.idStore = value.idStore;
        this.idDrug = value.idDrug;
    }

    public StoreDrugs(
        Long idStore,
        Long idDrug
    ) {
        this.idStore = idStore;
        this.idDrug = idDrug;
    }

    public Long getIdStore() {
        return this.idStore;
    }

    public void setIdStore(Long idStore) {
        this.idStore = idStore;
    }

    public Long getIdDrug() {
        return this.idDrug;
    }

    public void setIdDrug(Long idDrug) {
        this.idDrug = idDrug;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StoreDrugs (");

        sb.append(idStore);
        sb.append(", ").append(idDrug);

        sb.append(")");
        return sb.toString();
    }
}
