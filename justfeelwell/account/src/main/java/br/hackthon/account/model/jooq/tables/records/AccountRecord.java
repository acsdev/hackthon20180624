/*
 * This file is generated by jOOQ.
 */
package br.hackthon.account.model.jooq.tables.records;


import br.hackthon.account.model.jooq.tables.Account;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record10<Long, Long, String, String, String, Date, String, String, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 1406636233;

    /**
     * Setter for <code>account.account.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>account.account.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>account.account.nr_identity</code>.
     */
    public void setNrIdentity(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>account.account.nr_identity</code>.
     */
    public Long getNrIdentity() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>account.account.ds_usename</code>.
     */
    public void setDsUsename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>account.account.ds_usename</code>.
     */
    public String getDsUsename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>account.account.ds_password</code>.
     */
    public void setDsPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>account.account.ds_password</code>.
     */
    public String getDsPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>account.account.ds_name</code>.
     */
    public void setDsName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>account.account.ds_name</code>.
     */
    public String getDsName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>account.account.dt_birth</code>.
     */
    public void setDtBirth(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>account.account.dt_birth</code>.
     */
    public Date getDtBirth() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>account.account.ds_email</code>.
     */
    public void setDsEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>account.account.ds_email</code>.
     */
    public String getDsEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>account.account.ds_address</code>.
     */
    public void setDsAddress(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>account.account.ds_address</code>.
     */
    public String getDsAddress() {
        return (String) get(7);
    }

    /**
     * Setter for <code>account.account.vl_latitude</code>.
     */
    public void setVlLatitude(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>account.account.vl_latitude</code>.
     */
    public BigDecimal getVlLatitude() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>account.account.vl_longitude</code>.
     */
    public void setVlLongitude(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>account.account.vl_longitude</code>.
     */
    public BigDecimal getVlLongitude() {
        return (BigDecimal) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, String, String, String, Date, String, String, BigDecimal, BigDecimal> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, String, String, String, Date, String, String, BigDecimal, BigDecimal> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Account.ACCOUNT_.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Account.ACCOUNT_.NR_IDENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Account.ACCOUNT_.DS_USENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Account.ACCOUNT_.DS_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Account.ACCOUNT_.DS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return Account.ACCOUNT_.DT_BIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Account.ACCOUNT_.DS_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Account.ACCOUNT_.DS_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return Account.ACCOUNT_.VL_LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return Account.ACCOUNT_.VL_LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getNrIdentity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDsUsename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDsPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component6() {
        return getDtBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDsEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDsAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getVlLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getVlLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getNrIdentity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDsUsename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDsPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getDtBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDsEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDsAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getVlLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getVlLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value2(Long value) {
        setNrIdentity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value3(String value) {
        setDsUsename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value4(String value) {
        setDsPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value5(String value) {
        setDsName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value6(Date value) {
        setDtBirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value7(String value) {
        setDsEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value8(String value) {
        setDsAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value9(BigDecimal value) {
        setVlLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value10(BigDecimal value) {
        setVlLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord values(Long value1, Long value2, String value3, String value4, String value5, Date value6, String value7, String value8, BigDecimal value9, BigDecimal value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT_);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(Long id, Long nrIdentity, String dsUsename, String dsPassword, String dsName, Date dtBirth, String dsEmail, String dsAddress, BigDecimal vlLatitude, BigDecimal vlLongitude) {
        super(Account.ACCOUNT_);

        set(0, id);
        set(1, nrIdentity);
        set(2, dsUsename);
        set(3, dsPassword);
        set(4, dsName);
        set(5, dtBirth);
        set(6, dsEmail);
        set(7, dsAddress);
        set(8, vlLatitude);
        set(9, vlLongitude);
    }
}
